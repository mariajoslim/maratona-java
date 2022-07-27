package academy.devdojo.maratonajava.javacore.ZZb.test;

import academy.devdojo.maratonajava.javacore.ZZb.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZb.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(
            new Car("verona", "green", 1990),
            new Car("Corola", "prata", 2020),
            new Car("Celta", "vinho", 2002)
    );

    public static void main(String[] args) {
       List<Car>greenCars =  filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("green");
            }
        });
        System.out.println(greenCars);

    }
    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate ) {
        List<Car> filteredCar = new ArrayList<>();
        for (Car car : cars) {
            if (carPredicate.test(car)){
                filteredCar.add(car);
            }
        }
        return filteredCar;
    }



}

