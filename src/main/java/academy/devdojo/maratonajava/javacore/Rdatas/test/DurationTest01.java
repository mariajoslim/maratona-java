package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime  agora = LocalTime.now();
        LocalTime tm7hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(nowAfterTwoYears, nowAfterTwoYears);
        Duration d2 = Duration.between( agora, tm7hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        Duration d4 = Duration.ofDays(20);
        Duration d5 = Duration.ofMinutes(3);
        Duration d6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);

    }
}
