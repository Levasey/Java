package pr15;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = i + 50;
        }
        Scanner scanner = new Scanner(System.in);
        int left = scanner.nextInt();
        int right = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (left == arr[i]){
                System.out.print(arr[i]);
                System.out.print(" Найдено left\n");
            } else if (right == arr[i]) {
                System.out.print(arr[i]);
                System.out.print(" Найдено right\n");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
