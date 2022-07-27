package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RunExceptionTest02 {
    public static void main(String[] args) throws IOException {
       // try{
            divisao(18, 0);

      //  }catch(RuntimeException e){
          //  e.printStackTrace();
      //  }
        System.out.println("Código finslizado");
    }

    public static int divisao(int a, int b) throws IOException{
        if (b == 0) {
            throw new IllegalArgumentException("Não existe divisão por 0");


        }
        return a / b;
    }
}
