package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.LoginInvalidoException;
import academy.devdojo.maratonajava.javacore.Oexception.exception.dominio.Pessoa;

public class SobrescritaComExption01 {
    public static void main(String[] args) {
        Pessoa people = new Pessoa();
        Funcionario func = new Funcionario();
        try {
            func.salvar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }
}
