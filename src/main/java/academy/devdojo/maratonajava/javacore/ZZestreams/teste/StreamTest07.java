package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> inteiros= List.of(1,2,3,4,5,6,7,8,9,0);
        inteiros.stream().reduce((x,y)->x+y).ifPresent(System.out::println);
        System.out.println( inteiros.stream().reduce(0,(x,y)->x+y));

        System.out.println("############################################");
        inteiros.stream().reduce(Integer::sum).ifPresent(System.out::println);
        System.out.println(inteiros.stream().reduce(0,Integer::sum));

        System.out.println("/////////////////////////////////////////////");
        inteiros.stream().reduce((x,y)->x*y).ifPresent(System.out::println);
        System.out.println( inteiros.stream().reduce(2,(x,y)->x*y));

        System.out.println("*********************************************");

        inteiros.stream().reduce((x,y)->x>y? x:y).ifPresent(System.out::println);
        System.out.println( inteiros.stream().reduce(0,Integer::max));
    }
}
