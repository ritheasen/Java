package keywordAssignment;


class Students{
    int studID;
    String studName;
    static String studUni;

    static {
        studUni = "KIT";
    }

    void displayStudents(){
        System.out.println(studID + " : " + studName + " : " + studUni);
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        Students student1 = new Students();
        Students student2 = new Students();

        student1.studID = 101;
        student1.studName = "Paul";
        Students.studUni = "KIT";
        System.out.println(student1.toString());

        student2.studID = 102;
        student2.studName = "Peter";
        student1.studUni = "KIT";
        System.out.println(student2.toString());
    }
}
