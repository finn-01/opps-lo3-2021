package Buoi4.Bai12;

public class Director extends Person{
    public float salary;

    public Director() {
    }

    public Director(float salary) {
        this.salary = salary;
    }

    public Director(String name, int bOY, String id, float salary) {
        super(name, bOY, id);
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
