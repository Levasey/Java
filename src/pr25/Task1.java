package pr25;

import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<String> fragments;//объявляю переменную для хранения листа строк
        fragments = new ArrayList<>();//создаю экземпляр класса листа
        String line = s.nextLine();
        fragments.add(line);//добавляю элемент в лист
        line = s.nextLine();
        fragments.add(line);
        line = s.nextLine();
        fragments.add(line);
        line = s.nextLine();
        fragments.add(line);
//печать элементов листа на экран
        int i = 0;
        while (i < fragments.size()) {//ограничение цикла - количество элементов в листе
            System.out.print(fragments.get(i) + " ");//печатаю элемент листа на экране
            i = i + 1;
        }
    }
}
