package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import java.util.ArrayList;
import java.util.List;

public class ListaTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes1 = new ArrayList<>(16);
        nomes.add("MAtriX");
        nomes.add("DeveDojo Academy");
        nomes1.add("Neo");
        nomes1.add("Trinity");
        nomes.addAll(nomes1);
        //System.out.println(nomes.remove("MAtrix"));


        for(Object nome:nomes){
            System.out.println(nomes);
        }
        nomes.add("NeoTrinuity");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        int size = nomes.size();
        for(int i= 0; i<nomes.size(); i++){
            System.out.println(nomes.get(i));
        }
        System.out.println(nomes);
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
    }
}
