package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterneMatcherTest05 {
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
        String regex ="([a-zA-Z09\\._-]+)@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String texto = "mgneto@gmail.com, 132maryaj@gmail.com.br, #@!shunrey@email.com, marin@mail";
        System.out.println("Email valido");

        System.out.println("#@!shunrey@email.com".matches(regex));
        System.out.println(texto.split(",")[1].trim());
      // String texto2 = "12 0X 0X 0XFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        System.out.println("Texto "+texto);
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
