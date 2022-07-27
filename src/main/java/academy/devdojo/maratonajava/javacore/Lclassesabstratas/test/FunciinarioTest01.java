package academy.devdojo.maratonajava.javacore.Lclassesabstratas.test;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FunciinarioTest01 {
    public static void main(String[] args) {

        Gerente gerente = new Gerente("Shaicna", 35);
        System.out.println(gerente);
        Desenvolvedor dev = new Desenvolvedor("June", 22);
        System.out.println(dev);
        gerente.imprime();
        dev.imprime();
    }
}
