package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade =(int)33000000000l;//casting fazendo o long caber no int. não recomendado
        long numerogrande = (long)155.2;
        double salarioDouble = 2000.0;
        float salarioFloat = 2500.0f;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro =  true;
        boolean falso = false;
        char caracter = '\u0041';
        String nome = "Ikki";
        String nome1="Com uma gota do Teusangue eu serei curada, serei libertada. As Suas Santas chagas vem a vitória";
        System.out.println("Idade de Cristo  " +idade+ "  anos");
        System.out.println("Verdadeiro "+verdadeiro);
        System.out.println(caracter);
        System.out.println(idade);
        System.out.println(numerogrande);
        System.out.println(nome);


    }
}
