package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterneMatcherTest04 {
    public static void main(String[] args) {

        // \d = toodos os digitos
        // \D tudo o que não é digito
        //\s todos os espaços em branco : \t \n \f \r
        // \S Tdos os caracteres excluindo  os brancos
        // \w a-ZA-Z, dígitos
        // \W tudo o que não for inclusi no \w
        //[]

        //? zero ou uma, * zero ou mais, +um ou maiz
        //{n,m} de n até m
        //()
        //|
        //$ fim da linah
       // String regex ="[a-zA-C] ";
        // . 1.3 = 123,133,1@3,1A3
        String regex ="0[xX][0-9a-fA-F]+\\s|$ ";
      //  String texto = "abaab";
       String texto2 = "12 0X 0X 0XFFABC 0x10G 0x1";
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
