package academy.devdojo.maratonajava.javacore.ZZestreams.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>>devdojo = new ArrayList<>();
        List<String>graphicsDesigners = List.of("Wildnei Suanee"," MAria Jose Lima","Guilherme Almeida");
        List<String>developers = List.of("Mateus"," Elton Saláfia","Thiago Almeida");
        List<String> students = List.of("Tatiane CArdoso"," Hela MArafeli","Marcela Almeida");
        devdojo.add(graphicsDesigners);
        devdojo.add(developers);
        devdojo.add(students);

        for (List<String> people: devdojo) {
            for(String person: people){
                System.out.println(person);
            }

        }

        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        devdojo.stream().flatMap(Collection::parallelStream).forEach(System.out::println);
    }
}
