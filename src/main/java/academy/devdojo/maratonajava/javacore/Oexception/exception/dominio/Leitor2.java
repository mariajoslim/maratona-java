package academy.devdojo.maratonajava.javacore.Oexception.exception.dominio;

import java.io.IOException;
import java.io.Closeable;


public class Leitor2 implements Closeable {
    @Override
    public void close() throws IOException {
        System.out.println("Fechando leitor 2");

    }
}
