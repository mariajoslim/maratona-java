package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    public void imprimeAnimee(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo= tipo;
        this.episodios = episodios;
    }
    public void init(String nome, String tipo, int episodios, String genero){
       this.init(nome, tipo, episodios);
       this.genero = genero;
    }

public void setNome(String name){
        this.nome = name;
}
public String getNome(){
        return this.nome;
}
    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public int getEpisodios(){
        return episodios;
    }
    public void setGenero(String genr){
        this.genero = genr;
    }
    public String getGenero(){
        return genero;
    }
}
