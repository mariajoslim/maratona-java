package academy.devdojo.maratonajava.javacore.ZZClambda.test;


import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambda.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MetodoReferenceTest01 {
    public static void main(String[] args) {


        List <Anime>animeList = new ArrayList<>(List.of(new Anime("CDZ", 175), new Anime("SAilor Moon", 100), new Anime("Shurato", 78)));
      animeList.sort( (a1,a2)->a1.getTitle().compareTo(a2.getTitle()));
       animeList.sort( AnimeComparators::compareByTitle);
        animeList.sort( AnimeComparators::compareByEpisodes);
        System.out.println(animeList);
    }
}