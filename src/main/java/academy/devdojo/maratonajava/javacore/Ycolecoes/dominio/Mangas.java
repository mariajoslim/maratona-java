package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

import java.util.Objects;

public class Mangas  implements Comparable<Mangas> {
    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Mangas(Long id, String nome, double preco){
        Objects.requireNonNull(id,"Id naõ pode ser nulo");
        Objects.requireNonNull(nome, "Nome não pode ser nulo");
        Objects.requireNonNull(preco, "preço não pode ser nulo");
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Mangas(Long id, String nome, double preco, int quantidade) {
        this(id,nome,preco);
        this.quantidade = quantidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mangas mangas = (Mangas) o;
        return Objects.equals(id, mangas.id) && Objects.equals(nome, mangas.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Mangas{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Mangas outroManga) {
        //negativo se this <outroManga
        //se this==outroManga return 0
        //positivo se this > outroMAnga
       // if(this.id<outroManga.getId()){
         //   return -1;
        //}
       // else if(this.equals(outroManga.getId())){
          //  return 0;
       // }else{
          //  return 1;
       // }
        //return Double.valueOf(preco,outroManga.getNome);
       // return this.id.compareTo(outroManga.getId());
       // return Double.compare(preco,outroManga.getId());
        return this.nome.compareTo(outroManga.getNome());
    }
}

