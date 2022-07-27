package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC 10i7", 110000);
        Tomate tomate = new Tomate("Tomate Andrea", 8.99);
        Televisao tv = new Televisao("Telefunken 20 \" ",200.00);
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("*******************************************");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("//////////////////////////////////////////");
        CalculadoraImposto.calcularImposto(tv);
    }
}
