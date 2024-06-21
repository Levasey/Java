package pr27;

import java.text.ParseException;

public class Task5 {
    public static void main(String[] args) throws ParseException {
        Library.task8811("2023-07-01", "2023-08-01", "2023-01-01");
        Library.task8811("2023-07-01", "2023-07-31", "2023-07-15");
        Library.task8811("2023-07-01", "2023-08-01", "2023-01-01");
        Library.task8811("2023-07-01", "2024-06-01", "2024-01-01");
        Library.task8811("2023-01-15", "2023-02-05", "2023-01-19");
        Library.task8811("2023-01-01", "2020-01-01", "2020-01-01");
        Library.task8811("2023-07-26", "2023-07-26", "2023-07-26");
        Library.task8811("2023-07-26", "2023-08-01", "2023-07-26");
        Library.task8811("2023-06-01", "2023-07-26", "2023-07-26");
    }
}
