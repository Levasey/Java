package pr12;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные пробелами.");
        String data = s.nextLine();
        System.out.println("Введи число S");
        int shift = Integer.parseInt(s.nextLine());
        String[] arr = data.split(" ");
        shift %= arr.length;
        if (shift < 0){
            shift = arr.length + shift;
        }
        System.out.println("Фактически нужно сдвинуть на " + shift);
        for (int j = 0; j < shift; j++) {
            String temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}