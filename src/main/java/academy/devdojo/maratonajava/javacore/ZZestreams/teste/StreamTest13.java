package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria.DRAMA;

public class StreamTest13 {

        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("DNZ",10.2, DRAMA),
                new LightNovel("Cdz",18.2,Categoria.FANTASY),
                new LightNovel("SAilor moom",3.2,Categoria.ROMANCE),
                new LightNovel("kim possible",13.45,Categoria.FANTASY),
                new LightNovel("3 espias demais",4.2, DRAMA))
        );
    public static void main(String[] args) {
    Map<Promotion,List<LightNovel>>    collect = lightNovels
               .stream()
               .collect(Collectors.groupingBy(ln->{
                   return ln.getPrice()<6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE;

               }));
    //Map<CAtegoria, Map<Promtotion>, List<LightNovel>>>
        Map<Categoria,Map<Promotion,List<LightNovel>>>  collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria,Collectors.groupingBy(ln->
            ln.getPrice()<6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        )));
        System.out.println(collect1);

    }

}
