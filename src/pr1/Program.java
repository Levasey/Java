package pr1;

public class Program {
    public static void main(String[] args){
        System.out.println("Ура! заработало");
        System.out.println("+---+");
        System.out.println("|   |");
        System.out.println("|   |");
        System.out.println("+---+");
        System.out.println("{ \"x\":15, \"y\": 28.7 }");
        System.out.println("  *  \n  *  \n*****\n  *  \n  *  ");
        System.out.println("микро" + "мир");
        System.out.println("сине" + "зеленый");
        System.out.println("высоко" + "скоростной");
        System.out.println("отказо" + "устойчивый");
        System.out.println("а" + "у");
        System.out.println("Три девицы под окном\n" +
                "Пряли поздно вечерком.\n" +
                "\"Кабы я была царица, —\n" +
                "Говорит одна девица, —\n" +
                "То на весь крещеный мир\n" +
                "Приготовила б я пир\".\n" +
                "\"Кабы я была царица, —\n" +
                "Говорит ее сестрица, —\n" +
                "То на весь бы мир одна\n" +
                "Наткала я полотна\".\n" +
                "\"Кабы я была царица, —\n" +
                "Третья молвила сестрица, —\n" +
                "Я б для батюшки-царя\n" +
                "Родила богатыря\".");
        System.out.println(" /\\\n" +
                "//\\\\\n" +
                "//\\\\\n" +
                " ][ ");
        System.out.println("<h1>Мой первый векторный рисунок</h1>\n" +
                "\n" +
                "<svg width=\"800\" height=\"600\">\n" +
                "    <circle cx=\"50\" cy=\"50\" r=\"40\" stroke=\"green\"\n" +
                "        stroke-width=\"4\" fill=\"yellow\"/>\n" +
                "</svg>");
        System.out.println("Температура воздуха: 25\u00B0C");
        System.out.println("Длина волны (\u03BB) вычисляется по формуле: \u03BB=2\u03C0\u03BD/\u03C9, где:\n" +
                "\u03C0 - (пи) математическая константа\n" +
                "\u03BD - (ню) фазовая скорость\n" +
                "\u03C9 - (омега) угловая частота");
        String a, b, c; //Объявляю переменные a, b, c для хранения текста
        c = "успех";  //Записываю в переменную c значение "успех"
        b = "провал"; //Записываю в переменную b значение "провал"
        b = c;          //Читаю из c, записываю в b
        c = b;          //Читаю из b, записываю в c
        a = b;          //Читаю из b, записываю в a
        System.out.println(a);//Печать результата на экран

        c = "успех";
        b = "тоже провал";
        a = "провал";
        b = c;
        a = b;
        c = b;
        b = a;
        System.out.println(a);

        String d;
        c = "успех";
        a = "тоже провал";
        b = "провал";
        d = c;
        b = d;
        d = b;
        a = b;
        c = b;
        System.out.println(a);

        c = "успех";
        a = "тоже провал";
        b = "провал";
        d = c;
        b = c;
        d = b;
        b = d;
        a = d;
        a = b;
        System.out.println(a);

        String undersong = "Йо-хо-хо, и бутылка рому!";
        System.out.println("Пятнадцать человек на сундук мертвеца. \n" + undersong);
        System.out.println("Пей, и дьявол тебя доведет до конца. \n" + undersong);

        String Jack = "Который построил Джек.\n";
        String House = "В доме,\n";
        String Wheat = "Которая в тёмном чулане хранится\n";
        String Tit = "Которая часто ворует пшеницу,\n";
        String Cat = "Который пугает и ловит синицу,\n";
        String Dog = "Который за шиворот треплет кота,\n";
        String Cow = "Лягнувшая старого пса без хвоста,\n";
        String OldLady = "Которая доит корову безрогую,\n";
        String Cowboy =  "Который бранится с коровницей строгою,\n";
        System.out.println("Самуил Маршак. Дом, " + Jack +
                "\n" +
                "Вот дом,\n" + Jack +
                "\n" +
                "А это пшеница,\n" + Wheat + House + Jack +
                "\n" +
                "А это весёлая птица-синица,\n" + Tit + Wheat + House + Jack +
                "\n" +
                "Вот кот,\n" + Cat + Tit + Wheat + House + Jack +
                "\n" +
                "Вот пёс без хвоста,\n" + Dog + Cat + Tit + Wheat + House + Jack +
                "\n" +
                "А это корова безрогая,\n" + Cow + Dog + Cat + Tit + Wheat + House + Jack +
                "\n" +
                "А это старушка, седая и строгая,\n" + OldLady + Cow + Dog + Cat + Tit + Wheat + House + Jack +
                "\n" +
                "А это ленивый и толстый пастух,\n" + Cowboy + OldLady + Cow + Dog + Cat + Tit + Wheat + House + Jack +
                "\n" +
                "Вот два петуха,\n" +
                "Которые будят того пастуха,\n" + Cowboy + OldLady + Cow + Dog + Cat + Tit + Wheat + House + Jack);
    }
}
