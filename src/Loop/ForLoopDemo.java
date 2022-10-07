package Loop;

import java.util.ArrayList;
import java.util.List;

public class ForLoopDemo {
    public static void  main(String[] args){
        List<Integer> l1 = new ArrayList<>();

        for(int i = 100; i > 0; i -= 5){
            l1.add(i);
        }
        System.out.println(l1);
    }
}
