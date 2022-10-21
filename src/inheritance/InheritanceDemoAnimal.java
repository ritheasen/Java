package inheritance;

import java.awt.*;

public class InheritanceDemoAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();


        Animal a = cat;
        Cat c = (Cat)a;

        boolean isCat = cat instanceof Cat;
        System.out.println(isCat);
    }
}
