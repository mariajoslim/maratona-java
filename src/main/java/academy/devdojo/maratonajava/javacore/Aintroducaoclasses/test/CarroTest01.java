package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car = new Carro();
        Carro car2 = new Carro();
        car.nome = "Wolksvagen";
        car.modelo = "Gol";
        car.ano = 1989;
        car2.nome = "Fiat";
        car2.modelo = "147";
        car2.ano = 1980;
        System.out.println(car.nome+", "+car.modelo+", "+car.ano+".");
        System.out.println(car2.nome+", "+car2.modelo+", "+car2.ano+".");





    }
}
