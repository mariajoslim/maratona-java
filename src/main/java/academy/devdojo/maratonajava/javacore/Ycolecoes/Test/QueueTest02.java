package academy.devdojo.maratonajava.javacore.Ycolecoes.Test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Mangas;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Mangas>mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());

        mangas.add(new Mangas(5L, "CDZ", 19.9));
        mangas.add(new Mangas(4L, "Sailor moon", 29.9));
        mangas.add(new Mangas(3L, "Jiraya", 3.2));
        mangas.add(new Mangas(2L, "Shurato", 11.9));
        mangas.add(new Mangas(1L, "Jiban", 3.5));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());
        }
    }


}
