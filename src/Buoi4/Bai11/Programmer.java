package Buoi4.Bai11;

public class Programmer extends Student{
    public int experienceYear;

    public Programmer() {
    }

    public Programmer(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public Programmer(String id, int experienceYear) {
        super(id);
        this.experienceYear = experienceYear;
    }

    public Programmer(String name, int old, String gender, String id, int experienceYear) {
        super(name, old, gender, id);
        this.experienceYear = experienceYear;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    @Override
    public String toString() {
        return "Programmer{ Name: " + super.getName() + ", old: " + super.getOld() + ", gender: " + super.getGender() +
                ", ID: " + this.getId() + ", experience year: " + this.getExperienceYear() +  "}";
    }
}
