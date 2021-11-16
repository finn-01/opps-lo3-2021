package Buoi3;

public class Rectangle {
    public double length;
    public double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getRectangleArea(){
        return length * width;
    }

    public void showRectangle(){
        System.out.println("Rectangle: ");
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.println("Area: " + getRectangleArea());
        System.out.println("---------------------------");
    }
}
