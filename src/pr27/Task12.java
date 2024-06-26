package pr27;

import java.text.ParseException;

public class Task12 {
    public static void main(String[] args) throws ParseException {
        Library.task2130("UTC+01:00");
        Library.task2130("UTC+10:00");
        Library.task2130("UTC");
        Library.task2130("UTC-10:00");
        Library.task2130("Turkey");
        Library.task2130("Africa/Lubumbashi");
    }
}
