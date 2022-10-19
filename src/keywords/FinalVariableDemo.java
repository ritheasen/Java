package keywords;

class Demo{
    final int ID; // if we dont want to change the value by anyone

    public Demo(){
        ID = 10;
        System.out.println(ID);
    }
}

public class FinalVariableDemo {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
    }
}
