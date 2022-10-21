package inheritance;

public class Manager extends Employee{

    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    Manager(String name, double salary, double bonus){
        super(name, salary);

    }

}
