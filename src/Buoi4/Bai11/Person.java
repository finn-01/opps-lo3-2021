package Buoi4.Bai11;

public class Person {
    public String name;
    public int old;
    public String gender;

    public Person() {
    }

    public Person(String name, int old, String gender) {
        this.name = name;
        this.old = old;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}
