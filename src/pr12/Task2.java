package pr12;

public class Task2 {
    public static void main(String[] args) {
        String[] arr = {"ус", "пех", "про", "вал", "резерв"};
        int i = 0;
        i = i + 1;
        arr[i] = arr[1];
        arr[4] = arr[i];
        arr[3] = arr[4];
        i = i + 1;
        arr[i] = arr[0];
        i = i + 1;
        System.out.print(arr[2]);
        System.out.println(arr[3]);
    }
}
