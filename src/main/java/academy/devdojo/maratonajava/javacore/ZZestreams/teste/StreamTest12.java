package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria.DRAMA;

public class StreamTest12 {

        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("DNZ",10.2, DRAMA),
                new LightNovel("Cdz",18.2,Categoria.FANTASY),
                new LightNovel("SAilor moom",3.2,Categoria.ROMANCE),
                new LightNovel("kim possible",13.45,Categoria.FANTASY),
                new LightNovel("3 espias demais",4.2, DRAMA))
        );
    public static void main(String[] args) {
        Map<Categoria,List<LightNovel>>categoryLightNoveMap = new HashMap<>();
        List<LightNovel> fantasy= new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel>  romance = new ArrayList<>();
        for(LightNovel lightNovel:lightNovels){
            switch(lightNovel.getCategoria()){
                case DRAMA : drama.add(lightNovel);break;
                case FANTASY : fantasy.add(lightNovel);break;
                case ROMANCE : romance.add(lightNovel);break;
            }
        }
        categoryLightNoveMap.put(Categoria.DRAMA, drama);
        categoryLightNoveMap.put(Categoria.FANTASY, fantasy);
        categoryLightNoveMap.put(Categoria.ROMANCE, romance);
        System.out.println(categoryLightNoveMap );
        Map<Categoria, List<LightNovel>>collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategoria));
        System.out.println(collect);


    }
}
