package Chapter2;

public class Main {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();
        Cat cat= new Cat("Doraemon", "Janpan", 1000);
        Cat cat1 = new Cat();
        Office office= new Office();

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

