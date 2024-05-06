package pr3;
import java.util.Scanner;
public class Tasks {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double x;           //объявление переменной типа double для числа с цифрами после запятой
        x = Double.parseDouble(s.nextLine()); //читаем значение от пользователя
        double result;      //объявление переменной для результата
        result = x + 7;     //вычисление результата
        System.out.printf("Результат равен %.4f\n", result); //Выражение %.4f обозначает, что нужно напечатать 4 знака после запятой


        System.out.println("Введите значение в градусах");
        if (s.hasNextInt()) {
            int angleDegree = s.nextInt();
            double angleRadian = angleDegree * Math.PI / 180;
            System.out.printf("%d градусов это %.4f радиан\n", angleDegree, angleRadian);
        } else {
            System.out.println("Вы ввели не целое число");
        }

        System.out.println("Введите высоту прямоугольника");
        int height = s.nextInt();
        System.out.println("Введите ширину прямоугольника");
        int width = s.nextInt();
        int area = width * height;
        System.out.printf("Площадь прямоугольника со сторонами %d и %d равна %d\n", height, width, area);

        System.out.println("Введите значение в радианах");
        double angleRadian1 = s.nextDouble();
        double angleDegree1 = angleRadian1 * 180 / Math.PI;
        System.out.printf("%.4f радиан это %.4f градусов\n",  angleRadian1, angleDegree1);

        System.out.println("Введите значение в узлах");
        int velocityKnots = s.nextInt();
        double velocityKmH = velocityKnots * 2;
        System.out.printf("Умножили %d на 2 получили %.4f\n", velocityKnots, velocityKmH);
        System.out.printf("10%% от %.4f это %.4f\n", velocityKmH, velocityKmH*0.1);
        velocityKmH -= velocityKmH*0.1;
        System.out.printf("%d узлов это приблизительно %.2f\n", velocityKnots, velocityKmH);

        System.out.println("Введите значение в километрах/час");
        int velocityInKmH = s.nextInt();
        System.out.println(velocityInKmH * 1000 + "м/ч");
        double velocityInMS = (velocityInKmH * 1000) / 60;
        System.out.printf("%.2f м/мин\n", velocityInMS);
        System.out.printf("%.2f м/с\n", velocityInMS / 60);

        System.out.println("Введите значение по шкале Цельсия");
        double cels = s.nextDouble();
        double far = (cels * 1.8) + 32;
        System.out.println(far);

        System.out.println("Введите значение в градусах");
        if (s.hasNextInt()) {
            int angleDegree = s.nextInt();
            double angleRad = angleDegree * Math.PI / 180;
            double result1 = Math.sin(angleRad);
            System.out.printf("Угол %d градусов это %.4f радиан.\n", angleDegree, angleRad);
            System.out.printf("Синус этого угла равен %.4f\n", result1);
        } else {
            System.out.println("Вы ввели не целое число");
        }

        System.out.println("Введите катет треугольника");
        int cathetus = s.nextInt();
        System.out.println("Введите прилежащий угол треугольника");
        int angelDeg = s.nextInt();
        double angelRad = angelDeg * Math.PI / 180;
        System.out.printf("Значение угла в радианах %.4f\n", angelRad);
        double cosAngel = Math.cos(angelRad);
        System.out.printf("Косинус этого угла %.4f\n", cosAngel);
        double Hypotenuse = cathetus / cosAngel;
        System.out.printf("Длина гипотенузы %.4f\n", Hypotenuse);

        System.out.println("Введите значение в градусах");
        int yDeg = s.nextInt();
        double yRad = yDeg * Math.PI / 180;
        double result2 = 5 * Math.cos(yRad);
        System.out.printf("%d градусов это %.4f радиан\n" +
                "результат вычисления %.4f\n", yDeg, yRad, result2);

        System.out.println("Введите значение в градусах");
        int aDeg = s.nextInt();
        System.out.println("Введите значение в градусах");
        int bDeg = s.nextInt();
        double result1 = (Math.sin(aDeg * Math.PI / 180) * Math.cos(bDeg * Math.PI / 180) + Math.cos(aDeg * Math.PI / 180) * Math.sin(bDeg * Math.PI / 180));
        System.out.printf("%.4f\n", result1);

        System.out.println("Введите значение в градусах");
        int xDeg = s.nextInt();
        System.out.println("Введите значение в градусах");
        int sDeg = s.nextInt();
        double result3 = 3 * Math.sin(2 * (xDeg * Math.PI / 180)) * Math.cos(3 * (sDeg * Math.PI / 180));
        System.out.printf("%.4f\n", result3);
    }
}
