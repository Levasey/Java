package pr25;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public static ArrayList<Integer> task8317(int x){
        ArrayList<Integer> digits = new ArrayList<>();
        for (int i = 1; i <= x; i++) {
            if (x % i == 0){
                digits.add(i);
            }
        }
        return digits;
    }
}
