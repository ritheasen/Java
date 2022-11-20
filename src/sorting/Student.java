//package sorting;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Student implements Comparable<Student>{
//
//    private int id;
//    private  String name;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public static void main(String[] args) {
//        Student s1 = new Student(11, "qwe");
//        Student s2 = new Student(22, "qwevb");
//        Student s3 = new Student(33, "qwetrr");
//        Student s4 = new Student(44, "qwe23");
//        Student s5 = new Student(55, "qwewe");
//
//        List<Student> list = new ArrayList<>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        list.add(s4);
//        list.add(s5);
//
//
//        System.out.println(list.toString());
//    }
//
//    @Override
//    public int compareTo(Student s) {
//        if(id == s.id){
//            return 0;
//        } else if (id > s.id) {
//            return 1;
//        }else{
//            return -1;
//        }
//
//    }
//}
