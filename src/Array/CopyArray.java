package Array;

import java.util.Arrays;

public class CopyArray {
    public static void  main(String[] args) {
        String[] name = new String[5];
        name[0] = "A";
        name[1] = "B";
        name[2] = "C";
        name[3] = "D";
        name[4] = "E";

        String[] copyArray = Arrays.copyOf(name, 10);
        copyArray[5] = "xyz";


        for(int i = 0; i < name.length; i++){
            System.out.println(name[i]);
        }
        //System.out.println(name[i]);
    }
}
