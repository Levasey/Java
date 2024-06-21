package pr27;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Library {
    public static void task3123(String first, String second) {
        String yMdhm = "yyyy/MM/dd HH:mm";
        LocalDateTime date1 = LocalDateTime.parse(first, DateTimeFormatter.ofPattern(yMdhm));
        LocalDateTime date2 = LocalDateTime.parse(second, DateTimeFormatter.ofPattern(yMdhm));

        StringBuilder sb = new StringBuilder();
        /*sb.append("Между датами прошло " + diffHours + " часов\n");
        sb.append( "Всего минут " + totalMinutes + ". В текущем часе " + diffMinutes + "\n");
        sb.append("В текущей минуте " + diffSeconds + "\n");

        System.out.println(sb.toString());*/

    }
}
