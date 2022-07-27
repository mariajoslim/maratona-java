package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterneMatcherTest03 {
    public static void main(String[] args) {

        // \d = toodos os digitos
        // \D tudo o que não é digito
        //\s todos os espaços em branco : \t \n \f \r
        // \S Tdos os caracteres excluindo  os brancos
        // \w a-ZA-Z, dígitos
        // \W tudo o que não for inclusi no \w
        //[]
       // String regex ="[a-zA-C] ";
        String regex ="0[xX][0-9a-fA-F] ";
      //  String texto = "abaab";
       String texto2 = "12 0X 0X 0XFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto "+texto2);
        System.out.println("Índice:123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while(matcher.find()){
            System.out.println(matcher.start()+""+matcher.group()+"\n");

        }
        int numHexa = 0X59F86A;
        System.out.println(numHexa);
        }
}
