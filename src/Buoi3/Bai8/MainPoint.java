package Buoi3.Bai8;

public class MainPoint {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();

        myPoint.setXY(2, 3);
        myPoint.bienDoi(myPoint.getX(),myPoint.getY());
        System.out.println( "Do dai: " + myPoint.distance(4, 8));
    }
}
