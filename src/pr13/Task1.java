package pr13;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        String[] arr = value.split(",");
        double ax = Integer.parseInt(arr[0]);
        double ay = Integer.parseInt(arr[1]);
        double bx = Integer.parseInt(arr[2]);
        double by = Integer.parseInt(arr[3]);
        System.out.printf("Координаты точки A(%.2f,%.2f)\n", ax, ay);
        System.out.printf("Координаты точки B(%.2f,%.2f)\n", bx, by);
        double result;
        result = Math.sqrt(Math.pow(bx - ax, 2) + Math.pow(by - ay, 2));
        System.out.printf("Расстояние между точками равно %.4f", result);
    }
}
