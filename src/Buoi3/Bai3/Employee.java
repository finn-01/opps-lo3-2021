package Buoi3.Bai3;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private double salaryMonth;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, double salaryMonth) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryMonth = salaryMonth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalaryMonth() {
        return salaryMonth;
    }

    public void setSalaryMonth(double salaryMonth) {
        this.salaryMonth = salaryMonth;
    }

    public String getFullName(){
        return firstName + lastName;
    }

    public double getSalaryYear(){
        return salaryMonth * 12;
    }

    public void showInfo(){
        System.out.println("Information: ");
        System.out.println("Name: " + this.getFullName());
        System.out.println("ID: " + this.getId());
        System.out.println("Salary: " + this.getSalaryMonth());
        System.out.println("Salary year: " + this.getSalaryYear());
    }
}
