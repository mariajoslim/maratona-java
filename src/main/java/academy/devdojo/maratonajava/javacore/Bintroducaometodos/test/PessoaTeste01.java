package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
      //  pessoa.nome = "Maria Jose";
        //pessoa.idade = 33;
        pessoa.imprime();
        pessoa.setNome("Maria Jose");
        pessoa.setIdade(33);
        System.out.println( pessoa.getNome());
        System.out.println(pessoa.getIdade());


    }
}
