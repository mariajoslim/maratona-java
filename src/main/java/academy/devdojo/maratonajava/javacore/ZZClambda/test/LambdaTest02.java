package academy.devdojo.maratonajava.javacore.ZZClambda.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String>strings = List.of("Mitso","Massa", "Kido");
        List<Integer> integers = map(strings,String ::length);
        List<String>map = map(strings,String :: toUpperCase);

        System.out.println(integers);

    }
    private static<T, R>List<R>map(List<T> list, Function<T,R> function){
        List<R> result = new ArrayList<>();
        for (T e:list) {
            R r = function.apply(e);
            result.add(r);

            
        }
        return  result;


    }
}
