package pr20;

public class Task2 {
    public static void main(String[] args) {
        double result;
        result = Library.task4776(69.97);
        System.out.printf("%.4f\n", result);
//для наглядности проверки можно писать дополнительные условия
        if (0.3425 <= result && result <= 0.3426) {
            System.out.println("Верно");
        } else {
            System.out.println("Результат некорректный");
        }
        result = Library.task4776(31);
        System.out.printf("%.4f\n", result);
        System.out.printf("%.4f\n", Library.task4776(90));
    }
}
