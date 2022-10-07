package ControlStatement;

public class SelectionDemo {
    public static void main(String[] args){
        String firstName = "DineshKumar";
        String lastName = "Anand";

        if (firstName.equalsIgnoreCase("DineshKumar")){
            System.out.println("Hello Mr." + firstName);
        } else if(lastName.equalsIgnoreCase("Anand")){
            System.out.println("Hello Mr." + lastName);
        } else if(firstName.equalsIgnoreCase("SenthilKumar")){
            System.out.println("couldn't identify the name in this class");
        }
    }
}
