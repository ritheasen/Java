package keywordAssignment;

public class SuperDemoVariable {
    public static void main(String[] args) {
        Car c = new Car();
//        System.out.println(c.maxSpeed);
        c.display();
    }
}

class Vehicle {
    int maxSpeed = 120;
}

class Car extends Vehicle{
    int maxSpeed = 100;

    public void display(){
        System.out.println(super.maxSpeed);
//        System.out.println(maxSpeed);
    }
}
