package Buoi4.Bai13;

public class USA extends Vietnam{
    public USA() {
    }

    public USA(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public String getName() {
        return this.lastName + " " + this.firstName;
    }
}
