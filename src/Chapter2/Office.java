package Chapter2;

public class Office {
    public String name;
    public String country;
    public String gender;
    public int yearBirth;
    public String address;

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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void showInformation(){
        System.out.println("Office: ");
        System.out.println("Name: " + this.getName());
        System.out.println("Country: " + this.getCountry());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Age: " + (2021 - this.getYearBirth()) );
    }
}
