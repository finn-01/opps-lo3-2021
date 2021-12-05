package Buoi5.TH3.BaiThucHanhCoBan.Bai1;

import java.util.Scanner;

public class Nguoi {
    public String hoTen;
    public String diaChi;
    public int namSinh;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, int namSinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void nhapTT(){
        Nguoi nguoi = new Nguoi();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ten: ");
        String hoTen = scanner.nextLine();
        this.setHoTen(hoTen);

        System.out.println("Dia chi: ");
        String diaChi = scanner.nextLine();
        this.setDiaChi(diaChi);

        System.out.println("Nam sinh: ");
        int namSinh=  scanner.nextInt();
        scanner.nextLine();
        this.setNamSinh(namSinh);
    }

    public void inTT(){
        System.out.println("TT:");
        System.out.println("Ten: " + this.hoTen);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Nam sinh: " + this.namSinh);
    }
}
