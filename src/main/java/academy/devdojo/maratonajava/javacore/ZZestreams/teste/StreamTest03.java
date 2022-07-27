package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("DNZ",10.2),
            new LightNovel("Cdz",18.2),
            new LightNovel("SAilor moom",3.2),
            new LightNovel("kim possible",13.45),
            new LightNovel("3 espias demais",4.2))
    );

    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();
        lightNovels.forEach(System.out::println);
        long count = stream.filter(ln->ln.getPrice()<=4).count();
        //long count1 = stream.distinct().filter(ln->ln.getPrice()<=4).count();
        System.out.println(count);
       // System.out.println(count1);
}}
