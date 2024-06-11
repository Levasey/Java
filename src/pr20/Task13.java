package pr20;

public class Task13 {
    public static void main(String[] args) {
        double[] data = new double[]{4, 2, 3, 4, 3, 2};
        double[] result = Library.task3539(data);
        System.out.println("Исходный массив:");
        int i = 0;
        while (i < data.length) {
            System.out.print(data[i] + " ");
            i += 1;
        }
        System.out.println("\nРезультат обработки:");
        i = 0;
        while (i < result.length) {
            System.out.print(result[i] + " ");
            i += 1;
        }
    }
}
