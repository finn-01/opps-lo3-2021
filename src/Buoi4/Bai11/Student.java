package Buoi4.Bai11;

public class Student extends Person{
    public String id;

    public Student() {
    }

    public Student(String id) {
        this.id = id;
    }

    public Student(String name, int old, String gender, String id) {
        super(name, old, gender);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{ Name: " + super.getName() + ", old: " + super.getOld() + ", gender: " + super.getGender() +
                ", ID: " + this.getId() + "}";
    }
}
