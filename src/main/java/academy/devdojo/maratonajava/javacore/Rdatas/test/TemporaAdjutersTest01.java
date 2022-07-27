package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporaAdjutersTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        agora = agora.with(ChronoField.DAY_OF_MONTH,18);
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());





    }
}
