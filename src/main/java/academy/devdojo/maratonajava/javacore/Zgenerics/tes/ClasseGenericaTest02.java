package academy.devdojo.maratonajava.javacore.Zgenerics.tes;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.servico.BarcoRentavelService;



public class ClasseGenericaTest02 {
    public static void main(String[] args) {

        BarcoRentavelService barcorentavelService = new BarcoRentavelService();
        Barco barco = barcorentavelService.buscarBarcosDisponivel();
        System.out.println("Usando um carro por mês");
        barcorentavelService.retornarBarcosAlugado(barco) ;

    }
}
