package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task10_2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Введите идентификатор композитора");
        int id = Integer.parseInt(s.nextLine());
        Composer_id c = find_by_id(id);
        if (c == null){
            System.out.println("Композитор с кодом " + id + " не найден");
        } else {
            System.out.println("Имя: " + c.first_name);
            System.out.println("фамилия: " + c.last_name);
            System.out.println("место рождения: " + c.birth_place);
        }
    }

    public static Composer_id find_by_id(int id) {
        String path = "./Task/files/task6989/composers.csv";
        File file = new File(path);
        Scanner fileReader;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String header = fileReader.nextLine();
        Composer_id c = new Composer_id();

        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            int composer_id = Integer.parseInt(arr[0]);
            if (id == composer_id) {
                c.first_name = arr[1];
                c.last_name = arr[2];
                c.birth_place = arr[4];
                fileReader.close();
                return c;
            }
        }


        fileReader.close();
        return null;

    }
}
