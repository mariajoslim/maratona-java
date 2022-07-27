package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.zone.ZoneOffsetTransition;
import java.util.Map;

public class ZoneIdTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());
        ZoneId tokyoZone = ZoneId.of("Asia/Tokio");
        System.out.println(tokyoZone);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println(nowInstant);
        ZonedDateTime zoneDateTime2  = nowInstant.atZone(tokyoZone);
        System.out.println(zoneDateTime2);

        System.out.println(ZoneOffset.MAX);
        System.out.println(ZoneOffset.MIN );

        ZoneOffset offsetManaus  = ZoneOffset.of("-4:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(offsetManaus);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(now, offsetManaus);
        System.out.println(offsetDateTime2 );

        OffsetDateTime offsetDateTime3 = nowInstant.atOffset(offsetManaus);
        System.out.println(offsetDateTime3);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        LocalDate meijiraEraLocalDate = LocalDate.of(1900,2,1);
        JapaneseDate meijiEra = JapaneseDate.from(meijiraEraLocalDate);
        System.out.println(meijiEra);




    }
}
