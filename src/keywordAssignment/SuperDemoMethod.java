package keywordAssignment;

public class SuperDemoMethod {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.vroom();
    }
}

class Vehicle1 {
    public void vroom() {
        System.out.println("Vroom vroom");
    }
}

class Car1 extends Vehicle1{
    public void vroom() {
//        System.out.println("Veeee");
        super.vroom();
    }
}

