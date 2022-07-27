package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;

import java.util.*;

public class IteracaoTest01 {
    public static void main(String[] args) {
        Set<Mangas> mangas = new LinkedHashSet<>();
        mangas.add(new Mangas(5L, "CDZ", 19.9,0));
        mangas.add(new Mangas(4L, "Sailor moon", 29.9,5));
        mangas.add(new Mangas(3L, "Jiraya", 3.2,0));
        mangas.add(new Mangas(2L, "Shurato", 11.9,2));
        mangas.add(new Mangas(1L, "Jiban", 3.5,0));

        //Iterator<Mangas> mangaIterator = mangas.iterator();
        //while(mangaIterator.hasNext()){
          //  Mangas manga = mangaIterator.next();
            //if(manga.getQuantidade() == 0){
              //  mangaIterator.remove();

            //}
        //}
        mangas.removeIf(manga->manga.getQuantidade()==0);
        System.out.println(mangas);
    }
}
