package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        String path = "./Task/files/task7396/test" + id + ".txt";
        File file = new File(path);

        if (!file.exists()) {//если файл не существует
            System.out.println("Файл не найден " + file.getAbsolutePath());
        } else if (file.length() == 0){
            System.out.println("Файл пуст");
        }
        Scanner fileReader = new Scanner(file);
        if (file.exists()) {//если файл присутствует
            while (fileReader.hasNext()) {
                String value = fileReader.nextLine();
                String[] arr = value.split(";");
                int sum = 0;
                for (int i = 0; i < arr.length; i++) {
                    int t = Integer.parseInt(arr[i]);
                    sum += t;
                }
                System.out.println("Количество чисел в строке " + arr.length + "\n" +
                        "Их сумма равна " + sum);
            }
        }
        fileReader.close();
    }
}