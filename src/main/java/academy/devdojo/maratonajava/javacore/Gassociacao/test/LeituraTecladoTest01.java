package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome= teclado.nextLine();
        System.out.println( nome);
        int idade = teclado.nextInt();
        System.out.println(idade);
        System.out.println( "Digite F ou Me para sexo");
         char sexo =   teclado.next().charAt(0);
        System.out.println("___________________________");
        System.out.println("Nome "+nome );
        System.out.println("Idade "+idade );
        System.out.println("Sexo "+sexo);



    }
}
