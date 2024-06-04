package pr11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные пробелами.");
        String data = s.nextLine();
        String[] arr = data.split(" ");
        System.out.println("Введи число B");
        int b = Integer.parseInt(s.nextLine());
        System.out.println("Введи число E");
        int e = Integer.parseInt(s.nextLine());
        if (b < 0 || b > arr.length - 1){
            System.out.println("Число B должно быть в интервале [0, " + arr.length + "]");
        } else if (e < 0 || e > arr.length - 1){
            System.out.println("Число E должно быть в интервале [0, " + arr.length + "]");
        } else {
            if (b < e) {
                while (b < e) {
                    System.out.printf(arr[b] + " ");
                    b++;
                }
            }
            if (e < b) {
                while (e < b) {
                    System.out.printf(arr[e] + " ");
                    e++;
                }
            }
            if (e == b){
                System.out.println(arr[b]);
            }
        }
    }
}
