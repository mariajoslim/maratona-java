package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

    }
    public static void criarNovoArquivo(){
         File file = new File("arquivo\\test.txt");
         try {
            boolean isCriado =  file.createNewFile();
             System.out.println("Arquivo"+isCriado);

         }catch(IOException e) {//nem que s vscs tossa nuncs eixe esse método de excessão vazio, nunca coloca regra de negócio só excessoes
             e.printStackTrace();

         }
         }
    }
