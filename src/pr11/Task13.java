package pr11;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        String[] arr = new String[]{"one", "two", "three", "four", "five", "six"};
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите число");
            int idx = Integer.parseInt(s.nextLine());
            String first = s.nextLine();
            String second = s.nextLine();
            arr[idx] = first;
            arr[idx + 1] = second;
            for (int i = 0; i < arr.length; i++) {
                System.out.printf(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
