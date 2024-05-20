package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) throws FileNotFoundException {
        int total = 0;
        for (int id = 0; id < 11; id++) {
            String path = "./Task/files/task9417/data" + id + ".txt";
            File file = new File(path);
            System.out.println("Обработка файла " + path);
            if (!file.exists()) {//если файл не существует
                System.out.println("ОШИБКА: Файл не найден");
                continue;
            }
            Scanner fileReader = new Scanner(file);
            if (file.exists()){
                int sum = 0;
                while (fileReader.hasNext()){
                    String value = fileReader.nextLine();
                    try {
                        int integer = Integer.parseInt(value);
                        sum += integer;
                    }catch (NumberFormatException e){
                        System.out.println("ОШИБКА: Не удалось преобразовать число");
                        break;
                    }
                }
            System.out.println("Сумма в файле: " + sum);
            total += sum;
            System.out.println("Общая сумма: " + total);
            }
            fileReader.close();
        }

    }
}
