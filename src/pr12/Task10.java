package pr12;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные пробелами.");
        String data = s.nextLine();
        String[] arr = data.split(" ");
        System.out.println("Введи число P");
        int p = Integer.parseInt(s.nextLine());
        if (p < 0 || p > arr.length - 1) {
            System.out.println("Количество позиций при сдвиге должно быть в интервале [0, " + arr.length + "]");
        } else {
            for (int j = 0; j < p; j++) {
                String temp = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
}