package Buoi4.Bai10;

public class Cylinder extends  Circle{
    public double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "{ Cylinder: Radius: " + super.getRadius() + ", Height: " + this.getHeight() + ", Color: " + super.getColor() +
                ", Volume: " + this.getVolume() + "}";
    }
}
