package inheritance;

public class ChildClassDemo extends SuperClassDemo{

    void printValue() {
        super.id = 101;
        super.name = "Yeh";
        super.location = "Chennai";

        System.out.println(super.id);
        System.out.println(super.name);
        System.out.println(super.location);
    }

    ChildClassDemo(){
        System.out.println("constructor from child class");
    }
    public static void main(String[] args) {
        ChildClassDemo objRef = new ChildClassDemo();
        objRef.printValue();


    }
}
