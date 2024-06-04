package pr12;

public class Task4 {
    public static void main(String[] args) {
        String[] arr = new String[] {"провал0" , "провал1", "провал2", "успех", "провал4", "провал5"};
        String temp;
        arr[4] = arr[3];
        arr[5] = arr[4];
        temp = arr[5];
        arr[0] = temp;
        arr[1] = arr[0];
        arr[2] = arr[1];
        System.out.println(arr[2]);
    }
}
