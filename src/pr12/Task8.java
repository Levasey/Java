package pr12;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        String[] arr = new String[] {"a", "s", "d", "f", "g", "h"};
        Scanner s = new Scanner(System.in);
        System.out.println("Введи число P");
        int p = Integer.parseInt(s.nextLine());
        System.out.println("Введи число Q");
        int q = Integer.parseInt(s.nextLine());
        if (p < 0 || p > arr.length - 1){
            System.out.println("Число P должно быть в интервале [0, " + arr.length + "]");
        } else if (q < 0 || q > arr.length - 1){
            System.out.println("Число Q должно быть в интервале [0, " + arr.length + "]");
        } else {
            System.out.println("Меняю " + arr[p] + " на " + arr[q]);
            String temp = arr[q];
            arr[q] = arr[p];
            arr[p] = temp;
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}