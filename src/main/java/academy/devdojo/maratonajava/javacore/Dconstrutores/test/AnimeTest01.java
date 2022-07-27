package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime desenho = new Anime("SAilor Moon","TV",30, "Ação", "Air berthrichers");
        Anime desenho2 = new Anime();

        //desenho.init("SAilor Moon","TV",30, "Ação");

        desenho.imprimeAnimee();
        //desenho2.imprimeAnimee();
       // desenho.setGenero("Ação");

       /* desenho.setNome("CDZ");
        desenho.setTipo("MAngá");
        desenho.setEpisodios(104);
        System.out.println(desenho.getTipo());
        System.out.println(desenho.getEpisodios());
        System.out.println(desenho.getNome());*/

    }
}
