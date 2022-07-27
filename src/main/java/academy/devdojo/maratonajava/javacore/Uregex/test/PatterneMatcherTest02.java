package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterneMatcherTest02 {
    public static void main(String[] args) {

        // \d = toodos os digitos
        // \D tudo o que não é digito
        //\s todos os espaços em branco : \t \n \f \r
        // \S Tdos os caracteres excluindo  os brancos
        // \w a-ZA-Z, dígitos
        // \W tudo o que não for inclusi no \w
        String regex ="\\W  ";
      //  String texto = "abaab";
       String texto2 = "ma02ri@4  02*a2505mai85o";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto "+texto2);
        System.out.println("Índice:123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.println(matcher.start()+""+matcher.group()+"\n");

        }
        }
}
