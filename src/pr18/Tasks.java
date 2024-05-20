package pr18;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Tasks {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        String path = "./Task/files/task2312/config" + id + ".cfg";
        File file = new File(path);
        if (!file.exists()) {//если файл не существует
            System.out.println("Файл не найден " + file.getAbsolutePath());
        }
        Scanner fileReader = new Scanner(file);
        String host = "", user = "", pass = "";
        if (file.exists()) {//если файл присутствует
            if (!fileReader.hasNext()) {//если в файле нечего читать
                System.out.println("Адрес сервера не указан");
                return;
            } else {//если в файле еще есть данные
                host = fileReader.nextLine();//читаем строку из файла и записываем её в переменную host
            }
            if (!fileReader.hasNext()) {//если в файле нечего читать
                System.out.println("Имя пользователя не указано");
                return;
            } else {//если в файле еще есть данные
                user = fileReader.nextLine();//читаем строку из файла и записываем её в переменную user
            }
            if (!fileReader.hasNext()) {//если в файле нечего читать
                System.out.println("Пароль не указан");
                return;
            } else {//если в файле еще есть данные
                pass = fileReader.nextLine();//читаем строку из файла и записываем её в переменную pass
            }
            System.out.printf(new StringBuilder().append("Читаю конфигурацию из файла ").append(file.getAbsolutePath()).append("\n").append("postgresql://").append(user).append(":").append(pass).append("@").append(host).append(":5432/dvdrental\n").toString());
        }
        fileReader.close();
    }

}
