package Buoi4.Bai12;

public class Student extends Person{
    public float tuition;

    public Student() {
    }

    public Student(float tuition) {
        this.tuition = tuition;
    }

    public Student(String name, int bOY, String id, float tuition) {
        super(name, bOY, id);
        this.tuition = tuition;
    }

    public float getTuition() {
        return tuition;
    }

    public void setTuition(float tuition) {
        this.tuition = tuition;
    }
}
