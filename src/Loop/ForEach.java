package Loop;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args){
        List<Integer> l1 = new ArrayList<>();

        for ( int i = 100; i > 1; i--){
            int x = --i;
            int y = --x;
            l1.add(y);
        }

        for (Integer keys:l1){
            System.out.println("Number" + keys);
        }
    }
}
