package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTeste01 {
    public static void main(String[] args) {
        LocalTime tempo = LocalTime.of(23,32,12);
        LocalTime timeNOW = LocalTime.now();
        System.out.println(timeNOW);
        System.out.println(tempo.getHour());
        System.out.println(tempo.getMinute());
        System.out.println(tempo.getSecond());
        System.out.println(tempo.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
