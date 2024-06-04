package pr20;

public class Task1 {
    public static void main(String[] args) {
        double result = Library.task7611(11.13);
        System.out.printf("%.4f\n", result);
        double value = -79.19;
        result = Library.task7611(value);//в качестве аргумента передано значение переменной
        System.out.printf("%.4f\n", result);
        System.out.printf("%.4f\n", Library.task7611(0));//результат используется без промежуточной переменной
    }
}
