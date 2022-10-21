package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Petter", 35000);
//        System.out.println(emp1.salary + " " + emp1.name);
        System.out.println(emp1.getName() + "is getting salary Rs" + emp1.getSalary());


        emp1.raiseSalary(20);
        emp1.setSalary(80000);
        System.out.println(emp1.getName() + "is getting slaary Rs" + emp1.getSalary());



        Manager managerObj = new Manager("Raghav",80000, 20000);

        System.out.println(managerObj.getName() + "is getting Salary " + managerObj.getSalary());

        managerObj.setBonus(20000);

        System.out.println(managerObj.getSalary());
    }
}
