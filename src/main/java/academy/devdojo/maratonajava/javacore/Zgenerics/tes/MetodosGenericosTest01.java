package academy.devdojo.maratonajava.javacore.Zgenerics.tes;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.ArrayList;
import java.util.List;

public class MetodosGenericosTest01 {
    public static void main(String[] args) {
        List<Barco> barcoList = criarArrayComUmObjeto(new Barco("Canoa MArota"));
        System.out.println(barcoList);


    }

        private static <T> List<T>criarArrayComUmObjeto(T t){
            return List.of(t);

            //private static <T extends Comparable<T>> List<T>criarArrayComUmObjeto(T t){
                //return List.of(t);
    }
}
