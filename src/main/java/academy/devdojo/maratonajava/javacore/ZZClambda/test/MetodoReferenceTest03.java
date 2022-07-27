package academy.devdojo.maratonajava.javacore.ZZClambda.test;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MetodoReferenceTest03 {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>(List.of("Marin","June","Shina"));
        list.sort(String::compareTo);
        System.out.println(list);
        Function<String,Integer> numStringtoInteger = Integer::parseInt;
        Integer num = numStringtoInteger.apply("10");
        System.out.println(num);
        BiPredicate<List<String>,String>checkName = List::contains;
        System.out.println(checkName.test(list,"Marin"));
    }
}
