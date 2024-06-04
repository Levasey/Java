package pr11;

import java.util.Scanner;
import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные пробелами.");
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Нет данных");
        }
        if (!data.isEmpty()) {
            String[] arr = data.split(" ");
            String[] arr1 = new String[arr.length];
            System.arraycopy(arr, 0, arr1, 0, arr.length);
            for (int i = arr1.length - 1; i > 0; i--) {
                arr1[i] = arr1[i - 1];
            }
            arr1[0] = "BEGIN";
            String[] arr2 = new String[arr.length];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            for (int i = 0; i < arr2.length - 1; i++) {
                arr2[i] = arr2[i + 1];
            }
            arr2[arr2.length - 1] = "END";
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr1[i] + " " + arr[i] + " " + arr2[i]);
            }
        }
    }
}