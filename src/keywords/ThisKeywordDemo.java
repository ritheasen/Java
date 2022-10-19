package keywords;

public class ThisKeywordDemo {

    int studMarks;
    String studName;
    char studGrade;

//    public ThisKeywordDemo(int studMarks, String studName, char studGrade){
//        this.studMarks = studMarks;
//        this.studName = studName;
//        this.studGrade = studGrade;
//    }


//    public void ThisKeywordDemo() {
//        System.out.println("Within constructor");
//        System.out.println(this.studName);
//        System.out.println(this.studMarks);
//        System.out.println(this.studGrade);
//    }


//    void printStatement(){
//        this.ThisKeywordDemo();
//    }

    public void ThisKeywordDemo(){
        studMarks = 100;
        studName = "Peter";
        studGrade = 'I';
    }

    public static void main(String[] args) {
        ThisKeywordDemo objRef = new ThisKeywordDemo();

        System.out.println(objRef.studName);
        System.out.println(objRef.studMarks);
        System.out.println(objRef.studGrade);
//        ThisKeywordDemo objRef = new ThisKeywordDemo(100,"Peter",'I');
//        objRef.printStatement();
    }
}
