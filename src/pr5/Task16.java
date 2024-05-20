package pr5;
import java.util.Scanner;

public class Task16 {
    int small = 0;
    int big = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Даны две ёмкости объемом 5 и 8 литров\n" +
                "Необходимо чтобы в емкости 5 литров стало 4 литра воды.");
        int n = 0;
        Task16 puzzle = new Task16();

        while (n < 15) {
            System.out.println("Выбери действие:");
            System.out.println("1.Налить из крана в маленькую ёмкость\n" +
                    "2.Налить из крана в большую ёмкость\n" +
                    "3.Налить из маленькой ёмкости в большую\n" +
                    "4.Налить из большой ёмкости в маленькую\n" +
                    "5.Вылить из маленькой ёмкости в раковину\n" +
                    "6.Вылить из большой ёмкости в раковину");
            System.out.printf("Было: в маленькой %d из 5, в большой %d из 8\n", puzzle.small, puzzle.big);
            int b = s.nextInt();
            puzzle.vor(b);
            System.out.printf("Стало: в маленькой %d из 5, в большой %d из 8\n", puzzle.small, puzzle.big);
            if (puzzle.small == 4 || puzzle.big == 4){
                System.out.println("Вы правильно решили задачу.");
                break;
            }
            n++;
        }
    }
    public void vor(int b){
            if (b < 1 || b > 6) {
                System.out.println("Номер действия должен быть цифрой от 1 до 6");
            }
            if (b == 1) {
                System.out.println("Выбрано действие: 1");
                small = 5;
            }
            if (b == 2) {
                System.out.println("Выбрано действие: 2");
                big = 8;
            }
            if (b == 3) {
                System.out.println("Выбрано действие: 3");
                big = big + small;
                if (big > 9){
                    small = big % 8;
                    big = big - small;
                } else if (big < 8) {
                    small = 0;
                }
            }
            if (b == 4) {
                System.out.println("Выбрано действие: 4");
                small = small + big;
                if (small == 10) {
                    big = 5;
                    small = 5;
                } else if (small > 6) {
                    big = small % 5;
                    small -= big;
                } else if (small < 5) {
                    big = 0;
                }

            }
            if (b == 5) {
                System.out.println("Выбрано действие: 5");
                small = 0;
            }
            if (b == 6) {
                System.out.println("Выбрано действие: 6");
                big = 0;
            }

    }
}
