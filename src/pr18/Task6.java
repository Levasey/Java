package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "./Task/files/task8605/dates.txt";
        File file = new File(path);
        Scanner fileReader = new Scanner(file);
        while (fileReader.hasNext()) {
            String value = fileReader.nextLine();
            String[] arr = value.split("-");
            int year = Integer.parseInt(arr[0]);
            int month = Integer.parseInt(arr[1]);
            int data = Integer.parseInt(arr[2]);
            if (month > 12){
                System.out.println(value + " Месяц должен быть от 1 до 12 включительно");
            } else if (arr.length != 3) {
                System.out.println(value + " Дата должна состоять из трех чисел");
            } else if (month == 01 && data > 31) {
                System.out.println(value + " Количество дней в январе не должно превышать 31");
            } else if (year % 4 != 0 && month == 02 && data > 28) {
                System.out.println(value + " Количество дней в феврале НЕвисокосного года не должно превышать 28");
            } else if (year % 4 == 0 && month == 02 && data > 29) {
                System.out.println(value + " Количество дней в феврале високосного года не должно превышать 29");
            } else if (month == 03 && data > 31) {
                System.out.println(value + " Количество дней в марте не должно превышать 31");
            } else if (month == 04 && data > 30) {
                System.out.println(value + " Количество дней в апреле не должно превышать 30");
            } else if (month == 05 && data > 31) {
                System.out.println(value + " Количество дней в мае не должно превышать 31");
            } else if (month == 06 && data > 30) {
                System.out.println(value + " Количество дней в июне не должно превышать 30");
            } else if (month == 07 && data > 31) {
                System.out.println(value + " Количество дней в июле не должно превышать 31");
            } else if (month == 8 && data > 31) {
                System.out.println(value + " Количество дней в августе не должно превышать 31");
            } else if (month == 9 && data > 30) {
                System.out.println(value + " Количество дней в сентябре не должно превышать 30");
            } else if (month == 10 && data > 31) {
                System.out.println(value + " Количество дней в октябре не должно превышать 31");
            } else if (month == 11 && data > 30) {
                System.out.println(value + " Количество дней в ноябре не должно превышать 30");
            } else if (month == 12 && data > 31) {
                System.out.println(value + " Количество дней в декабре не должно превышать 31");
            } else {
                System.out.println(value + " Дата корректна");
            }
        }
        fileReader.close();
    }
}
