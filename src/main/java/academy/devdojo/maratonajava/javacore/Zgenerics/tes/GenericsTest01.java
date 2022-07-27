package academy.devdojo.maratonajava.javacore.Zgenerics.tes;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    public static void main(String[] args) {
        //type erasure
        List<String> lista = new ArrayList<>();
        lista.add("Midoya");
        lista.add("Midoya");

        for (String o :lista){
            System.out.println(o);

        }
        add(lista, new Consumidor(2l,"Midoya"));
        for (String o :lista){
            System.out.println(o);
        }
    }
    private static void add(List lista, Consumidor consumidor){
        lista.add(consumidor);
    }
}
