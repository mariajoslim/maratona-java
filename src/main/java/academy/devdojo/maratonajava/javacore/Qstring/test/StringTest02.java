package academy.devdojo.maratonajava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome= "Terezinha";
        String numeros = "12344";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("e","i"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.length());
        System.out.println(nome.substring(0,2));
        System.out.println(nome.substring(3,nome.length()));
        System.out.println(nome.trim());
    }
}
