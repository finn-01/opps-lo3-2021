package Buoi3.Bai8;

public class MainPoint {
    public static void main(String[] args) {
        MyPoint myPoint = new MyPoint();

        myPoint.setXY(2, 3);
        System.out.println(myPoint.toString());
        System.out.println( "Do dai: " + myPoint.distance(4, 8));
        System.out.println("Khoang cach diem hien thoi toi MyPoint1 la: " + myPoint.distance(new MyPoint(4, 8)));
    }
}
