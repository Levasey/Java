package pr26;

public class Task2 {
    private static void level1() {
        System.out.println("Предисловие");
        System.out.println("Глава 1");
        level2();
    }
    private static void level2() {
        System.out.println("Глава 2");
        level3();
    }
    private static void level3() {
        System.out.println("Глава 3");
        level4();
    }
    private static void level4() {
        System.out.println("Глава 4");
        System.out.println("Заключение");
    }
    public static void main(String[] args) {
        level(4, 4);
    }
    public static void level(int x, int last){
        int count = x-1;
        if (x <= 0){
            System.out.println("Предисловие");
            return;
        }
        level(x -1,last);
        System.out.println("Глава " + x);
        if (x == count){
            System.out.println("Заключение");
        }
    }
}
