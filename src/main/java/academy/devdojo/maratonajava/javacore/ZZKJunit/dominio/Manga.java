package academy.devdojo.maratonajava.javacore.ZZKJunit.dominio;

import java.util.Objects;

public record Manga(String name, int episodes) {
    Objects.requireNonNull(name);
}
