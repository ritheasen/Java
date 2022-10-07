package ControlStatement;

import ControlStatement.ChildObjects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class If {
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
