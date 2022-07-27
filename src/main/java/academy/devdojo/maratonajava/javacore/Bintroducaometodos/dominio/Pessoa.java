package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String name){
        nome = name;
    }
    public void setIdade(int age){
        if (age<0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = age;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }


}

