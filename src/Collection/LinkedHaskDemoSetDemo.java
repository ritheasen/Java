package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHaskDemoSetDemo {
    public static void main(String[] args) {
        Set<String> listValues = new LinkedHashSet<>();

        listValues.add("asdas");
        listValues.add("asdrtuyas");
        listValues.add("asdasqwer");
        listValues.add("ascvbndas");

        System.out.println("List values" + listValues);

        Set<String> setValues = new HashSet<>(listValues);

        System.out.println(setValues);

    }
}
