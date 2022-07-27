package academy.devdojo.maratonajava.javacore.Minterfaces.test;


import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {


        DatabaseLoader dbLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        dbLoader.load();
        dbLoader.remove();
        dbLoader.checkPermission();
        dbLoader.retrieveDataSize();
        DatabaseLoader.retrieveDataSize();
        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
    }
}
