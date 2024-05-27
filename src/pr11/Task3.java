package pr11;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите  данные - символы, разделенные тире ' '.");
        String firstValue = s.nextLine();
        System.out.println("Введите число");
        String idx = s.nextLine();
        if (firstValue.isEmpty()) {//условие истинно если вы ничего не ввели и нажали Enter
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {//обратите внимание на восклицательный знак в начале. Условие с восклицательным знаком истинно, когда выражение после знака - ложно.
            String[] arr;//объявление переменной для хранения массива текстовых фрагментов
            arr = firstValue.split(" ");//разбиение текстового фрагмента на части. Знак " " называется разделитель.
            int a = Integer.parseInt(idx);
            if (a < 0) {//индексы в массиве начинаются с 0
                System.out.println("Индекс A должен быть больше или равен 0");
            }
            if (arr.length <= a) {//длина массива всегда на 1 больше, чем индекс последнего числа
                System.out.println("Индекс A должен быть строго меньше длины массива");
            }
            if (0 <= a) {
                if (a < arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("на индексе " + a + " содержит значение " + arr[a]);
                    if (a - 1 < 0){
                        System.out.println("Предыдущий элемент не существует");
                    } else {
                        System.out.println("Значение предыдущего элемента " + arr[a - 1]);
                    }
                    if (a + 1 > arr.length){
                        System.out.println("Следующий элемент не существует");
                    } else {
                        System.out.println("Значение следующего элемента " + arr[a + 1]);
                    }
                }
            }
        }
    }
}