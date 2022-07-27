package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio;

public class CurrencyFactory {
    public static Currency newCurrency(Paises paises){
        switch(paises){
            case USA :return new UsDollar();
            case BRAZIL : return new Real();
            default: throw new IllegalArgumentException("No currenty found the country");
        }

    }
}
