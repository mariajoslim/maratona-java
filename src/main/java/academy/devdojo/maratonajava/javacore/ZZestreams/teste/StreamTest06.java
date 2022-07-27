package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("DNZ",10.2),
            new LightNovel("Cdz",18.2),
            new LightNovel("SAilor moom",3.2),
            new LightNovel("kim possible",13.45),
            new LightNovel("3 espias demais",4.2))
    );

    public static void main(String[] args) {
        System.out.println(lightNovels.stream().anyMatch(ln ->ln.getPrice()>9 ));
        System.out.println(lightNovels.stream().allMatch(ln ->ln.getPrice()>0));
        System.out.println(lightNovels.stream().noneMatch(ln ->ln.getPrice()<0));
        lightNovels.stream()
                .filter(ln->ln.getPrice()>3)
                .findAny()
                .ifPresent(System.out::println);
        lightNovels
                .stream()
                .filter(ln->ln.getPrice()>3)
                .sorted(Comparator.comparing(LightNovel::getPrice))
                .findFirst()
                .ifPresent(System.out::println);


    }
}
