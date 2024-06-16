package Composer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class ComposerHTML {
    public static void main(String[] args) {
        File composer = new File("composer.html");
        try {
            PrintWriter printWriter = new PrintWriter(composer);
            printWriter.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Комозиторы </h1>\n" +
                    "\n" +
                    "<ol>\n");
            File file = new File("./Task/files/task7788/composers.csv");
            Scanner fileReader = new Scanner(file);
            String header = fileReader.nextLine();
            while (fileReader.hasNext()) {
                String value = fileReader.nextLine();
                String[] arr = value.split(";");
                printWriter.write("<li><a href=\"composer" + arr[0] + ".html\">" + " Имя " + arr[1] + " Фамилия " + arr[2] + "</a></li>\n");
                MakeComposerFile(arr);
            }
            printWriter.write("</ol>\n" +
                    "</body>\n" +
                    "</html>");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не наден " + composer.getAbsolutePath());
        }
    }

    public static void MakeComposerFile(String[] arr) {
        File composer = new File("composer" + arr[0] + ".html");
        try {
            PrintWriter printWriter = new PrintWriter(composer);
            printWriter.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Комозитор </h1>\n" +
                    "\n");
            printWriter.write("<li>" + " Имя " + arr[1] + " Фамилия " + arr[2] + " дата рождения " + arr[3] +
                    " место рождения " + arr[4] + " дата смерти " + arr[5] + " место смерти " + arr[6] +
                    " ссылка на страницу Википедии " + arr[7] + "</li>\n");
            printWriter.write("</body>\n" +
                    "</html>");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не наден " + composer.getAbsolutePath());
        }
    }
}
