package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("PC", 5800);

        Tomate toma = new Tomate("Americano", 6);
        toma.setDataVAlidade("11/02/2023");
        CalculadoraImposto.calcularImposto(toma);
        System.out.println(",,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,");
        CalculadoraImposto.calcularImposto(produto);
    }
}
