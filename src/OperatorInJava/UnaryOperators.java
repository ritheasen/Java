package OperatorInJava;

public class UnaryOperators {
    public static void main(String args[]){
        int x=10;
        Boolean y = true;

        System.out.println(+x);//positive x
        System.out.println(-x);//negative x
        System.out.println(x++);//10 (11) x++ not show current value but already + 1
        System.out.println(++x);//12 ++x show current value of x
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10
        System.out.println(!y);
    }
}
