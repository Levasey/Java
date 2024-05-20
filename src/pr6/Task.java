package pr6;

public class Task {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        task601(173, 179);
        task601(359, 271);
        task601(439, -761);
        task601(5, 5);
        task601(0, -15);
        System.out.println();

        System.out.println("Задача 2");
        task602(1, 2, 3);
        task602(100, 215, 478);
        task602(7, 4, -2);
        task602(-2, -1, 0);
        task602(0, 5, -7);
        task602(43, 99, 21);
        System.out.println();

        System.out.println("Задача 3");
        task603(9);
        task603(13.94);
        task603(0);
        task603(-7.8);
        task603(-0.25);
        System.out.println();

    }
    public static void task601(int P, int Q){
        int max, min;
        if (P > Q){
            max = P;
            min = Q;
        }else {
            max = Q;
            min = P;
        }
        int diff = max - min;
        System.out.println("Максимальное " + max + ", минимальное " + min + ". Разница " + diff + ".");
    }
    public static void task602(int x, int y, int z){
        int max;
        char letter;
        if (x > y && x > z){
            max = x;
            letter = 'X';
        } else if (y > x && y > z) {
            max = y;
            letter = 'Y';
        } else {
            max = z;
            letter = 'Z';
        }
        System.out.printf("Наибольшее число это %s со значением %d\n", letter, max);
    }
    public static void task603(double k){
        if (k > 0){
            System.out.println("Корень из " + k + " равен " + Math.sqrt(k));
        }
        else {
            System.out.println("Квадрат числа " + k + " равен " + Math.pow(k, 2));
        }
    }
}
