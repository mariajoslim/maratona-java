package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest01 {
    public static void main(String[] args) {
        File arquivo = new File("file.txt");

        try
                (FileWriter fw = new FileWriter(arquivo,true);
            BufferedWriter br= new BufferedWriter(fw)){
            br.write("DevDojo o melhor curso do Brasil\nContinuando a balela na pŕoxma linha");
            br.newLine();
            br.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

