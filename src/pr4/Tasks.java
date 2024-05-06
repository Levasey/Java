package pr4;
import java.util.Scanner;
public class Tasks {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double edge;
        edge = Double.parseDouble(input.nextLine());
        if (edge <= 0) {
            //сообщение об ошибке
            System.out.println("Значение edge должно быть положительным");
        }
        if (edge > 0) {
            //расчет и вывод результата
            double result;
            result = 6 * edge * edge;
            System.out.printf("Площадь поверхности куба равна %.4f\n", result);
        }

        System.out.println("Введи высоту треугольника");
        int heightTri = input.nextInt();
        System.out.println("Введи значение грани треугольника");
        int edgeTri = input.nextInt();
        if (heightTri > 0 && edgeTri > 0){
            double area = edgeTri * heightTri / 2;
            System.out.printf("Площадь прямоугольного треугольника с высотой %d и основанием %d равна %.4f\n", heightTri, edgeTri, area);
        }
        if (heightTri < 0){
            System.out.println("Высота треугольника должна быть положительна");
        }
        if (edgeTri < 0){
            System.out.println("Длина основания треугольника должна быть положительна");
        }

        System.out.println("Введи число");
        int x = input.nextInt();
        if (x >= 0){
            double res = Math.sqrt(x);
            System.out.printf("Корень из %d равен %.4f\n", x, res);
        }
        else {
            System.out.println("Значение X должно быть неотрицательным");
        }

        System.out.println("Введи число");
        int x1 = input.nextInt();
        if (61 - x1 >= 0){
            double res1 = 3 * Math.sqrt(61 - x1);
            System.out.printf("Корень из %d равен %.4f\n", x1, res1);
        }
        else {
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        }

        System.out.println("Введи число A");
        int a = input.nextInt();
        System.out.println("Введи число B");
        int b = input.nextInt();
        if (b < 0){
            double res2 = a * Math.sqrt(-7 * b);
            System.out.printf("Результат вычисления %.4f\n", res2);
        }
        else {
            System.out.println("Значение B должно быть не положительным");
        }

        System.out.println("Введи число X");
        int x2 = input.nextInt();
        System.out.println("Введи число Y");
        int y2 = input.nextInt();
        if (x2 > 0 && y2 > 0){
            double res3 = -5 * Math.sqrt(x2 + Math.sqrt(y2));;
            System.out.printf("Результат вычислений %.4f\n", res3);
        }
        if (x2 < 0){
            System.out.println("Подкоренное выражение должно быть неотрицательным");
        }
        if (y2 < 0){
            System.out.println("Значение y должно быть неотрицательным");
        }

        int divider; //Объявление переменных типа int для целых чисел
        int dividend = input.nextInt();//читаем значение от пользователя
        divider = input.nextInt();
        if (divider == 0) {//если значение переменной divider строго равно 0
            System.out.println("Делитель не может быть равен 0");
        }
        if (divider != 0) {//если значение переменной divider не равно 0
            int quotient = dividend / divider;
            int remainder = dividend % divider;//Нахождение остатка от деления dividend на divider
            System.out.printf("Делимое %d, делитель %d", dividend, divider);//Выражение %d обозначает, что нужно написать целое число
            System.out.printf(", частное %d, остаток %d\n", quotient, remainder);
        }

        System.out.println("Введи угол");
        int aInitial = input.nextInt();
        if (aInitial >= 0){
            int aRemainder = aInitial % 360;
            System.out.printf("Угол %d равен углу %d\n", aInitial, aRemainder);
        }
        else {
            System.out.println("Значение X должно быть неотрицательным");
        }

        System.out.println("Время в секундах");
        int timeInSeconds = input.nextInt();
        if (timeInSeconds >= 0){
            int timeInMin = (timeInSeconds / 60) % 60;
            int timeInHour = timeInSeconds / 3600;
            timeInSeconds = timeInSeconds % 60;
            System.out.printf("%d часов %d минут %d секунд\n", timeInHour, timeInMin, timeInSeconds);
        }
        else {
            System.out.println("Количество времени должно быть неотрицательным");
        }
    }
}
