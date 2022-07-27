package academy.devdojo.maratonajava.javacore.Zgenerics;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.CArroRentavelService;

public class ClasseGenericaTest01 {
    public static void main(String[] args) {

        CArroRentavelService carrorentavelService = new CArroRentavelService();
        Carro carro = carrorentavelService.buscarCarrosDisponivel();
        System.out.println("Usando um carro por mês");
        carrorentavelService.retornarCarroAlugado(carro);

    }
}
