package pr27;


import java.text.ParseException;

public class Task2 {
    public static void main(String[] args) throws ParseException {
        Library.task3123("03/07/2023 18:56:00", "03/07/2023 18:56:13");
        Library.task3123("03/07/2023 18:56:00", "03/07/2023 18:59:13");
        Library.task3123("03/07/2023 13:56:00", "03/07/2023 18:59:13");
        Library.task3123("03/07/2023 13:56:00", "03/07/2024 18:59:13");
        Library.task3123("28/06/2023 17:30:00", "28/06/2023 18:00:00");
        Library.task3123("16/08/2009 10:00:00", "16/08/2009 10:00:10");
        Library.task3123("12/04/1961 09:07:00", "12/04/1961 09:18:07");
        Library.task3123("01/06/2023 16:00:00", "01/06/2023 15:00:00");
    }
}
