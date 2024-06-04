package pr20;

public class Task8 {
    public static void main(String[] args) {
        int[] values;
        values = new int[]{9, 8, 9, 1, 1, 5, 1, 1};
        double result;
        result = Library.task6948(values);
        System.out.printf("%.6f\n", result);
        values = new int[]{1, 2, 3, 4, 1, 3, 4, 4, 4, 4};
        result = Library.task6948(values);
        System.out.printf("%.6f\n", result);
        result = Library.task6948(new int[]{5, 5, 5, 5, 5});
        System.out.printf("%.6f\n", result);
        result = Library.task6948(new int[]{});
        System.out.printf("%.6f\n", result);
        int[] array = new int[]{1, 9, 1, 30, 9, 1, 100};
        System.out.printf("%.6f\n", Library.task6948(array));
        System.out.printf("%.6f\n",
                Library.task6948(new int[]{
                        100000, 1, 1
                })
        );
    }
}
