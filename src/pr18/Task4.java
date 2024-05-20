package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        String path = "./Task/files/task4488/test" + id + ".txt";
        File file = new File(path);

        if (!file.exists()) {//если файл не существует
            System.out.println("Файл не найден " + file.getAbsolutePath());
        } else if (file.length() == 0){
            System.out.println("Файл пуст");
        }
        Scanner fileReader = new Scanner(file);
        if (file.exists()) {//если файл присутствует
            String value = fileReader.nextLine();
            int sum = 0;
            while (fileReader.hasNext()) {
                String remain = fileReader.nextLine();
                sum++;
            }
            System.out.println(value + " " + sum);
        }
        fileReader.close();
    }
}
