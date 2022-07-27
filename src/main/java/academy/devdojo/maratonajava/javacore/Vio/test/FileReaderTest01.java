package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;

import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File arquivo = new File("file.txt");
        try (FileReader fr = new FileReader(arquivo)){
        char[] in = new char[1000];
            int size = fr.read(in);
            System.out.println(size);
            for(char c: in){
                System.out.println(c);
              }
            //int i;
          //  while ((i=fr.read())!=1){
          //      System.out.println((char)i);
           // }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}