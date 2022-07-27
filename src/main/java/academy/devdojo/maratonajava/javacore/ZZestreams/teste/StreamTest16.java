    package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static academy.devdojo.maratonajava.javacore.ZZestreams.dominio.Categoria.DRAMA;
import static java.util.stream.Collectors.*;

public class StreamTest16 {


    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 100_000_000;
        sumFor(num);
        sumStreamIterate(num);
        sumParallelStream(num);
        sumLongtream( num);
        sumpParallelLongtream(num);


        }
    private static void sumFor(long num){
        System.out.println("Sum for");
        long result = 0;
        long init = System.currentTimeMillis();
        for(long i = 1;i<=num;i++){
            result +=1;

        }
        long end = System.currentTimeMillis();
        System.out.println(result+"  "+(end- init)+ "ms");
    }

    private static void sumStreamIterate(long num){
        System.out.println("Sum StringIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).limit(num).reduce(0l, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+"  "+(end- init)+ "ms");
    }


    private static void sumParallelStream(long num){
        System.out.println("Sum StringIterate");
        long init = System.currentTimeMillis();
        long result = Stream.iterate(1L, i -> i+1).parallel().limit(num).reduce(0l, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+"  "+(end- init)+ "ms");
    }

    private static void sumLongtream(long num){
        System.out.println("Sum longIterate");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1l,num).reduce(0l,Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result+"  "+(end- init)+ "ms");




}
    private static void sumpParallelLongtream(long num) {
        System.out.println("Sum sumpParallelLongtream");
        long init = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1l, num).parallel().reduce(0l, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + "  " + (end - init) + "ms");
    }
    }

