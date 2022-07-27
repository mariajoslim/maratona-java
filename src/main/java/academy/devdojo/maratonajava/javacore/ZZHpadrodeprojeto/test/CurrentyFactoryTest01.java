package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.Currency;
import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.CurrencyFactory;
import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.Paises;

public class CurrentyFactoryTest01 {
    public static void main(String[] args) {
      Currency currency =  CurrencyFactory.newCurrency(Paises.BRAZIL);

        System.out.println(currency.getSymbol());
    }
}
