package pr15;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char a = scanner.next().charAt(0);
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        StringBuilder str = new StringBuilder();
        for (char x : arr) {
            if (x <= a) {
                str.append(x);
            }
        }
        System.out.println(str);
    }
}
