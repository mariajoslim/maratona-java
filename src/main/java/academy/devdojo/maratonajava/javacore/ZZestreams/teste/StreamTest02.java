package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("DNZ",10.2),
            new LightNovel("Cdz",18.2),
            new LightNovel("SAilor moom",3.2),
            new LightNovel("kim possible",13.45),
            new LightNovel("3 espias demais",4.2))
    );

    public static void main(String[] args) {
        List<String> titles = lightNovels.stream()
                .sorted(Comparator.comparing(LightNovel::getYiyle))
        .filter(ln->ln.getPrice()<=4)
                .limit(3)
                .map(LightNovel::getYiyle)
                .collect(Collectors.toList());
        System.out.println(titles );
    }
}
