package academy.devdojo.maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;

@Builder
public class Anime {
    Integer id;
    String name;
    int episodes;
    Producer producer;

}
