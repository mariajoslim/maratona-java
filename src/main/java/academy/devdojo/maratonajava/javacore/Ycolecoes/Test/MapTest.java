package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor(3L,"Maria Jose");
        Consumidor consumidor0 = new Consumidor(1L,"Mario Freitas");
        System.out.println(consumidor0);
        System.out.println(consumidor);

        Mangas manga = new Mangas(5L, "CDZ", 19.9);
        Mangas manga0 = new Mangas(4L, "Sailor moon", 29.9);
        Mangas manga1 = new Mangas(3L, "Jiraya", 3.2);
        Mangas manga2 = new Mangas(2L, "Shurato", 11.9);
        Mangas manga3 = new Mangas(1L, "Jiban", 3.5);

        Map<Consumidor, Mangas> consumidorMangas = new HashMap<>();
        consumidorMangas.put(consumidor,manga0);
        consumidorMangas.put(consumidor0,manga3);
        for (Map.Entry<Consumidor,Mangas> entry: consumidorMangas.entrySet()
             ) {
            System.out.println(entry.getKey().getNome()+" "+entry.getValue().getNome());
            
        }

    }
}
