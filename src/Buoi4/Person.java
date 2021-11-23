package Buoi4;

public class Person {
    public String name;
    public String id;
    public int dOB;

    public Person() {
    }

    public Person(String name, String id, int dOB) {
        this.name = name;
        this.id = id;
        this.dOB = dOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getdOB() {
        return dOB;
    }

    public void setdOB(int dOB) {
        this.dOB = dOB;
    }

    public void showInfo(){
        System.out.println("Info: ");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("DOB: " + this.dOB);
    }
}
