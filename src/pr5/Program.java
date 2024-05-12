package pr5;


public class Program {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        task8307("знаниям");
        String tmp = "цели";
        task8307(tmp);

        System.out.println("Задача 2");
        task8813("Джеймс", "Бонд");
        task8813("капитан", "Джек Воробей");
        String firstName = "Александр";
        String lastName = "Крюков";
        task8813(firstName, lastName);

        System.out.println("Задача 3");
        int coordinateX = 50;
        task5823(coordinateX, 50, 40, "yellow");
        coordinateX = 400;
        task5823(coordinateX, 300, 200, "green");
        coordinateX = 254;
        String colorOrange = "#cc6600";
        task5823(coordinateX, 356, 100, colorOrange);

        System.out.println("Задача 4");
        task2772(1, 2, 3);
        task2772(-3, 0, 2);

        System.out.println("Задача 8");
        System.out.println("Должно быть: Остаток на счету: 0 рублей 98 копеек.");
        task2375(3,87,2,89);
        System.out.println("Должно быть: Остаток на счету: -1 рублей 2 копеек");
        task2375(2,87,3,89);
        System.out.println("Должно быть: Остаток на счету: 6 рублей 98 копеек");
        task2375(10,87,3,89);

        System.out.println("Задача 13");
        System.out.println("Должно быть: Длина рулона в сантиметрах равна 40000\n" +
                "Из этого материала получится 2352 изделий и останется 16 см");
        task513(400, 17);

        System.out.println("Задача 15");
        System.out.println("Должно быть: 5*x^2 -3*x +7 = 0");
        task515(5, 2, 3);
        System.out.println("Должно быть: -2*x^2 +2*x +3 = 0");
        task515(-2, 2, 3);
        System.out.println("Должно быть: x^2 +2*x +3 = 0");
        task515(1, 2, 3);
        System.out.println("Должно быть: -1*x^2 +2*x +3 = 0");
        task515(-1, 2, 3);
        System.out.println("Должно быть: 2*x +3 = 0");
        task515(0,2, 3);
        System.out.println("Должно быть: 5*x^2 +x +7 = 0");
        task515(5, 1, 7);
        System.out.println("Должно быть: 5*x^2 -1*x +7 = 0");
        task515(5, -1, 7);
        System.out.println("Должно быть: 5*x^2 -3*x +7 = 0");
        task515(5, -2,7);
        System.out.println("Должно быть: 5*x^2 +7 = 0");
        task515(5, 0, 7);
        System.out.println("Должно быть: 5*x^2 +3*x -4 = 0");
        task515(5, 3, -4);
        System.out.println("Должно быть: 5*x^2 +3*x -1 = 0");
        task515(5, 3, -1);
        System.out.println("Должно быть: 5*x^2 +3*x +1 = 0");
        task515(5, 3, 1);
        System.out.println("Должно быть: 5*x^2 +3*x  = 0");
        task515(5, 3, 0);
        task515(0,0,2);
    }

    public static void task8307(String goal) {
        String res;
        res = "Мы стремимся к " + goal;
        System.out.println(res);
    }
    public static void task8813(String firstName, String lastName) {
        String Name = "Меня зовут " + lastName + ", " + firstName + " " + lastName;
        System.out.println(Name);
    }

    public static void task2375(int accountRoubles, int accountKop, int priceRoubles, int priceKop) {
        int account = accountRoubles * 100 + accountKop;
        int price = priceRoubles * 100 + priceKop;
        int count = account - price;
        int countRu = count / 100;
        int countKop = Math.abs(count % 100);
        System.out.println("Получилось: Остаток на счету: " + countRu + " рублей " + countKop + " копеек.");
    }

    public static void task5823(int coordinateX, int CY, int R, String colorOrange){
        System.out.println("<circle " + "cx = " + "\"" + coordinateX + "\"" + " cy = " + "\"" + CY + "\"" +  " r = " + "\"" +  R  + "\"" + " fill = " +  "\"" +  colorOrange  + "\"/>");
    }

    public static void task2772(int a, int b, int c){
        System.out.printf("Квадратное уравнение %d*x*x + %d*x + %d = 0.\n", a, b, c);
        System.out.printf("Его дискриминант вычисляется по формуле: d = %d*%d - 4*%d*%d\n", b, b, a, c);
    }

    public static void task513(int totalM, int partCM){
        int pieces = (totalM * 100) / partCM;
        int remain = (totalM * 100) % partCM;
        System.out.println("Получилось: Длина рулона в сантиметрах равна " + totalM * 100 + "\n" +
                "Из этого материала получится " + pieces + " изделий и останется " + remain + " см");
    }

    public static void task515(int a, int b, int c) {
        if (a == 0) {
            System.out.printf("Получилось : %d*x + %d = 0.\n", b, c);
        }
        else if (a == 1){
            System.out.printf("Получилось : x^2 + %d*x + %d = 0.\n", b, c);
        }
        else if (a == -1){
            System.out.printf("Получилось : -x^2 + %d*x + %d = 0.\n", b, c);
        }
        else if (b == 0) {
            System.out.printf("Получилось : %d*x^2 + %d = 0.\n", a, c);
        }
        else if (b == 1){
            System.out.printf("Получилось : %d*x^2 + x + %d = 0.\n", a, c);
        }
        else if (b == -1){
            System.out.printf("Получилось : %d*x^2 - x + %d = 0.\n", a, c);
        }
        else if (c == 0) {
            System.out.printf("Получилось : %d*x^2 + %d*x = 0.\n", a, b);
        }
        else if (b < 0) {
            System.out.printf("Получилось : %d*x^2 - %d*x + %d = 0.\n", a, Math.abs(b), c);
        }
        else if (c < 0) {
            System.out.printf("Получилось : %d*x^2 + %d*x - %d = 0.\n", a, b, Math.abs(c));
        } else {
            System.out.printf("Получилось : %d*x^2 + %d*x + %d = 0.\n", a, b, c);
        }
    }
}
