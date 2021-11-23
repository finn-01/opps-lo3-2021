package Buoi4.Bai12;

public class Lecturers extends Person{
    public float salary;

    public Lecturers() {
    }

    public Lecturers(float salary) {
        this.salary = salary;
    }

    public Lecturers(String name, int bOY, String id, float salary) {
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
