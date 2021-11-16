package Buoi3;

public class Circle {
    public double radius;
    public String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showCircle(){
        System.out.println("Circle: ");
        System.out.println("Radius:" + getRadius());
        System.out.println("Color:" + getColor());
        System.out.println("-----------------------");
    }
}
