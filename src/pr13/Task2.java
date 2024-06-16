package pr13;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();
        if (firstValue.isEmpty()) {
            System.out.println();
        }
        if (!firstValue.isEmpty()) {
            String[] arr = firstValue.split(" ");
            int m = Integer.parseInt(secondValue);
            int num;
            for (int i = 0; i < arr.length; i++) {
                num = Integer.parseInt(arr[i]);
                System.out.print(num * m + " ");
            }
        }
    }
}
