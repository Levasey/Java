package pr12;

import java.util.Arrays;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные пробелами.");
        String data = scanner.nextLine();
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
            return;
        }
        System.out.println("Введи одну отдельную строку append");
        String append = scanner.nextLine();
        System.out.println("Введи число a");
        if (!data.isEmpty()) {
            String[] arr = data.split(" ");
            int a = scanner.nextInt();
            if (a > arr.length) {
                String[] arrNew = new String[a + 1];
                System.arraycopy(arr, 0, arrNew, 0, arr.length);
                for (int i = 0; i < arrNew.length; i++) {
                    arrNew[a] = append;
                    if (arrNew[i] == null) {
                        arrNew[i] = "empty";
                    }
                    System.out.print(arrNew[i] + " ");
                }
            } else {
                for (int i = 0; i < arr.length; i++) {
                    arr[a] = append;
                    System.out.print(arr[i] + " ");
                }
            }
        }
    }
}
