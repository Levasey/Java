package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        String path = "./Task/files/task6989/composers.csv";
        File file = new File(path);
        Scanner fileReader;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String headline = fileReader.nextLine();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите идентификатор композитора");
        int id = Integer.parseInt(s.nextLine());
        int counter = 0;
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            int composer_id = Integer.parseInt(arr[0]);
            if (id == composer_id) {
                System.out.println("Имя: " + arr[1]);
                System.out.println("фамилия: " + arr[2]);
                System.out.println("место рождения: " + arr[4]);
                counter++;
                break;
            }
        }
        if (counter == 0){
            System.out.println("Композитор с кодом " + id + " не найден");
        }

        fileReader.close();
    }
}
