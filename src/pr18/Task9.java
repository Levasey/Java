package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "./Task/files/task7788/composers.csv";
        File file = new File(path);
        Scanner fileReader;
        try {
            fileReader = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        String header = fileReader.nextLine();
        int count = 0;
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split(";");
            System.out.println(arr[0] + arr[2] + arr[5] + arr[6]);
            count++;
        }
        System.out.println("Всего композиторов: " + count);
        fileReader.close();
    }
}