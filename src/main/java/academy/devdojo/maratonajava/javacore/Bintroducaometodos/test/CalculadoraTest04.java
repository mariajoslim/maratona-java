package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest04 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        Calculadora calc = new Calculadora();
        calc.altera(num1,num2);

        System.out.println("Teste calculadora 04" );
        System.out.println(num1);
        System.out.println(num2);
    }
}
