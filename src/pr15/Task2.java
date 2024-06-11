package pr15;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{11, 13, 17, 19, 10, 12, 14, 15, 16, 18, 20};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                arr[i] = arr[i];
            }
            System.out.println(arr[i]);
        }
    }
}
