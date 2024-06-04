package pr20;

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

    public static String task3355(int a) {
        StringBuilder str = new StringBuilder("Введение\n");
        for (int i = 1; i <= a; i++) {
            str.append("Глава ").append(i).append("\n");
        }
        str.append("Заключение\n");
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
}
