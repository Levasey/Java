package pr20;

public class Task5 {
    public static void main(String[] args) {
        long result;
        result = Library.task6573(8, 13);
        System.out.println(result);
        result = Library.task6573(13, 8);
        System.out.println(result);
        int from, to;
        from = 159;
        to = 161;
        result = Library.task6573(from, to);
        System.out.println(result);
        from = -2;
        to = 600;
        System.out.println(Library.task6573(from, to));
        System.out.println(Library.task6573(648, 648));
        System.out.println(Library.task6573(35, 24));
    }
}
