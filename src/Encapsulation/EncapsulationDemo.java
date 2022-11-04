package Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {

        Employee objRef = new Employee();
        objRef.setName("Alex");
        objRef.setDepartment("development");
        objRef.setLocation("Charlotte");

        System.out.println(objRef.getName()+ " - " + objRef.getDepartment() + " - " + objRef.getLocation());
    }
}
