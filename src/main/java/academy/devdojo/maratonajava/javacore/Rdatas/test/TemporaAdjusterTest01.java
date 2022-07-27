package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDays;
        switch (dayOfWeek) {
            case THURSDAY:
                addDays = 4;
                break;
            case FRIDAY:
                addDays = 3;
                break;
            case SATURDAY:
                addDays = 2;
                break;
            default:
                addDays = 1;
        }
        return temporal.plus(addDays, ChronoUnit.DAYS);

    }
}

public class TemporaAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora=LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());


        agora = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().withDayOfMonth(19).with(new ObterProximoDiaUtil());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());

        agora = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
        System.out.println(agora);
        System.out.println(agora.getDayOfWeek());



    }


}
