package pr11;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите  данные - символы, разделенные тире '-'.");
        String firstValue = s.nextLine();
        System.out.println("Введите число");
        String secondValue = s.nextLine();
        if (firstValue.isEmpty()) {//условие истинно если вы ничего не ввели и нажали Enter
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {//обратите внимание на восклицательный знак в начале. Условие с восклицательным знаком истинно, когда выражение после знака - ложно.
            String[] arr;//объявление переменной для хранения массива текстовых фрагментов
            arr = firstValue.split("-");//разбиение текстового фрагмента на части. Знак "-" называется разделитель.
            //qw-er-ty-ui превращается в массив
            //на индексе 0 элемент qw
            //на индексе 1 элемент er
            //на индексе 2 элемент ty
            //на индексе 3 элемент ui
            int a;//тип переменной - целое число. Её назначение - хранить индекс элемента
            a = Integer.parseInt(secondValue);
            if (a < 0) {//индексы в массиве начинаются с 0
                System.out.println("Индекс A должен быть больше или равен 0");
            }
            if (arr.length <= a) {//длина массива всегда на 1 больше, чем индекс последнего числа
                System.out.println("Индекс A должен быть строго меньше длины массива");
            }
            if (0 <= a) {
                if (a < arr.length) {
                    System.out.println("В массиве длиной " + arr.length);
                    System.out.println("на индексе " + a);
                    System.out.println("находится элемент со значением '" + arr[a] + "'");
                }
            }
        }
    }
}