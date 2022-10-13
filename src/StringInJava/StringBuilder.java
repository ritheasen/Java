package StringInJava;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder str = new java.lang.StringBuilder("Java");
        System.out.println(str);

        str.append(" Tutorial");
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.reverse();
        System.out.println(str);

        str.delete(0, 5);
        System.out.println(str);

        str.insert(0, "C++ ");
        System.out.println(str);

        str.replace(0, 3, "ReactJS ");
        System.out.println(str);
    }
}
