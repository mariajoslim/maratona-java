package academy.devdojo.maratonajava.javacore.Rdatas.test;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate agora = LocalDate.now();
        LocalDate na2y = LocalDate.now().plusYears(2).plusDays(7);
        Period p1 = Period.between(agora,na2y);
        Period p2 = Period.ofDays(10);
        Period p3 = Period.ofWeeks(58);
        Period p4 = Period.ofMonths(3);
        Period p6 = Period.ofYears(3);


        System.out.println(p1);
        System.out.println(p2 );
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p6);
        System.out.println(p3.getMonths());
        System.out.println(Period.between(agora,agora.plusDays(p3.getDays())).getMonths());
        System.out.println(agora.until(agora.plusDays(p3.getDays()), ChronoUnit.DAYS));

    }
}
