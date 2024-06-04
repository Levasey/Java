package pr12;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if (str.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!str.isEmpty()) {
            String[] mas;
            mas = str.split(" ");
            for (int i = 0; i < mas.length / 2; i++) {
                String temp = mas[i];
                mas[i] = mas[mas.length - i - 1];
                mas[mas.length - i - 1] = temp;
            }
            for (int j = 0; j < mas.length; j++) {
                System.out.print(mas[j] + " ");
            }
            System.out.println();
        }
    }
}