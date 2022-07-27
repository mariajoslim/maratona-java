package academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadoresestaticos.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro car = new Carro("Gol Quadrado",280);
        Carro car2 = new Carro("Elba", 260);
        Carro car3 = new Carro("Escort", 290);
        Carro.setVelocidadeLimite(160);
        car.imprime();
        car2.imprime();
        car3.imprime();

                }
}


