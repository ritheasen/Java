package Collection;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {
        List<Integer> vectorList = new Vector<>();

        for(int i = 1; i <= 5; i++){
            vectorList.add(i);
        }

        System.out.println(vectorList);

        vectorList.remove(3);

        System.out.println(vectorList);
    }
}
