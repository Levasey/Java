package pr15;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = new int[11];
        for (int i = 0; i < 11; i++) {
            arr[i] = i + 30;
        }
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]){
                System.out.print(arr[i] + "+");
            } else {
                System.out.println(arr[i] + "-");
            }
        }
    }
}
