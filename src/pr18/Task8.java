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
        Scanner list_Reader = new Scanner(file);
        if (file.exists()) {//если файл присутствует
            int total = 0;
            while (list_Reader.hasNext()) {
                String value = list_Reader.nextLine();
                String data_path = "./Task/files/task3148/" + value;
                File file_data = new File(data_path);
                Scanner data_Reader = new Scanner(file_data);

                int counter = 0;
                System.out.println("Обработка файла " + data_path);
                while (data_Reader.hasNext()) {

                    String value_data = data_Reader.nextLine();
                    String[] arr = value_data.split(";");
                    if (arr.length != 2){
                        System.out.println("ОШИБКА: В строке должно быть два числа. Найдено " + arr.length);
                        break;
                    }
                        int x = Integer.parseInt(arr[0]);
                    int y = Integer.parseInt(arr[1]);
                    if (x < y) {
                        counter++;
                    }
                }
                total += counter;
                System.out.println("Количество подходящих записей в файле: " + counter);
                data_Reader.close();
            }
            System.out.println("Общее количество подходящих записей: " + total);
            list_Reader.close();
        }
    }
}