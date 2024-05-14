package pr18;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "./Task/files/task2312/config1.cfg";
        File file = new File(path);
        if (!file.exists()) {//если файл не существует
            System.out.println("Файл не найден " + file.getAbsolutePath());
        }
        Scanner fileReader = new Scanner(file);
        if (file.exists()) {//если файл присутствует
            String host = fileReader.nextLine();
            String user = fileReader.nextLine();
            String pass = fileReader.nextLine();

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
