package pr17;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        String str = "abcdefwxyz";
        Scanner scanner = new Scanner(System.in);
        int ab = scanner.nextInt();
        int cd = scanner.nextInt();
        if (ab < cd){
            String result = str.substring(ab, cd);
            System.out.println("Записываю значение '" + str + "' в переменную STR\n" +
                    "От CA до CB. Вызов метода выглядит так:\n" +
                    "String result = STR.substring(cb, ca);\n" +
                    "Переменная result содержит " + result);
        }else {
            String result = str.substring(cd, ab);
            System.out.println("\tЗаписываю значение 'abcdefwxyz' в переменную STR\n" +
                    "От CB до CA. Вызов метода выглядит так:\n" +
                    "String result = STR.substring(cb, ca);\n" +
                    "Переменная result содержит " + result);
        }
    }
}
