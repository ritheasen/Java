package ControlStatement;

import java.util.Arrays;
import java.util.List;


public class ChildObjects {
    public static void main(String[] args){
        List<Object> childrens = Arrays.asList("B", "E","G") ;
        List<Object> parents = Arrays.asList("A", "C","D","F","G", childrens);

        if(parents.isEmpty()){
            if(parents.contains(childrens))
                for(Object o:childrens){
                    System.out.println(o);
                }
            return;
        }
    }
}
