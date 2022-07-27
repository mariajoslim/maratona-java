package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaByIdComparator implements Comparator<Mangas> {


    @Override
    public int compare(Mangas mangas1, Mangas mangas2) {
        //return mangas1.getId().compareTo(mangas2.getId());
        return 0;
    }
}

public class MangasTest01 {
    public static void main(String[] args) {
        List<Mangas> mangas = new ArrayList<>(6);
        mangas.add(new Mangas(5L, "CDZ", 19.9));
        mangas.add(new Mangas(4L, "Sailor moon", 29.9));
        mangas.add(new Mangas(3L, "Jiraya", 3.2));
        mangas.add(new Mangas(2L, "Shurato", 11.9));
        mangas.add(new Mangas(1L, "Jiban", 3.5));
        for (Mangas manga : mangas) {
            System.out.println(mangas);
        }
        Collections.sort(mangas);
        System.out.println("**************************************************************************************************");
        for (Mangas manga : mangas
        ) {
            System.out.println(manga);


        }
        //Collections.sort(mangas, new MangaByIdComparator());
        mangas.sort(new MangaByIdComparator());
        System.out.println("**************************************************************************************************");
        for (Mangas manga : mangas
        ) {
            System.out.println(manga);


        }

    }

}
