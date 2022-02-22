package DeThiNamTruoc.De07ThiSinh;

import java.util.Scanner;

public class ThiSinh {
    private String ten;
    private String ngaySinh;
    private String diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String ten, String ngaySinh, String diaChi) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap(){
        ThiSinh thiSinh = new ThiSinh();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap Ten: ");
        String ten = scanner.nextLine();

        System.out.println("Nhap ngay sinh: ");
        String ngaySinh = scanner.nextLine();

        System.out.println("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

        this.setTen(ten);
        this.setNgaySinh(ngaySinh);
        this.setDiaChi(diaChi);
    }

    @Override
    public String toString() {
        return
                "ten='" + ten + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", diaChi='" + diaChi + '\''
                ;
    }
}
