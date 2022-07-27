package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.Pessoa;

public class BuilderPaternTest01 {
    public static void main(String[] args) {
        Pessoa p =  new Pessoa.PersonBuilder()
                .firstName("Maria")
                .lastName("Lima")
                .emailName("mjpaal@oi.com")
                .userName("mjpaal")
                .build();

    }
}
