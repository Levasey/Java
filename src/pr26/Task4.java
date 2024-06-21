package pr26;

public class Task4 {
    public static void main(String[] args) {
        int[] haystack = new int[]{9, 80, 7, -6, 50, 4 , -300};
        search(haystack, 4, 0);
    }

    public static void search(int[] haystack, int neede, int i){
        if (i >= haystack.length){
            System.out.println("Не найден");
            return;
        }
        if (haystack[i] == neede){
            System.out.println("Найден на индексе " + i);
            return;
        }
        search(haystack, neede, i + 1);
    }

    public static void search0(int[] haystack){
        search(haystack, 4, 1);
    }

    public static void search1(int[] haystack){
        search(haystack, 4, 2);
    }
    public static void search2(int[] haystack){
        search(haystack, 4, 3);
    }
    public static void search3(int[] haystack){
        search(haystack, 4, 4);
    }
    public static void search4(int[] haystack){
        search(haystack, 4, 5);
    }
    public static void search5(int[] haystack){
        if (haystack[5] == 4){
            System.out.println("Найден на индексе " + 5);
            return;
        }
    }
}
