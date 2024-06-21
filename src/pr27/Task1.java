package pr27;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task1 {
    public static void main(String[] args) {
        String yMd = "yyyy-MM-dd";
        String str1 = "2023-06-28";
        LocalDate dt1 = LocalDate.parse(str1, DateTimeFormatter.ofPattern(yMd));
        System.out.println("Выражение " + str1 + " означает");
        System.out.println("Год: " + dt1.getYear());
        System.out.println("Месяц: " + dt1.getMonthValue());
        System.out.println("День: " + dt1.getDayOfMonth());

        String yMdhm = "yyyy-MM-dd HH:mm";
        String str2 = "2023-06-28 18:38";
        LocalDateTime dt2 = LocalDateTime.parse(str2, DateTimeFormatter.ofPattern(yMdhm));
        System.out.println("Выражение " + str2 + " означает");
        System.out.println("Год: " + dt2.getYear());
        System.out.println("Месяц: " + dt2.getMonthValue());
        System.out.println("День: " + dt2.getDayOfMonth());
        System.out.println("Час: " + dt2.getHour());
        System.out.println("Минута " + dt2.getMinute());
        System.out.println("Секунда " + dt2.getSecond());
    }
}
