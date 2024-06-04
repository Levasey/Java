package pr20;

public class Task10 {
    public static void main(String[] args) {
        int[] standard = new int[]{5, 4, 3, 2, 1};
        int[] array = new int[]{5, 4, 3, 2, 1};
        String result = Library.task1995(standard, array);
        System.out.println(result);
        array = new int[]{5, 4, 3};
        result = Library.task1995(standard, array);
        System.out.println(result);
        System.out.println(Library.task1995(
                new int[]{9, 8, 7, 6},
                new int[]{9, 8, 7, 6, 5}
        ));
        standard = new int[]{9, 8, 7, 6, 5};
        array = new int[]{9, 111, 7};
        System.out.println(Library.task1995(standard, array));
        array = new int[]{6, 5, 4, 3, 2, 1};
        System.out.println(Library.task1995(
                new int[]{6, 5, 0, 3},
                array
        ));
    }
}
