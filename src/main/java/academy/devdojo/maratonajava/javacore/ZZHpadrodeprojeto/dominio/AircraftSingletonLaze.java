package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonLaze {
    private static AircraftSingletonLaze INSTANCE;
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonLaze(String nome) {
        this.name = nome;

    }

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    public static AircraftSingletonLaze getINSTANCE() {
        if (INSTANCE == null) {
            synchronized (AircraftSingletonLaze.class) {
                INSTANCE = new AircraftSingletonLaze("787-900");
            }
            return INSTANCE;


        }
        return null;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}