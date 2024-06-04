package pr11;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!str.isEmpty()) {
            String[] mas;
            mas = str.split(",");
            int index = 0;
            while (index < mas.length) {
                System.out.println("Глава " + index + " " + mas[index]);
                index++;
            }
        }
    }
}
