package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormtterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        LocalDate parse1 = LocalDate.parse("20220303",DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-03-03 +05:00",DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-03-03",DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime agora = LocalDateTime.now();
        String s4 = agora.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(s4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-03-03T18:46:04112194",DateTimeFormatter.ISO_LOCAL_DATE);

        //dd/MM/yyyy
        //MM/dd/yyyy
        //yyyy/MM/dd

        DateTimeFormatter formatterBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBr = LocalDate.now().format(formatterBr);
        System.out.println(formatBr);
        LocalDate parseBr = LocalDate.parse("03/03/2021", formatterBr);
        System.out.println(parseBr);

        DateTimeFormatter formatterGr = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.GERMAN);
        String formatGr  = LocalDate.now().format(formatterGr);
        System.out.println(formatGr);
        LocalDate parseGr = LocalDate.parse("03/03/2021", formatterGr);
        System.out.println(parseGr);


    }
}
