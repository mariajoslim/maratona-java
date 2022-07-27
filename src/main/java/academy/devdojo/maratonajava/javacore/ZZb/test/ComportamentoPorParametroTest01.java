package academy.devdojo.maratonajava.javacore.ZZb.test;

import academy.devdojo.maratonajava.javacore.ZZb.dominio.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(
            new Car("verona", "green", 1990),
            new Car("Corola", "prata", 2020),
            new Car("Celta", "vinho", 2002)
    );

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));
        System.out.println(filterRedCar(cars));
        System.out.println(filterCarByColor(cars, "green"));
        System.out.println(filterCarByColor(cars, "red"));
        System.out.println(filterAge(cars, 1988));
    }

    private static List<Car> filterGreenCar(List<Car> cars) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }




    private static List<Car> filterRedCar(List<Car> cars) {
        List<Car> redCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                redCars.add(car);
            }
        }
        return redCars;
    }

    private static List<Car> filterCarByColor(List<Car> cars,String cor) {
        List<Car> greenCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getColor().equals(cor)) {
                greenCars.add(car);
            }
        }
        return greenCars;
    }


    private static List<Car> filterAge(List<Car> cars,int year) {
        List<Car> ageCars = new ArrayList<>();
        for (Car car : cars) {
            if (car.getYear()<year) {
                ageCars.add(car);
            }
        }
        return ageCars;
    }
}





