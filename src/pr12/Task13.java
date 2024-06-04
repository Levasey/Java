package pr12;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные пробелами.");
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Отсутствуют исходные данные");
        }
        if (!data.isEmpty()) {
            String[] arr = data.split(" ");
            int count = 0;
            int counter = 0;
            String[] arr_count = new String[arr.length / 2 + 1];
            String[] arr_uncount = new String[arr.length / 2];
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 != 0) {
                    arr_uncount[count] = arr[i];
                    count++;
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (i % 2 == 0) {
                    arr_count[counter] = arr[i];
                    counter++;
                }
            }
            System.out.println("Количество элементов на нечетных индексах: " + count);
            System.out.println("Элементы на нечетных индексах:");
            for (int j = 0; j < arr_uncount.length; j++) {
                System.out.print(arr_uncount[j] + " ");
            }
            System.out.println();
            System.out.println("Элементы на четных индексах:");
            for (int j = 0; j < arr_count.length; j++) {
                System.out.print(arr_count[j] + " ");
            }
            System.out.println();
            System.out.println("Результат:");
            String[] both = new String[arr_count.length + arr_uncount.length];
            System.arraycopy(arr_uncount, 0, both, 0, arr_uncount.length);
            System.arraycopy(arr_count, 0, both, arr_uncount.length, arr_count.length);
            for (int j = 0; j < both.length; j++) {
                System.out.print(both[j] + " ");
            }
        }
    }
}