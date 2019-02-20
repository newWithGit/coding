package dateTimeNewApi;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class DateTime101 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.of(2019, 02, 17));
        System.out.println(LocalDate.of(2019, Month.FEBRUARY, 17));
        System.out.println(Instant.now());
    }
}
