package Chapter2;

public class Student {
    //Properties
    public String name;
    public String codeStudent;
    public int birthYears;

    //Constructor


    public Student() {
    }

    public Student(String name, String codeStudent, int birthYears) {
        this.name = name;
        this.codeStudent = codeStudent;
        this.birthYears = birthYears;
    }


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

    public void showInformation(String className){
        System.out.println("Information student: ");
        System.out.println("Your are in class: " + className);
        System.out.println("Name:" + getName());
        System.out.println("Code student: " + getCodeStudent());
        System.out.println("Birth year: " + getBirthYears());
    }
}
