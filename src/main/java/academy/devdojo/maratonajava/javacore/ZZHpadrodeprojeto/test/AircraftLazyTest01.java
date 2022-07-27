package academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.test;

import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.Aircraft;
import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.AircraftSingletonEager;
import academy.devdojo.maratonajava.javacore.ZZHpadrodeprojeto.dominio.AircraftSingletonLaze;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftLazyTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonLaze.getINSTANCE());
        System.out.println(AircraftSingletonLaze.getINSTANCE());
        Constructor<AircraftSingletonLaze> constructor = AircraftSingletonLaze.class.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        constructor.newInstance("787-900");
        AircraftSingletonLaze aircraftSingletonLaze = constructor.newInstance("787-900");
        System.out.println(aircraftSingletonLaze);

    }
     private static void bookSeat(String seat){
         System.out.println(AircraftSingletonLaze.getINSTANCE());

         AircraftSingletonLaze aircraft = AircraftSingletonLaze.getINSTANCE();
        System.out.println(aircraft.bookSeat(seat));
    }
}
