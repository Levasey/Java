package pr12;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные запятой.");
        String data = s.nextLine();
        String[] arr = data.split(",");
        System.out.println("Введи index");
        int index = Integer.parseInt(s.nextLine());
        System.out.println("Введи еще одну строку");
        String value = s.nextLine();
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Index должен быть в интервале [0, " + arr.length + "]");
        } else {
            arr[index] = value;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
