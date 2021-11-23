package Buoi4.Bai11;

public class Main11 {
    public static void main(String[] args) {
        Employee employee = new Employee("Sam", 20, "Nam", 1000, 12);
        Manager manager = new Manager("Ng Sam", 21, "Nu", 1000, 12, 500);
        Student student = new Student("Sam Nguyen", 22, "Be De", "ATXXXX");
        Programmer programmer = new Programmer("Sam Van", 23, "khong ro", "ATABC", 5);

        System.out.println(employee.toString());
        System.out.println(manager.toString());
        System.out.println(student.toString());
        System.out.println(programmer.toString());
    }
}
