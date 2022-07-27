package academy.devdojo.maratonajava.javacore.ZZb.interfaces;

import academy.devdojo.maratonajava.javacore.ZZb.dominio.Car;
@FunctionalInterface

public interface CarPredicate {
    //anonimas, funcoes concisas
    //(car car)->car.getColor().equals("green");
    boolean test(Car car);
}

