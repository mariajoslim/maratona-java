package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterneMatcherTest01 {
    public static void main(String[] args) {
        String regex = "ab";
      //  String texto = "abaab";
        String texto2 = "ababa";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto "+texto2);
        System.out.println("Índice:123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.println(matcher.start()+"");

        }
        }
}
