package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.AircraftSingletonEnun;

public class AircraftSingletonEnunTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");


    }
    private static void bookSeat(String seat){
            System.out.println(AircraftSingletonEnun.INSTANCE.hashCode());
        AircraftSingletonEnun instance = AircraftSingletonEnun.INSTANCE;

        System.out.println(instance.bookSeat(seat));
    }
}
