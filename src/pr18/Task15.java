package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        File file = new File("./Task/files/task6648/test" + id + ".txt");
        try {
            Scanner fileReader = new Scanner(file);
            int count = 0;
            int counter = 10;
            String[] arr = new String[counter];
            while (fileReader.hasNext()) {
                String t = fileReader.nextLine();
                if (t.isEmpty()) {
                    System.out.println("Файл пуст " + file.getAbsolutePath());
                    return;
                }
                if (t.equals("push")) {
                    if (count == counter) {
                        arr = Arrays.copyOf(arr, arr.length * 2);
                        counter *= 2;
                        System.out.println("ПЕРЕПОЛНЕНИЕ. Размер нового массива " + counter);
                    }
                    arr[count] = fileReader.nextLine();
                    count++;
                }
                if (t.equals("pop")) {
                    arr[count - 1] = null;
                    count--;
                }
            }
            System.out.println("Размер итогового массива равен " + counter);
            System.out.println("В нем находится " + count + " значений.");
            for (int i = 0; i < count; i++) {
                System.out.print(arr[i] + " ");
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
