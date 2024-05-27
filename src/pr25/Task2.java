package pr25;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int first = Integer.parseInt(s.nextLine());
        int second = Integer.parseInt(s.nextLine());
        int i = 0;
        ArrayList<Integer> result = task3305(first, second);
        while (i < result.size()) {
            System.out.print(result.get(i) + " ");
            i = i + 1;
        }
    }

    public static ArrayList<Integer> task3305(int first, int second) {
        ArrayList<Integer> digits = new ArrayList<>();
        digits.add(first);
        while (first < second) {
            digits.add(first + 1);
            first++;
        }
        return digits;
    }
}
