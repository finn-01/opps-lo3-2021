package Buoi4.Bai11;

public class Employee extends Person{
    public float salaryBasic;
    public float salaryCoefficient;

    public Employee() {
    }

    public Employee(float salaryBasic, float salaryCoefficient) {
        this.salaryBasic = salaryBasic;
        this.salaryCoefficient = salaryCoefficient;
    }

    public Employee(String name, int old, String gender, float salaryBasic, float salaryCoefficient) {
        super(name, old, gender);
        this.salaryBasic = salaryBasic;
        this.salaryCoefficient = salaryCoefficient;
    }

    public float getSalaryBasic() {
        return salaryBasic;
    }

    public void setSalaryBasic(float salaryBasic) {
        this.salaryBasic = salaryBasic;
    }

    public float getSalaryCoefficient() {
        return salaryCoefficient;
    }

    public void setSalaryCoefficient(float salaryCoefficient) {
        this.salaryCoefficient = salaryCoefficient;
    }

    public float getSalary(){
        return salaryBasic * salaryCoefficient;
    }

    @Override
    public String toString() {
        return "Employee{ Name: " + super.getName() + ", old: " + super.getOld() + ", gender: " + super.getGender() +
                ", salary basic: " + this.getSalaryBasic() + ", salary coefficient: " + this.getSalaryCoefficient() +
                ", salary: " + this.getSalary() + "}";
    }
}
