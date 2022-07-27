package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Mangas> mangas = new HashSet<>(6);
        mangas.add(new Mangas(5L, "CDZ", 19.9));
        mangas.add(new Mangas(4L, "Sailor moon", 29.9));
        mangas.add(new Mangas(3L, "Jiraya", 3.2));
        mangas.add(new Mangas(2L, "Shurato", 11.9));
        mangas.add(new Mangas(1L, "Jiban", 3.5));
        for (Mangas manga : mangas) {
            System.out.println(mangas);
        }
    }
}
