package Collection;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//        for(int i = 1; i <= 5; i++){
//            list.add(i);
//        }

        list.add(200);
        list.add(300);
        list.add(20);
        list.add(2);

        //printing list
        System.out.println(list);

        //removing elements from the list
//        list.remove(3);

        //printing again
        System.out.println(list);

//        Iterator<Integer> i = list.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());

//        ListIterator<Integer> i = list.listIterator();
//        while(i.hasPrevious()){
//            System.out.println(i.previous());


        String[] array = {"asd", "qwe", "oiup", "xcb"};

//        List<String> lg = new ArrayList<>();
//
//        for(String s:array) {
//            lg.add(s);
//        }
//
//        System.out.println(lg);

//        List<String> lg = Arrays.asList(array);
//
//        for(String s:array) {
//            lg.add(s);
//        }
//
//        System.out.println(lg);

        List<String> lg = Arrays.asList(array);

//        System.out.println(lg);

        String[] copiedArray = lg.toArray(new String[lg.size()]);

        System.out.println(Arrays.toString(copiedArray));




        }
    }
