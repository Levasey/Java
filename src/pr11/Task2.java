package pr11;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите  данные - символы, разделенные тире ','.");
        String firstValue = s.nextLine();
        if (firstValue.isEmpty()) {//условие истинно если вы ничего не ввели и нажали Enter
            System.out.println("Исходная строка пуста");
        }
        if (!firstValue.isEmpty()) {//обратите внимание на восклицательный знак в начале. Условие с восклицательным знаком истинно, когда выражение после знака - ложно.
            String[] arr;//объявление переменной для хранения массива текстовых фрагментов
            arr = firstValue.split(",");//разбиение текстового фрагмента на части. Знак "," называется разделитель.
            System.out.println("В массиве длиной " + arr.length);
            System.out.println("Значение элемента на индексе 0 это " + arr[0]);
            try {
                System.out.println("Значение элемента на индексе 2 это " + arr[2]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Нет элемента на индексе 2");
            }
            try {
                System.out.println("Значение элемента на индексе 3 это " + arr[3]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Нет элемента на индексе 3");
            }
            try {
                System.out.println("Значение элемента на индексе 5 это " + arr[5]);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Нет элемента на индексе 5");
            }
        }
    }
}
