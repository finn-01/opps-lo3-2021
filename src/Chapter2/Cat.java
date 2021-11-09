package Chapter2;

public class Cat {
    public String name;
    public String country;
    public int age;

    public Cat() {
    }

    public Cat(String name, String country, int age) {
        this.name = name;
        this.country = country;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInformation(){
        System.out.println("Cat:");
        System.out.println("Name: " + this.getName());
        System.out.println("Country: " + this.getCountry());
        System.out.println("Age: " + this.getAge());
        System.out.println("---------------------------");
    }
}
