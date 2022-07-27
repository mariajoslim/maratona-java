package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaByIdComparator mangaByIdComparator = new MangaByIdComparator();
        List<Mangas> mangas = new ArrayList<>(6);
        mangas.add(new Mangas(5L, "CDZ", 19.9));
        mangas.add(new Mangas(4L, "Sailor moon", 29.9));
        mangas.add(new Mangas(3L, "Jiraya", 3.2));
        mangas.add(new Mangas(2L, "Shurato", 11.9));
        mangas.add(new Mangas(1L, "Jiban", 3.5));
        Collections.sort(mangas);
        mangas.sort(mangaByIdComparator);
        for (Mangas manga : mangas) {
            System.out.println(mangas);
        }
        Mangas mangaSearch = new Mangas(2L, "DZB",13.99);
        System.out.println(Collections.binarySearch(mangas, mangaSearch, mangaByIdComparator));
    }
}
