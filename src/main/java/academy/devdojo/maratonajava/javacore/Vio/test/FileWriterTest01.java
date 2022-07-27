package academy.devdojo.maratonajava.javacore.Vio.test;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File arquivo = new File("file.txt");

            try {
                FileWriter fw = new FileWriter(arquivo,true);
                fw.write("DevDojo o melhor curso do Brasil\nContinuando a balela na pŕoxma linha");
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



}

