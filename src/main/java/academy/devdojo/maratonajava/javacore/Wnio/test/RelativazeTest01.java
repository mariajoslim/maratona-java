package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativazeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/maria");
        Path clazz = Paths.get("/home/maria/mario/Olamundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absolute1 = Paths.get("/home/maria");
        Path absolute2 = Paths.get("/usr/local");
        Path absolute3 = Paths.get("/home/maria/mario/Olamundo.java");
        Path absolute4 = Paths.get("temp");
        Path absolute5 = Paths.get("/temp/temp.2016963");

        System.out.println("1"+absolute1.relativize(absolute3));
        System.out.println("2"+absolute3.relativize(absolute1));
        System.out.println("3"+absolute1.relativize(absolute2));
        System.out.println("4"+absolute1.relativize(absolute2));
        System.out.println("5"+absolute1.relativize(absolute1));


    }
}
