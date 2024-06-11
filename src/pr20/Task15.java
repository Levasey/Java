package pr20;

public class Task15 {
    public static void main(String[] args) {
        double a = -2, b = 7;
        boolean result;
        double x = -10;
        result = Library.task6401(a, b, x);
        if (result) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }
        result = Library.task6401(b, a, x);
        if (result) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }
        x = 0;
        if (Library.task6401(-2, 7, x)) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }

        if (Library.task6401(7, -2, x)) {
            System.out.println(x + " принадлежит интервалу");
        } else {
            System.out.println(x + " за пределами интервала");
        }
        System.out.println(Library.task6401(-2, 7, 15));
        System.out.println(Library.task6401(-2, 7, 4));
    }
}
