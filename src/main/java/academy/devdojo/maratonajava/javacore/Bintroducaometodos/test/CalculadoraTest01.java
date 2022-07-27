package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somarDoisNumeros();
        calc.subtraiDoisNumeros();
        System.out.println("Finalizando cáculo");
    }
}
