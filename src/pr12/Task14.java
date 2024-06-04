package pr12;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String[] arr = new String[5];
        while (true) {
            System.out.println("Введи слова 'push' и 'pop'");
            String value = scanner.nextLine();
            if (value.equals("push")) {
                if (count == 5){
                    System.out.println("ПЕРЕПОЛНЕНИЕ");
                    break;
                }
                System.out.println("Введи еще одно значение");
                arr[count] = scanner.nextLine();
                System.out.println("На индекс " + count + " был записан элемент со значением " + arr[count]);
                count++;
                System.out.println("Индекс записи: " + count);
                for (int j = 0; j < count; j++) {
                    System.out.print(arr[j] + " ");
                }
                System.out.println();
            }
            if (value.equals("pop")){
                if (count == 0){
                    System.out.println("Массив пуст");
                    break;
                }
                System.out.println("Извлечен элемент со значением " + arr[count - 1] + " на индексе " + count);
                arr[count - 1] = null;
                count--;
                System.out.println("Индекс записи: " + count);
            }
        }
    }
}