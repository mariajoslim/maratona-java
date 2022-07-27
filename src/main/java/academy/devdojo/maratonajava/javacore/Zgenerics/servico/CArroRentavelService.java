package academy.devdojo.maratonajava.javacore.Zgenerics.servico;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;

import java.util.ArrayList;
import java.util.List;

public class CArroRentavelService   {
    private List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"),new Carro("Fusca")));

    public Carro buscarCarrosDisponivel(){
        System.out.println("Buscando carro disponível");
        Carro carro= carrosDisponiveis.remove(0);
        System.out.println("Algugando carro "+carro);
        System.out.println("CArros disponiveis para alugar");
        System.out.println(carrosDisponiveis);
        return carro;
    }

    public void retornarCarroAlugado(Carro carro){
        System.out.println("Devolvendo CArro "+carro);
        carrosDisponiveis.add(carro);
        System.out.println("CArros disponiveis para alugar");
        System.out.println(carrosDisponiveis);
    }
}
