package Chapter2;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();
        Cat cat= new Cat("Doraemon", "Janpan", 1000);
        Cat cat1 = new Cat();
        Office office= new Office();
        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student("Nguyen Trung Hiu", "999", 2001);

        firstStudent.name = "Tung";
        firstStudent.codeStudent = "123";
        firstStudent.birthYears = 2001;

        System.out.println("Information of first Student: ");
        System.out.println("Name: " + firstStudent.name);
        System.out.println("Code student: " + firstStudent.codeStudent);
        System.out.println("Birth year: " + firstStudent.birthYears);
        System.out.println("----------------------------------------");

        secondStudent.name = "Sam";
        secondStudent.codeStudent = "KMA123";
        secondStudent.birthYears = 2001;

        System.out.println("Information of second Student: ");
        System.out.println("Name: " + secondStudent.name);
        System.out.println("Code student: " + secondStudent.codeStudent);
        System.out.println("Birth year: " + secondStudent.birthYears);
        System.out.println("---------------------------------------");

        thirdStudent.setName("Nguyen Trung Heo");
        thirdStudent.setCodeStudent("KMA111");
        thirdStudent.setBirthYears(2001);
        System.out.println("-------------------------");

        thirdStudent.showInformation();
        System.out.println("------------------------------");

        //Student
        student.setName("Co Dai");
        student.setCodeStudent("999");
        student.setBirthYears(2001);

        student.showInformation("L03");
        System.out.println("-----------------------------------");

        //Student1
        student1.showInformation();
        System.out.println("----------------------------");

        //Student2
        student2.showInformation();
        System.out.println("---------------------------");


        //Cat
        cat.showInformation();

        //Cat1
        cat1.setName("Meow");
        cat1.setCountry("Vietnam");
        cat1.setAge(10);

        cat1.showInformation();

        //Office
        office.setName("Trung Hieu");
        office.setCountry("Vietnam");
        office.setGender("Nu");
        office.setYearBirth(2001);
        office.setAddress("Hanam");
        office.showInformation();
    }
}

