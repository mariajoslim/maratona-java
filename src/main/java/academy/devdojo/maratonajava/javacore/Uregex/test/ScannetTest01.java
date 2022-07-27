package academy.devdojo.maratonajava.javacore.Uregex.test;

public class ScannetTest01 {
    public static void main(String[] args) {
     String texto = "Ikki,Shiry,Hyoga, Shun";
     String[] nomes = texto.split(",");
     for(String nome:nomes){
         System.out.println(nome.trim());
     }

    }

}
