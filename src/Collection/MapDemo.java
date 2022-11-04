package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> mapValues = new HashMap<>();

        mapValues.put(1,"A");
        mapValues.put(2,"B");
        mapValues.put(3,"C");

//        Set setValue = mapValues.entrySet();
//
//        Iterator itr = setValue.iterator();
//
//        while(itr.hasNext()){
//            Map.Entry<Integer, String> entry = (Map.Entry)itr.next();
//            System.out.println(entry.getKey() + " = " + entry.getValue());

//        for(Map.Entry<Integer, String> entry = mapValues.entrySet()){
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//        }

        mapValues.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

    }
}
