package pr12;

public class Task1 {
    public static void main(String[] args) {
        String[] arr = {"ус", "пех", "резерв", "вал", "про"};
        arr[3] = arr[1];
        arr[1] = arr[3];
        arr[2] = arr[0];
        arr[0] = arr[4];
        System.out.print(arr[2]);
        System.out.println(arr[3]);
    }
}
