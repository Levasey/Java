package pr11;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите  данные - символы, разделенные тире ','.");
        String firstValue = s.nextLine();
        if (firstValue.isEmpty()) {//условие истинно если вы ничего не ввели и нажали Enter
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {
            String[] arr;
            arr = firstValue.split(",");
            if (arr.length != 4) {
                System.out.println("В исходных данных должно быть ровно 4 элемента. Обнаружено " + arr.length);
            } else {
                if (arr[0].equals(arr[1])) {
                    System.out.println("Первая пара");
                }
                if (arr[1].equals(arr[2])) {
                    System.out.println("Середина");
                }
                if (arr[2].equals(arr[3])) {
                    System.out.println("Третья пара");
                }
                if (arr[0].equals(arr[3])) {
                    System.out.println("Границы");
                }
            }
        }
    }
}