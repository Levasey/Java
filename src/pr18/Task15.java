package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        File file = new File("./Task/files/task6648/test" + id + ".txt");
        Scanner fileReader;
        try{
            fileReader = new Scanner(file);
        } catch(
                FileNotFoundException e){
            throw new RuntimeException(e);
        }
        try{
            String first = fileReader.nextLine();
        }catch (NoSuchElementException e){
            System.out.println("Файл пуст "  + file.getAbsolutePath());
            return;
        }
        while (fileReader.hasNext()) {
            String[] arr = new String[10];
            String t = fileReader.nextLine();
            if (t.equals("push")){

            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
        fileReader.close();
    }

}
