package Buoi4.Bai14;

public class Main14 {
    public static void main(String[] args) {
        HocSinh hocSinh = new HocSinh("Sam", "AT16D", 10, 10, 10);
        HocSinhChuyenToan hocSinhChuyenToan = new HocSinhChuyenToan("Sam2", "AT16D", 7, 8, 9);

        System.out.println("Hoc sinh: " + hocSinh.getTBC());
        System.out.println("Hoc sinh chuyen toan: " + hocSinhChuyenToan.getTBC());
    }
}
