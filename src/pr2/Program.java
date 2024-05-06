package pr2;

import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);  //создать Scanner
        String goal;             //Объявить переменную для хранения текста
        goal = input.nextLine(); //Получить данные от пользователя и записать их в переменную
        System.out.println("Мы стремимся к " + goal);  //Напечатать текст на экран

        String problem = input.nextLine();
        System.out.println(problem + " нас не остановят!");

        String adjective = input.nextLine();
        System.out.println("Программирование это " + adjective);

        String first = input.nextLine();
        String second = input.nextLine();
        System.out.println(first + " " + second);

        System.out.println("Задача 1910");
        System.out.println("Введите название компании ");
        String companyName = input.nextLine();
        System.out.println("Введите наименование товара");
        String productName = input.nextLine();
        System.out.println("Введите цену товара");
        String productCost = input.nextLine();
        System.out.println("Распродажа в " + companyName + "\n" +
                "Наши " + productName + " по супер цене. Всего " + productCost + "\n" +
                "Торопитесь, предложение ограничено!\n");

        System.out.println("первая строка");
        System.out.print("вторая строка");
        System.out.println(" с продолжением");
        System.out.print("третья");
        System.out.println(" строка");
        System.out.print("четвертая");
        System.out.print(" строка");
        System.out.println(" с продолжением");
        System.out.print("пятая");
        System.out.println(" строка");

        String clientName = "Иван Иванович";
        String companyName1 = "ООО Рога и копыта";
        System.out.println("Задача 4131");
        System.out.print("Уважаемый " + clientName);
        System.out.println(" Поздравляем с Днем рождения.");
        System.out.print("Пусть каждый день будет наполнен счастьем! \nВаша ");
        System.out.print(companyName1);
        System.out.println(".");

        String accountBalance = "0.37";
        String messageText = "Пора пополнить счет!\n";
        System.out.println("Задача 7365");
        messageText +=  "Баланс Вашего счета составляет ";
        messageText += accountBalance;
        messageText += " руб.";
        System.out.println(messageText);

        System.out.println("Введите имя: ");
        String firstName = input.nextLine();
        System.out.println("Введите фамилию: ");
        String lastName = input.nextLine();
        System.out.printf("Меня зовут %s, %s %s\n", lastName, firstName, lastName);

        System.out.println("Введите x:");
        String x = input.nextLine();
        System.out.println("Введите y:");
        String y = input.nextLine();
        System.out.printf("INSERT INTO points (x, y) VALUES ('%s', '%s')\n", x, y);

        System.out.println("Введите cx:");
        String cx = input.nextLine();
        System.out.println("Введите cy:");
        String cy = input.nextLine();
        System.out.println("Введите r:");
        String r = input.nextLine();
        System.out.println("Введите fill:");
        String fill = input.nextLine();
        System.out.printf("<circle cx=\"%s\" cy=\"%s\" r=\"%s\" fill=\"%s\"/>\n", cx, cy, r, fill);

        System.out.println("Введите a:");
        String a = input.nextLine();
        System.out.println("Введите b:");
        String b = input.nextLine();
        System.out.println("Введите c:");
        String c = input.nextLine();
        System.out.printf("Квадратное уравнение %s*x*x + %s*x + %s = 0.\n", a, b, c);
        System.out.printf("Его дискриминант вычисляется по формуле: d = %s*%s - 4*%s*%s\n", b, b, a, c);
     }
}
