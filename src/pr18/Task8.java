package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task8 {
    private static Object arr;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        String path = "./Task/files/task3148/list" + id + ".txt";
        File file = new File(path);
        System.out.println("Обработка списка " + path);
        if (!file.exists()) {//если файл не существует
            System.out.println("ОШИБКА: Список не найден");
        }
        Scanner fileReader = new Scanner(file);

        if (file.exists()) {//если файл присутствует
            while (fileReader.hasNext()) {
                int sum = 0;
                String value = fileReader.nextLine();
                String[] arr = value.split(";");
                int x, y;
                try {
                    x = Integer.parseInt(arr[0]);
                    y = Integer.parseInt(arr[1]);
                } catch (NumberFormatException e) {
                    System.out.println("ОШИБКА: Не удалось преобразовать число");
                    break;
                }
                if (x < y) {
                    sum++;
                }
                System.out.println("Количество подходящих записей в файле: " + sum);
            }
        }
        fileReader.close();
    }
}