package pr11;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!str.isEmpty()) {
            String[] mas;
            mas = str.split(" ");
            for (int i = 0; i < mas.length; i++) {
                System.out.println(mas[i] + " " + i);
            }
        }
    }
}