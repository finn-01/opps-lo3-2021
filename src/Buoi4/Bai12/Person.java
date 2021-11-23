package Buoi4.Bai12;

public class Person {
    public String name;
    public int bOY;
    public String id;

    public Person() {
    }

    public Person(String name, int bOY, String id) {
        this.name = name;
        this.bOY = bOY;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getbOY() {
        return bOY;
    }

    public void setbOY(int bOY) {
        this.bOY = bOY;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
