

public class Main {
    static int staticVariable = 30;

    int instanceVariable = 20;

    public static void main(String[] args){
        int localVariable = 10;
        Main obj1 = new Main();
        System.out.println("This is my instance variable : " + obj1.instanceVariable); // require obj1
        System.out.println("This is my static variable : " + Main.staticVariable); // require class
        System.out.println("This is my local variable : " + localVariable); // need to be in
    }
//    public static void main(String[] args) {
//        System.out.println("Hello world!");
//    }
}