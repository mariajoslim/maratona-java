package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("CDZ");
        mangas.add("SHurato");
        mangas.add("sailor moon");
        mangas.add("Jiraya");
        mangas.add("Dragon Ball Z");

        Collections.sort(mangas);


        List<Double>dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);


            Collections.sort(dinheiros);

        for(String manga: mangas){
            System.out.println(mangas);
        }
        System.out.println(dinheiros);

    }
}
