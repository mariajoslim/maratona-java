package academy.devdojo.maratonajava.javacore.ZZDOptional.dominio;

public class Manga {
    private Integer id;
    private String title;
    private int chapters;

    public Manga(Integer id, String title, int chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }
}
