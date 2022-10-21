package inheritance;

public class Employee {
    String name;
    double salary;

    // writing gatters and setters for private members

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void raiseSalary(double percentage){
        salary += (salary * percentage / 100);
    }
}
