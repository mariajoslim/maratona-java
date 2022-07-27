package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.DoubleStream;

public class StreamTest08 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("DNZ",10.2),
            new LightNovel("Cdz",18.2),
            new LightNovel("SAilor moom",3.2),
            new LightNovel("kim possible",13.45),
            new LightNovel("3 espias demais",4.2))
    );
    public static void main(String[] args) {
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price>3)
                .reduce(Double::sum)
                .ifPresent(System.out::println);

        double sum = lightNovels.stream() //Stream<Double>
                .mapToDouble((LightNovel::getPrice))
                .filter(price -> price>3)
                .sum();


    }
}
