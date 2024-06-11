package pr19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String cx = s.nextLine();
        String cy = s.nextLine();
        String r = s.nextLine();
        String sw = s.nextLine();
        File target = new File("target.html");
        try{
            PrintWriter printWriter = new PrintWriter(target);
            printWriter.write("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<meta charset=\"utf-8\"/>\n" +
                    "<head/>\n" +
                    "<body>\n" +
                    "<h1>Мой первый векторный рисунок</h1>\n" +
                    "\n" +
                    "<svg width=\"800\" height=\"600\">\n" +
                    "\t<circle cx=\"" + cx + "\" cy=\""+ cy +"\" r=\"" + r + "\" stroke=\"green\" stroke-width=\"" + sw + "\" fill=\"yellow\" />\n" +
                    "</svg>\n" +
                    "</body>\n" +
                    "</html>");
            printWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не наден " + target.getAbsolutePath());
        }
    }
}
