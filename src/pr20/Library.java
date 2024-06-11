package pr20;

import java.util.Scanner;

public class Library {
    public static double task7611(double x) {
        double res;
        res = x + 7;
        return res;
    }

    public static double task4776(double y) {
        double result = Math.sqrt(1 - Math.pow(Math.sin(Math.toRadians(y)), 2));
        return result;
    }

    public static int task4757(int a, int b) {
        int result;
        if (a < b) {
            result = b - a;
            return result;
        } else {//здесь раньше был if (b < a)
            result = a - b;
            return result;
        }
    }

    public static String task3597(double a, double b, double c) {
        String res;
        if (a == 0) {
            return res = "Данное уравнение не является квадратным";
        }
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        if (discriminant == 0) {
            return res = "Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 имеет один корень";
        } else if (discriminant > 0) {
            return res = "Уравнение " + a + "x^2 + " + b + "x + " + c + " = 0 два вещественных корня";
        } else {
            return res = "Вещественных корней уравнения " + a + "x^2 + " + b + "x + " + c + " = 0 нет";
        }
    }

    public static long task6573(int a, int b) {
        long res = 1;
        if (a > b) {
            while (a >= b) {
                res = res * b;
                b++;
            }
        } else {
            while (a <= b) {
                res = res * a;
                a++;
            }
        }
        return res;
    }

    public static String task3355(int a) {
        StringBuilder str = new StringBuilder("Введение\n");
        for (int i = 1; i <= a; i++) {
            str.append("Глава ").append(i).append("\n");
        }
        str.append("Заключение\n");
        return str.toString();
    }

    public static String task1292(char a) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        StringBuilder str = new StringBuilder();
        for (char x : arr) {
            if (x <= a) {
                str.append(x);
            }
        }
        return str.toString();
    }

    public static double task6948(int[] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        result /= arr.length;
        return result;
    }

    public static int task8920(String k, String[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k.equals(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static String task1995(int[] arr, int[] arr1) {
        String str;
        if (arr.length == arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr1[i]) {
                    str = "Массивы начинают различаться на индексе " + i;
                    return str;
                }
            }
        } else if (arr.length > arr1.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr[i] != arr1[i]) {
                    str = "Массивы начинают различаться на индексе " + i;
                    return str;
                }
            }
            str = "Массивы начинают различаться на индексе " + arr1.length;
            return str;
        } else if (arr.length < arr1.length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr1[i]) {
                    str = "Массивы начинают различаться на индексе " + i;
                    return str;
                }
            }
            str = "Массивы начинают различаться на индексе " + arr.length;
            return str;
        }
        str = "Массивы одинаковы";
        return str;
    }

    public static double[] task7759(int[] arr){
        double average = 0;
        for (int i = 0; i < arr.length; i++) {
            average += arr[i];
        }
        average /= arr.length;
        double[] abs = new double[arr.length];
        for (int i = 0; i < abs.length; i++) {
            abs[i] = Math.abs(arr[i] - average);
        }
        return abs;
    }

    public static double[] task2936(double x, double[] arr){
        double[] result = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * x;
        }
        return result;
    }

    public static double[] task3539(double[] arr){
        double[] result = new double[arr.length];
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] - min;
        }
        return result;
    }

    public static boolean task2121(int p, int q){
        if (p <= q){
            return true;
        } else {
            return false;
        }
    }

    public static boolean task6401(double a, double b, double x){
        if (a < b) {
            return a <= x && x <= b;
        } else {
            return b <= x && x <= a;
        }
    }

    public static boolean task7581(String[] arr){
        for (String s : arr) {
            if (s.equals("x")) {
                return true;
            }
        }
        return false;
    }
}
