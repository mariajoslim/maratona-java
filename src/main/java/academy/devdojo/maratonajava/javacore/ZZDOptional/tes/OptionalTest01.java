package academy.devdojo.maratonajava.javacore.ZZDOptional.tes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String>o1 = Optional.of("Em tudo dai graças");
        Optional<String>o2 = Optional.ofNullable(null);
        Optional<String>o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("************************************************");

        Optional<String> nameOptional = filemane("Maria");
        String empty = nameOptional.orElse("EMPTY");
        System.out.println(empty);
        nameOptional.ifPresent(s-> System.out.println(s.toUpperCase()));


    }
    private static Optional<String> filemane(String nome){
        List<String>list = List.of("Maria Jose","SAbores de Minas");
        int i = list.indexOf(nome);
        if(i!=0){
            return Optional.of(list.get(i));
        }
return Optional.empty();
    }
}
