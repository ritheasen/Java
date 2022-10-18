package InterfaceDemo;

public interface Shape {

    void draw();

    default void printSomeWord(){
        System.out.println("sample default method");
    }

}
