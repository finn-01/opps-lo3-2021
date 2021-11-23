package Buoi4;

public class Student extends Person{
    public float diem;

    public Student() {
    }

    public Student(float diem) {
        this.diem = diem;
    }

    public Student(String name, String id, int dOB, float diem) {
        super(name, id, dOB);
        this.diem = diem;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Score: " + this.diem);
    }
}
