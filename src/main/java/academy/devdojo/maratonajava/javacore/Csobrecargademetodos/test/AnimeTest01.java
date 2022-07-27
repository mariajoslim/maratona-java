package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.test;

import academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime desenho = new Anime();
        desenho.init("SAilor Moon","TV",30, "Ação");

        desenho.imprimeAnimee();
       // desenho.setGenero("Ação");

       /* desenho.setNome("CDZ");
        desenho.setTipo("MAngá");
        desenho.setEpisodios(104);
        System.out.println(desenho.getTipo());
        System.out.println(desenho.getEpisodios());
        System.out.println(desenho.getNome());*/

    }
}
