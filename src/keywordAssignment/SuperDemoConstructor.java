package keywordAssignment;

public class SuperDemoConstructor {
    public static void main(String[] args) {
        Car2 c = new Car2();
    }
}

class Vehicle2 {
    int maxSpeed;
    Vehicle2() {
        System.out.println("Vehicle constructor");
    }
}

class Car2 extends Vehicle2{
    Car2() {
        super();
//        System.out.println("Car constructor");
    }
}