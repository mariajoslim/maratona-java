package academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.test;

import academy.devdojo.maratonajava.javacore.Eblocosdeinicializacao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime des = new Anime();
        for (int episodio : des.getEpisodios()) {
            System.out.println(episodio+ " ");
            
        }

    }
}
