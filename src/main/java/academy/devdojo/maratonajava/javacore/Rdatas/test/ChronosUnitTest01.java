package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronosUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(1988, Month.AUGUST, 6,12,0);
        LocalDateTime agora = LocalDateTime.now();

        System.out.println(ChronoUnit.DAYS.between(aniversario,agora));
        System.out.println(ChronoUnit.WEEKS.between(aniversario,agora));
        System.out.println(ChronoUnit.MONTHS.between(aniversario,agora));
        System.out.println(ChronoUnit.YEARS.between(aniversario,agora));

    }
}
