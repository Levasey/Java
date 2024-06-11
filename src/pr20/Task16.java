package pr20;

public class Task16 {
    public static void main(String[] args) {
        String[] arr = "a;s;d;f".split(";");
        boolean result = Library.task7581(arr);
        System.out.println(result);
        arr = new String[]{"z", "x", "c", "v", "x"};
        System.out.println(Library.task7581(arr));
        result = Library.task7581("zx;df;ty;jk".split(";"));
        System.out.println(result);
        System.out.println(
                Library.task7581(
                        "q;a;z;w;s;x;e;d;c".split(";")
                )
        );
        System.out.println(Library.task7581(new String[0]));
    }
}
