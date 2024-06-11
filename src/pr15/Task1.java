package pr15;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h"};
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.nextLine();
        for (int i = 0; i < arr.length; i++) {
            if (letter.equals(arr[i])){
                System.out.print(arr[i]);
                System.out.print(" Найдено\n");
            } else {
                System.out.println(arr[i]);
            }
        }
    }
}
