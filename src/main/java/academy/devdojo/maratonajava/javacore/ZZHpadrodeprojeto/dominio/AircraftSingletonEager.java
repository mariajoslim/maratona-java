package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public class AircraftSingletonEager {
    private static final AircraftSingletonEager INSTANCE = new AircraftSingletonEager("787-900");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    private AircraftSingletonEager(String nome) {
        this.name = nome;

    }
    {
    availableSeats.add("1A");
    availableSeats.add("1B");
}

    public static AircraftSingletonEager getINSTANCE(){
return INSTANCE;

}


    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}