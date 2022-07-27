package academy.devdojo.maratonajava.javacore.Zgenerics.tes;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.CArroRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Gol"),new Carro( "Vernona")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Navio"),new Barco( "Canoa")));
        RentalService<Carro> rentalServiceC = new RentalService<>(carrosDisponiveis);
       //RentalService<Barco> rentalService = new RentalService<>(barcosDisponiveis);
        Carro carro = rentalServiceC.buscarObjetosDisponivel();
        System.out.println("Usando um carro por mês");
        rentalServiceC.retornarObjetoAlugado(carro);
        System.out.println("*****************************************************");

        RentalService<Barco> rentalServiceB = new RentalService<>(barcosDisponiveis);
        Barco barco= rentalServiceB.buscarObjetosDisponivel();
        System.out.println("Usando um carro por mês");
        rentalServiceB.retornarObjetoAlugado(barco);
    }
}
