package pr20;

public class Task12 {
    public static void main(String[] args) {
        double[] data, result;
        data = new double[]{9, 8, 7, 6, 5, 4};
        result = Library.task2936(31, data);
        System.out.println("При умножении массива");
        int i = 0;
        while (i < data.length) {
            System.out.print(data[i] + "  ");
            i++;
        }
        System.out.println("\nна число 31, получился массив ");
        i = 0;
        while (i < result.length) {
            System.out.print(result[i] + "  ");
            i++;
        }
    }
}
