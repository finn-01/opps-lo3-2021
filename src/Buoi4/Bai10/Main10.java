package Buoi4.Bai10;

public class Main10 {
    public static void main(String[] args) {
        Circle circle = new Circle(10, "Red");
        Cylinder cylinder = new Cylinder(10, "Yellow", 10);

        System.out.println("Area Circle: " + circle.getArea());
        System.out.println("Volume Cylinder: " + cylinder.getVolume());

        System.out.println(circle.toString());
        System.out.println(cylinder.toString());
    }
}
