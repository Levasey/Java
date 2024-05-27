package pr11;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите  данные - символы, разделенные тире ';'.");
        String firstValue = s.nextLine();
        if (firstValue.isEmpty()) {//условие истинно если вы ничего не ввели и нажали Enter
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {
            String[] arr;
            arr = firstValue.split(";");
            int index = (arr.length - 1) / 2;
            System.out.println("Длина массива: " + arr.length + " Индекс: " + index + ", элемент: " + arr[index]);
        }
    }
}