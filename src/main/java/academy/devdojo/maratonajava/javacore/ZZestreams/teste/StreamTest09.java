package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.Paths.*;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(1,50).filter(n->n % 2==0).forEach(n-> System.out.print(n+""));
        System.out.println();
        IntStream.range(1,50).filter(n->n % 2==0).forEach(n-> System.out.println(n+""));
        System.out.println();
        Stream.of("Faça","Elevar","o","Cosmo","do seu coração")
                .map(String::toUpperCase)
                .forEach(s-> System.out.print(s+""));

        int num [] ={1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);
        try(Stream<String>lines = Files.lines(get("file.txt"))){
           lines.filter(l->l.contains("Java")).forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
