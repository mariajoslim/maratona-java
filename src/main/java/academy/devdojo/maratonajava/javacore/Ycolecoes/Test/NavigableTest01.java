package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smatphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;


class SmartphoneMarcaComparador implements Comparator<Smatphone>{
    public int compare(Smatphone s1, Smatphone s2){
        return s1.getMarca().compareTo(s2.getMarca());
    }
}

class MangaPrecoComparator implements Comparator<Mangas>{
    @Override
    public int compare(Mangas o1, Mangas o2){
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}
public class NavigableTest01 {
    public static void main(String[] args) {
        NavigableSet<Smatphone> set = new TreeSet<>(new SmartphoneMarcaComparador());
        Smatphone celular = new Smatphone("123","Nokia");
        set.add(celular);
        System.out.println(set);
        NavigableSet<Mangas>mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Mangas(5L, "CDZ", 19.9));
        mangas.add(new Mangas(4L, "Sailor moon", 29.9));
        mangas.add(new Mangas(3L, "Jiraya", 3.2));
        mangas.add(new Mangas(2L, "Shurato", 11.9));
        mangas.add(new Mangas(1L, "Jiban", 3.5));
        for (Mangas mangas1 : mangas.descendingSet()) {
            System.out.println(mangas1);
            //lower <
            //floor <=
            //higher >
            //ceiling
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        Mangas yuyu = new Mangas(1l, "yuyu hakusho",10.5, 5);
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(mangas.size());
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
