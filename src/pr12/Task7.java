package pr12;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи целое число");
        int size = Integer.parseInt(s.nextLine());
        if (size <= 0){
            System.out.println("Размер массива должен быть числом больше 0.");
        } else {
            System.out.println("Создаю массив размером " + size);
            String[] arr = new String[size];
            System.out.println("Введи данные.");
            for (int i = 0; i < size; i++) {
                String data = s.nextLine();
                arr[i] = data;
            }
            System.out.println("Получился массив:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}