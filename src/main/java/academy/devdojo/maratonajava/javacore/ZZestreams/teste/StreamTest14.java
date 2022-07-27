package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Promotion;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria.DRAMA;
import static java.util.stream.Collectors.groupingBy;

public class StreamTest14 {

        private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
                new LightNovel("DNZ",10.2, DRAMA),
                new LightNovel("Cdz",18.2,Categoria.FANTASY),
                new LightNovel("SAilor moom",3.2,Categoria.ROMANCE),
                new LightNovel("kim possible",13.45,Categoria.FANTASY),
                new LightNovel("3 espias demais",4.2, DRAMA))
        );
    public static void main(String[] args) {
    Map<Categoria, Long>collect = lightNovels.stream().collect(groupingBy(LightNovel::getCategoria, Collectors.counting()));
        System.out.println(collect);

        Map<Categoria, Optional<LightNovel>>collect1 = lightNovels.stream().collect(groupingBy(LightNovel::getCategoria, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));
        System.out.println(collect1);
       Map<Categoria,LightNovel>collect2 =  lightNovels.stream().collect(groupingBy(LightNovel::getCategoria,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),Optional::get)));
        System.out.println(collect2);

        //Map<Categoria,LightNovel>collect3 =  lightNovels.stream().collect(groupingBy(LightNovel::getCategoria,Collectors.toMap(LightNovel::getCategoria, Function.identity(), BinaryOperator.maxBy(Comparator.comparing(LightNovel::getPrice))));
       // System.out.println(collect3);
    }
}
