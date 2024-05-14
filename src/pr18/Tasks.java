package pr18;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "C:/Users/User/Downloads/config1.cfg";
        File file = new File(path);
        Scanner fileReader = new Scanner(file);
        if (!file.exists()) {//если файл не существует
            System.out.println("Файл не найден " + file.getAbsolutePath());
        }
        if (file.exists()) {//если файл присутствует
            while (fileReader.hasNextLine()){//действия по чтению файла
                System.out.println(fileReader.nextLine());
            }
        }
        if (!fileReader.hasNext()) {//если в файле нечего читать
            System.out.println("Адрес сервера не указан");
        }
        if (fileReader.hasNext()) {//если в файле еще есть данные
            String host = fileReader.nextLine();//читаем строку из файла и записываем её в переменную host
        }
        fileReader.close();

    }
}
