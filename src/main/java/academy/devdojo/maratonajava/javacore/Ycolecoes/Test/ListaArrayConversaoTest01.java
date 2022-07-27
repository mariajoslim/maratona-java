package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
         numeros.add(1);
         numeros.add(2);
         numeros.add(3);
       Integer[] listToArray =  numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0]= 1;
        numerosArray[1]= 2;
        numerosArray[3]= 3;

        List<Integer>arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("#3333333333333333333333333333333333333333333333333333333333333333");
        List<Integer>numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);


        List<String> strings = Arrays.asList("1", "2");
      //  List<String> strings1 = List.of("1", "2");
    }
}
