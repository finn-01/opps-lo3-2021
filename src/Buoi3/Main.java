package Buoi3;

public class Main {
    public static void main(String[] args) {
        //Circle
        Circle circle = new Circle();
        Circle circle1 = new Circle(1.2);
        Circle circle2 = new Circle(1.5, "Green");

        //Rectangle:
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(2, 4);

        //Circle
        circle.showCircle();

        circle1.setColor("Pink");
        circle1.showCircle();

        circle2.showCircle();

        //Rectangle
        rectangle.setLength(2);
        rectangle.setWidth(3);
        rectangle.showRectangle();

        rectangle1.showRectangle();
    }
}
