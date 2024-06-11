package pr18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
            String path = "./Task/files/task7788/composers.csv";
            File file = new File(path);
            Scanner fileReader = new Scanner(file);
            String header = fileReader.nextLine();
            while (fileReader.hasNext()) {
                String value = fileReader.nextLine();
                String[] arr = value.split(";");
                printWriter.write("<li>" + arr[0] + " " +  arr[1] + " " + arr[2] + " " + arr[3] + "</li>\n");
            }
            fileReader.close();
            printWriter.write("</ol>\n" +
                    "</body>\n" +
                    "</html>");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не наден " + composer.getAbsolutePath());
        }
    }

}
