package Buoi4.Bai11;

public class Manager extends Employee{
    public float responsibilitySalary;

    public Manager() {
    }

    public Manager(float responsibilitySalary) {
        this.responsibilitySalary = responsibilitySalary;
    }

    public Manager(float salaryBasic, float salaryCoefficient, float responsibilitySalary) {
        super(salaryBasic, salaryCoefficient);
        this.responsibilitySalary = responsibilitySalary;
    }

    public Manager(String name, int old, String gender, float salaryBasic, float salaryCoefficient, float responsibilitySalary) {
        super(name, old, gender, salaryBasic, salaryCoefficient);
        this.responsibilitySalary = responsibilitySalary;
    }

    public float getResponsibilitySalary() {
        return responsibilitySalary;
    }

    public void setResponsibilitySalary(float responsibilitySalary) {
        this.responsibilitySalary = responsibilitySalary;
    }

    @Override
    public float getSalary() {
        return super.getSalary() + responsibilitySalary;
    }

    @Override
    public String toString() {
        return "Manager{ Name: " + super.getName() + ", old: " + super.getOld() + ", gender: " + super.getGender() +
                ", salary basic: " + this.getSalaryBasic() + ", salary coefficient: " + this.getSalaryCoefficient() +
                 ", responsibility salary: " + this.getResponsibilitySalary() + ", salary: " + this.getSalary() + "}";
    }
}
