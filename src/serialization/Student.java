package serialization;

import java.io.*;

public class Student extends Person {

    String course;
    int fee;

    public Student(int id, String name,Address address, String course, int fee) {
        super(id , name, address);
        this.course = course;
        this.fee = fee;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //writting the student object into somewhere
        Address address1 = new Address("qwe","xcvbxcvb", 600100L);
        Student s1 = new Student(101,"Daba",address1,"Java",100);


        FileOutputStream fileInput = new FileOutputStream("D:\\serialization.txt");

        ObjectOutputStream out = new ObjectOutputStream(fileInput);

        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("asdasd");

//        FileInputStream fileIn = new FileInputStream("D:\\serialization.txt");
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:\\serialization.txt"));
        Student s = (Student)input.readObject();
        System.out.println(s.id + " === " + s.name + s.course + " === " + s.fee);
        input.close();


    }
}
