package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest05 {
    public static void main(String[] args) {
        List<String> palavras = List.of("Comu","Comu","Mi","Fa");
        String[] letters = palavras.get(0).split("");
        System.out.println(Arrays.toString(letters));

        List<String[]>collect = palavras.stream().map(p->p.split("")).collect(Collectors.toList());
        Stream<String> stream = Arrays.stream(letters);
       List<String> letters2 =  palavras.stream()
        .map(p->p.split(""))//Stream<String[]>
        .flatMap(Arrays::stream)//Stream<String>
                .collect(Collectors.toList());
        System.out.println(letters2);
    }
}
