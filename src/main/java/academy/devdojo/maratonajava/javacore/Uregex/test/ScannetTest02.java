package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.Scanner;

public class ScannetTest02 {
    public static void main(String[] args) {
     String texto = "Ikki,Shiry,Hyoga, Shun";
        Scanner scanner = new Scanner(texto);
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            if(scanner.hasNext()){
                int i = scanner.nextInt();
                System.out.println("Int: " +i);

            }
            else if(scanner.hasNextBoolean()){
                boolean b = scanner.nextBoolean();
                System.out.println("Boolean "+b);
            }else{
                System.out.println(scanner.next());
            }

        }


    }

}
