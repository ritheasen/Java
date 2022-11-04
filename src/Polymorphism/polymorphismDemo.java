package Polymorphism;

public class polymorphismDemo {

    public polymorphismDemo(){
        System.out.println("no argument constructor");
    }

    polymorphismDemo(int i){
        System.out.println("argument constructor");
    }

    polymorphismDemo(int i, int j){
        System.out.println("multiple argument constructor");
    }

    polymorphismDemo(int i, double j){
        System.out.println("exampple for implicit type conversion");
    }

    int add(int i, int j){
        return i + j;
    }

    int add(int i, int j, int k){
        return i + j + k;
    }


    public static void main(String[] args) {
        polymorphismDemo objRef = new polymorphismDemo(5,6);
    }
}
