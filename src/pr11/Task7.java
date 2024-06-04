package pr11;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите число");
            int idx = Integer.parseInt(s.nextLine());
            String[] arr = new String[]{"one", "two", "three", "four", "five"};
            if (idx > 0 && idx < arr.length - 1) {
                System.out.println("На индексе " + idx + " находится элемент со значением " + arr[idx]);
            }
            if (idx < 0 || idx > arr.length){
                System.out.println("В массиве длиной " + arr.length + " не существует элемента с индексом " + idx);
                break;
            }
        }
    }
}