package academy.devdojo.maratonajava.javacore.ZZClambda.dominio;

public class Anime {
    private String title;
    private int episodios;

    public Anime(String title, int quantity) {
        this.title = title;
        this.episodios = quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getEpisodios() {
        return episodios;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", episodios=" + episodios +
                '}';
    }
}
