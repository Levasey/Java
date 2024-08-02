package pr17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int index = str.indexOf(text);
        if (index < 0) {
            System.out.println("Переменная index содержит " + index + ", значит фрагмент '" + text + "' отсутствует в строке");
        } else {
            System.out.println("Переменная index содержит " + index + ", значит Фрагмент '" + text + "' находится на индексе '" + index + "'\n" +
                    "Длина введенного фрагмента " + text.length() + "\n" +
                    "После него есть еще " + (str.length() - text.length() - index) + " символов");
        }
    }
}