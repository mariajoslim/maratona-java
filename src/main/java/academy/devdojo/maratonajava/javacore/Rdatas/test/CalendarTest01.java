package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        if(calendario.getMinimalDaysInFirstWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendario.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendario.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        calendario.add(Calendar.DAY_OF_MONTH,2);
        calendario.roll(Calendar.HOUR,12);
            Date date = calendario.getTime();

        System.out.println(date);
    }
}
