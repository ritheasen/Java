package StringInJava;

public class StringBufferInsert {
    public static void main(String args[])
    {
        java.lang.StringBuffer sb = new java.lang.StringBuffer("Hello World");
        sb.insert(1, "Java");
        // Now original string is changed
        System.out.println(sb);
    }
}
