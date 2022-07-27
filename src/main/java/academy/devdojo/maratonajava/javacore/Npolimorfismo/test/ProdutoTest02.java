package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen9", 3000);//tipo mais geenrico produto fazendo referencia a um mais especifico computador
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calculaImposto());
        System.out.println("*****************************");
        Produto produto2 = new Tomate("NOrmal", 3.00);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calculaImposto());
    }
}
