package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Aluno {
    private String nome;
    private int idade;
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
}
