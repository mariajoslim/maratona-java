package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.test;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE); //referente public static final doublr velovidade limite
       // System.out.println(car.VELOCIDADE_LIMITE);
        System.out.println(car.COMPRADOR);
        car.COMPRADOR.setNome("Mario Neto");
        System.out.println(car.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Enzo");
        ferrari.imprime();
    }
}
