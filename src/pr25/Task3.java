package pr25;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введи число X");
            int x = scanner.nextInt();
            if (x < 0){
                System.out.println("Значение X должно быть неотрицательным");
            }
            System.out.println("Делители числа " + x + ":");
            ArrayList<Integer> result = Library.task8317(x);
            for (int i = 0; i < result.size(); i++) {
                System.out.print(result.get(i) + " ");
            }
            System.out.println();
        }
    }
}
