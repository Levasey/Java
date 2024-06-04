package pr12;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи данные - символы, разделенные пробелами.");
        String data = s.nextLine();
        if (data.isEmpty()) {
            System.out.println("Исходная строка пуста");
        }
        if (!data.isEmpty()){
            String[] arr = data.split(" ");
            System.out.println("Индекс последнего элемента " + (arr.length - 1));
            System.out.println("Значение последнего элемента " + arr[arr.length - 1]);
            System.out.println("Вместо " + arr[0] + " пишем " + (arr[0] = arr[arr.length - 1]));
            System.out.println("Элементы массива:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
