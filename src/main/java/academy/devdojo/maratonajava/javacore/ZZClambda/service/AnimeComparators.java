package academy.devdojo.maratonajava.javacore.ZZClambda.service;

import academy.devdojo.maratonajava.javacore.ZZClambda.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2){
        return a1.getTitle().compareTo(a2.getTitle());
    }
    public  static int compareByEpisodes(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodios(),a2.getEpisodios());
    }


    public   int compareByEpisodesNonStatic(Anime a1, Anime a2){
        return Integer.compare(a1.getEpisodios(),a2.getEpisodios());
    }
}
