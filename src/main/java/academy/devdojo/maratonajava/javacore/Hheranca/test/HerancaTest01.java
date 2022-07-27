package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("37260000");
        Pessoa pessoa = new Pessoa("MArin de Aguia");
        pessoa.setCpf("018452");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        Funcionario func = new Funcionario("Shiryu");
        func.setCpf("2222");
        func.setEndereco(endereco);
        func.setSalario(2000);
        func.imprime();






    }
}
