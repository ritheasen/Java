package StringInJava;

public class StringBufferReplace {
    public static void main(String args[]){
        java.lang.StringBuffer sb=new java.lang.StringBuffer("HelloWorld");
        sb.replace(1,5,"Java");
        System.out.println(sb);
    }
}
