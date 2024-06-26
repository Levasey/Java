package pr27;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Library {
    public static void task3123(String first, String second) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        long date1 = format.parse(first).getTime();
        long date2 = format.parse(second).getTime();
        long diff = Math.abs(date2 - date1);

        long diffSeconds = diff / 1000 % 60;
        long totalSeconds = diff / 1000;
        long diffMinutes = diff / (60 * 1000) % 60;
        long totalMinutes = diff / (60 * 1000);
        long diffHours = diff / (60 * 60 * 1000);

        StringBuilder sb = new StringBuilder();
        sb.append("Между датами прошло ").append(diffHours).append(" часов\n");
        sb.append("Всего минут ").append(totalMinutes).append(". В текущем часе ").append(diffMinutes).append("\n");
        sb.append("Всего секунд ").append(totalSeconds).append(". В текущей минуте ").append(diffSeconds).append("\n");

        System.out.println(sb.toString());
    }

    public static void task9418(long distance, String start, String finish) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long date1 = format.parse(start).getTime();
        long date2 = format.parse(finish).getTime();
        long diff = Math.abs(date2 - date1);
        long totalSeconds = diff/1000;
        double speed = (double) distance / totalSeconds;
        System.out.printf("Между двумя датами прошло " + totalSeconds + " секунд\n" +
                "Скорость получается %.4f м/с\n", speed);
        System.out.println();
    }

    public static void task7480(String firstDate, String secondDate) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        long date1 = format.parse(firstDate).getTime();
        long date2 = format.parse(secondDate).getTime();
        if (date2 > date1){
            System.out.println("Вторая дата позже первой");
        } else {
            System.out.println("Первая дата позже второй");
        }
    }

    public static void task8811(String start, String finish, String appointment) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        long date1 = format.parse(start).getTime();
        long date2 = format.parse(finish).getTime();
        long app = format.parse(appointment).getTime();
        if (date1 < app && date2 > app){
            System.out.println("ДАТА В ПЕРИОДЕ");
        } else {
            System.out.println("ДАТА ЗА ПРЕДЕЛАМИ");
        }
    }

    public static void task1912(String hour){
        String yMdhm = "HH:mm";

        LocalDateTime dt2 = LocalDateTime.parse(hour, DateTimeFormatter.ofPattern(yMdhm));
        int hr = dt2.getHour();
        int mt = dt2.getMinute();
        if (hr == 8){
            System.out.println("Завтрак еще не закончился");
        }
        if (hr > 8) {
            System.out.println("Следующий прием пищи - обед");
        }
        if (hr == 13) {
            System.out.println("Обед еще не закончился");
        }
        if (hr > 13){
            System.out.println("Следующий прием пищи - ужин");
        }


    }

    public static void task3696(String date, int days) throws ParseException {
        Calendar calendar = Calendar.getInstance(); // Получили текущую дату
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = df.parse(date);
        calendar.setTime(date1);  // здесь укажите свою дату
        calendar.add(Calendar.DATE, days);  // добавляем
        Date tomorrow = calendar.getTime();  // получаем изменённое значение
        System.out.println("При смещении " + date + " на " + days + " дней \n" +
                "получается дата " + df.format(tomorrow));
        System.out.println();
    }

    public static void task8381(String date) throws ParseException {
        DateTimeFormatter yMd = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dt1 = LocalDate.parse(date, yMd);
        for (int i = 5; i > 0; i--) {
            LocalDate future = dt1.minusDays(i); // Создаем новый объект, вычитая дни
            System.out.println("Минус " + i + " дней " + yMd.format(future));
        }
        for (int i = 1; i < 6; i++) {
            LocalDate future = dt1.plusDays(i); // Создаем новый объект, прибавляя дни
            System.out.println("Плюс " + i + " дней " + yMd.format(future));
        }
        System.out.println();
    }

    public static void task8498(String firstDate, String secondDate){
        String yMd = "yyyy-MM-dd";
        LocalDate dt1 = LocalDate.parse(firstDate, DateTimeFormatter.ofPattern(yMd));
        LocalDate dt2 = LocalDate.parse(secondDate, DateTimeFormatter.ofPattern(yMd));
        String dayOfWeek1 = String.valueOf(dt1.getDayOfWeek());
        String dayOfWeek2 = String.valueOf(dt2.getDayOfWeek());
        if (dayOfWeek1.equals(dayOfWeek2)){
            System.out.println("Дни недели совпадают и равны " + dayOfWeek1);
        } else {
            System.out.println("Дни недели различаются.\n" +
                    "У первой даты " + dayOfWeek1 + "\n" +
                    "У второй даты " + dayOfWeek2);
        }
    }

    public static void task8096(String data){
        String yMd = "yyyy-MM-dd";
        LocalDate dt1 = LocalDate.parse(data, DateTimeFormatter.ofPattern(yMd));
        LocalDate monday = dt1.with(DayOfWeek.MONDAY);
        LocalDate tuesday = dt1.with(DayOfWeek.TUESDAY);
        LocalDate wednesday = dt1.with(DayOfWeek.WEDNESDAY);
        LocalDate thursday = dt1.with(DayOfWeek.THURSDAY);
        LocalDate friday = dt1.with(DayOfWeek.FRIDAY);
        LocalDate saturday = dt1.with(DayOfWeek.SATURDAY);
        LocalDate sunday = dt1.with(DayOfWeek.SUNDAY);
        long count = ChronoUnit.DAYS.between(monday, dt1);
        System.out.println("Нужно отнять " + count+ " дней чтобы получился понедельник");
        System.out.println("понедельник это " + monday + "\n" +
                "вторник это " + tuesday + "\n" +
                "среда это " + wednesday + "\n" +
                "четверг это " + thursday + "\n" +
                "пятница это " + friday + "\n" +
                "суббота это " + saturday + "\n" +
                "воскресенье это " + sunday + "\n");
    }

    public static void task8519(String date) throws ParseException {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");
        LocalDateTime noZone = LocalDateTime.parse(date, fmt);
        ZonedDateTime omsk = noZone.atZone(ZoneId.of("UTC+06:00"));
        ZonedDateTime nsk = omsk.withZoneSameInstant(ZoneId.of("UTC+07:00"));
        System.out.println("Когда в Омске " + omsk.format(fmt) + "\n" +
                "в Новосибирске " + nsk.format(fmt));
    }

    public static void task2130(String utc) throws ParseException {
        Calendar calendar = new GregorianCalendar();
        DateFormat df = new SimpleDateFormat("yyyy-MM -dd HH:mm");
        Date date1 = df.parse("2023-06-28 18:27");
        calendar.setTime(date1);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        System.out.println(df.format(calendar.getTime()));
    }
}
