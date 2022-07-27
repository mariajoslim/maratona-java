package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituraTecladoTest02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ogrende software de previsão do futuro");
        System.out.println("Digite sua pergunta que eu direi sim ou não");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0)==' '){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }

    }
}
