package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MetodoReferenceTest02 {
    public static void main(String[] args) {
        AnimeComparators animeComparators  = new AnimeComparators();
        List <Anime>animeList = new ArrayList<>(List.of(new Anime("CDZ", 175),
                new Anime("SAilor Moon", 100),
                new Anime("Shurato", 78)));
        animeList.sort(animeComparators::compareByEpisodesNonStatic);
        animeList.sort((a1,a2)-> animeComparators.compareByEpisodesNonStatic(a1,a2));
        System.out.println(animeList);
    }
}
