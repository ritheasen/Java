package OperatorInJava;

public class InstanceOfOperator {
    public static void main(String args[]){
        String a = "Hello world";
        boolean result;

        // checks if str is an instance of
        // the String class
        result = a instanceof String;
        System.out.println("Is (a) an object of String? " + result);
    }
}
