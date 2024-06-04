package pr12;

public class Task3 {
    public static void main(String[] args) {
        String[] arr = new String[] {"успех" , "провал", "провал"};
        String temp;
        arr[1] = arr[0];
        temp = arr[0];
        arr[1] = arr[2];
        arr[0] = "провал";
        arr[2] = temp;
        System.out.println(arr[2]);
    }
}
