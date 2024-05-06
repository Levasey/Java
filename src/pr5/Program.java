package pr5;

public class Program {
    public static void main(String[] args) {
        task8307("знаниям");
        String tmp = "цели";
        task8307(tmp);
        task8813("Джеймс", "Бонд");
        task8813("капитан", "Джек Воробей");
        String firstName = "Александр";
        String lastName = "Крюков";
        task8813(firstName, lastName);
        System.out.println("Должно быть: Остаток на счету: 0 рублей 98 копеек.");
        task2375(3,87,2,89);
        System.out.println("Должно быть: Остаток на счету: -1 рублей 2 копеек");
        task2375(2,87,3,89);
        System.out.println("Должно быть: Остаток на счету: 6 рублей 98 копеек");
        task2375(10,87,3,89);
        System.out.println("Должно быть: Длина рулона в сантиметрах равна 40000\n" +
                "Из этого материала получится 2352 изделий и останется 16 см");
        task513(400, 17);
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

    public static void task513(int totalM, int partCM){
        int pieces = (totalM * 100) / partCM;
        int remain = (totalM * 100) % partCM;
        System.out.println("Получилось: Длина рулона в сантиметрах равна " + totalM * 100 + "\n" +
                "Из этого материала получится " + pieces + " изделий и останется " + remain + " см");
    }
}
