package keywordAssignment;

class FinalDemoMethod {

    void run(){
        System.out.println("running");
    }

}

class Honda extends FinalDemoMethod {


    void run() {
        System.out.println("running safely with 100kmph");
    }

    public static void main(String args[]) {
        Honda honda = new Honda();
        honda.run();
    }
}