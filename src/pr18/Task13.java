package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите номер файла");
        String id = s.nextLine();
        File file = new File("./Task/files/task1761/test" + id + ".txt");

        if (!file.exists()) {//если файл не существует
            System.out.println("Файл не найден " + file.getAbsolutePath());
            return;
        }

        Scanner fileReader = new Scanner(file);

        if (file.exists()) {//если файл присутствует
            String functionName = fileReader.nextLine();
            try{
                String spase = fileReader.nextLine();
            }catch (NoSuchElementException e){
                System.out.println("После имени функции должна идти пустая строка.");
                return;
            }
            int first = 0;
            try{
                first = fileReader.nextInt();
            }catch (NoSuchElementException e){
                System.out.println("Отсутствуют данные для вычислений");
                return;
            }

            if (functionName.equals("sum")){
                while (fileReader.hasNext()) {
                    int t = fileReader.nextInt();
                    first += t;
                }
                System.out.println(functionName);
                System.out.println("-----------");
                System.out.println(first);
            } else if (functionName.equals("avg")){
                int count = 1;
                while (fileReader.hasNext()) {
                    int t = fileReader.nextInt();
                    first += t;
                    count++;
                }
                first /= count;
                System.out.println(functionName);
                System.out.println("-----------");
                System.out.println(first);
            } else if (functionName.equals("max")){
                while (fileReader.hasNext()) {
                    int t = fileReader.nextInt();
                    if (t > first){
                        first = t;
                    }
                }
                System.out.println(functionName);
                System.out.println("-----------");
                System.out.println(first);
            } else if (functionName.equals("min")){

                while (fileReader.hasNext()) {
                    int t = fileReader.nextInt();
                    if (t < first){
                        first = t;
                    }
                }
                System.out.println(functionName);
                System.out.println("-----------");
                System.out.println(first);
            } else {
                System.out.println("Неизвестная функция: " + functionName);
            }
        }
        fileReader.close();
    }
}