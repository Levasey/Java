package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        File file = new File("./Task/files/task4477/test" + id + ".txt");
        Scanner fileReader;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
            int count = 0;
            int count_max = 0;
        while (fileReader.hasNext()) {
            String t = fileReader.nextLine();
            if (t.equals("{")){
                System.out.println("Скобки открылись.");
                count++;
                if (count > count_max){
                    System.out.println("Текущая вложенность " + count + " больше максимальной " + count_max);
                    count_max++;
                }
            }
            if (t.equals("}")){
                System.out.println("Закрылись скобки.");
            }
        }
        fileReader.close();
    }
}