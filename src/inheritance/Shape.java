package inheritance;

public class Shape {
    void shape() {
        System.out.println("printing shape on the inheritance");
    }
}


class Circle extends Shape {
    void shape() {
        System.out.println("printing circle");
    }
}