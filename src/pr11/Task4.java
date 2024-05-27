package pr11;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите  данные - символы, разделенные тире '#'.");
        String firstValue = s.nextLine();
        if (firstValue.isEmpty()) {//условие истинно если вы ничего не ввели и нажали Enter
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {
            String[] arr;
            arr = firstValue.split("#");
            if ((arr.length - 3) < 0){
                System.out.println("Массив слишком маленький");
            } else {
                System.out.println("В массиве длиной " + arr.length);
                System.out.println("Индекс третьего элемента с конца " + (arr.length - 3));
                System.out.println("Значение этого элемента " + arr[arr.length - 3]);
            }
        }
    }
}