package pr26;

public class Task1 {

    private static void work(int n) {
        if (n < 0) {
            return;
        }
        work(n - 2);
        System.out.println(n);
        work(n - 3);
    }

    public static void main(String[] args) {
        work(6);
    }

    private static void work6() {
        work4();
        System.out.println(6);
        work3();
    }

    private static void work4() {
        work2();
        System.out.println(4);
        work1();
    }

    private static void work1() {
        System.out.println(1);
    }

    private static void work2() {
        work0();
        System.out.println(2);
    }

    private static void work3() {
        work1();
        System.out.println(3);
        work0();
    }
        private static void work0() {
        System.out.println(0);
    }
}

