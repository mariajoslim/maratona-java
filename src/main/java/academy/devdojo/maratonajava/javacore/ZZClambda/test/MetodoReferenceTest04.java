package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MetodoReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators>newAnimeComparator = AnimeComparators::new;
        AnimeComparators animeComparators = newAnimeComparator.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("CDZ", 175),
                new Anime("SAilor Moon", 100),
                new Anime("Shurato", 78)));
        System.out.println(animeList);

        BiFunction<String,Integer, Anime>animeBiFunction = (title,episodes) -> new Anime(title,episodes);
        BiFunction<String,Integer, Anime>animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super campeoes",36));
    }
}
