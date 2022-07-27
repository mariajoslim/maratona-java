package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio;

import java.util.HashSet;
import java.util.Set;

public enum AircraftSingletonEnun {
    INSTANCE;
    private final Set<String> availableSeats;

    AircraftSingletonEnun() {
        this.availableSeats = new HashSet<>();
        this.availableSeats.add("1A");
        this.availableSeats.add("1B");

    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }
}
