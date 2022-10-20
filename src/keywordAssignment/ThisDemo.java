package keywordAssignment;

public class ThisDemo {

    // global
    int id;
    String name;

    ThisDemo(int id, String name) {
        this.id = id;    //global
        this.name = name;
//        id = id;        // global = local
//        name = name;

    }

    void display() {
        System.out.println(id + " " + name);
    }


    public static void main(String[] args) {
        ThisDemo s1 = new ThisDemo(001, "Yehee");
        ThisDemo s2 = new ThisDemo(002, "Yehaa");
        s1.display();
        s2.display();
    }
}
