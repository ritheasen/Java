package StringInJava;

public class StringBufferDelete {
    public static void main(String args[]){
        java.lang.StringBuffer sb=new java.lang.StringBuffer("StringBuffer");

        sb.delete(1,3);
        System.out.println(sb);

        sb.deleteCharAt(1);
        System.out.println(sb);
    }
}
