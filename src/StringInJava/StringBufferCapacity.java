package StringInJava;

public class StringBufferCapacity {
    public static void main(String args[])
    {
        java.lang.StringBuffer sb = new java.lang.StringBuffer();
        System.out.println(sb.capacity()); // default 16
        sb.append("Hello welcome to my java class");
        System.out.println(sb.capacity()); // now 16
        sb.append("java is hard to understand");
        System.out.println(sb.capacity());
        // Now (16*2)+2=34     i.e (oldcapacity*2)+2
    }
}
