package keywordAssignment;



public class FinalDemoVariable {

    final int speedLimit = 90;//final variable
    void run(){
//        speedLimit=400;
        System.out.println(speedLimit);
    }

    public static void main(String[] args) {
        FinalDemoVariable obj=new FinalDemoVariable();
        obj.run();
    }
}


