package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
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


        List<Mangas> mangaConsumidor1List = List.of(manga1,manga2, manga3);
        List<Mangas> mangaConsumidor2List = List.of(manga0,manga);
        Map<Consumidor, List<Mangas>> consumidorMangasMap = new HashMap<>();
        consumidorMangasMap.put(consumidor,mangaConsumidor1List);
        consumidorMangasMap.put(consumidor0,mangaConsumidor2List);

        for (Map.Entry<Consumidor, List<Mangas>> entry:consumidorMangasMap.entrySet()) {
            System.out.println("#################"+entry.getKey().getNome());
            for(Mangas mangas: entry.getValue()){
                System.out.println("$$$$$$$$$$$$$$$$$$$"+mangas.getNome());
            
        }




        }

    }
}
