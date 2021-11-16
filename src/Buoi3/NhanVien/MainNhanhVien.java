package Buoi3.NhanVien;

import java.util.Scanner;

public class MainNhanhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien();

        nhanVien.inputInfo(nhanVien);
        nhanVien.printInfo();
        System.out.println("Tien thuong: " + nhanVien.tinhThuong(0));
    }
}
