package academy.devdojo.maratonajava.javacore.Zgenerics.servico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class BarcoRentavelService {
    private List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("lancha"),new Barco("Iate")));

    public Barco buscarBarcosDisponivel(){
        System.out.println("Buscando barcos disponível");
        Barco barcos= barcosDisponiveis.remove(0);
        System.out.println("Algugando barcos "+barcos);
        System.out.println("Barcos disponiveis para alugar");
        System.out.println(barcosDisponiveis);
        return barcos;
    }

    public void retornarBarcosAlugado(Barco barcos){
        System.out.println("Devolvendo barcos "+barcos);
        barcosDisponiveis.add(barcos);
        System.out.println("Barcos disponiveis para alugar");
        System.out.println(barcosDisponiveis);
    }
}
