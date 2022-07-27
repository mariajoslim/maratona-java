package academy.devdojo.maratonajava.javacore.ZZb.dominio;

public class Car {
    private String nome;
    private String color;
    private int year;

    public Car(String nome, String color, int year) {
        this.nome = nome;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
