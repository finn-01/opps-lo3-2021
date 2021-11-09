package Chapter2;

public class Student {
    //Properties
    public String name;
    public String codeStudent;
    public int birthYears;

    //Method

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public int getBirthYears() {
        return birthYears;
    }

    public void setBirthYears(int birthYears) {
        this.birthYears = birthYears;
    }

    public void showInformation(){
        System.out.println("Information student: ");
        System.out.println("Name:" + getName());
        System.out.println("Code student: " + getCodeStudent());
        System.out.println("Birth year: " + getBirthYears());
    }
}
