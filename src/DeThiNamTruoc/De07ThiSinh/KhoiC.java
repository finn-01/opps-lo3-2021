package DeThiNamTruoc.De07ThiSinh;

import java.util.Scanner;

public class KhoiC extends ThiSinh{
    private float van;
    private float su;
    private float dia;

    public KhoiC() {
    }

    public KhoiC(float van, float su, float dia) {
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public KhoiC(String ten, String ngaySinh, String diaChi, float van, float su, float dia) {
        super(ten, ngaySinh, diaChi);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getSu() {
        return su;
    }

    public void setSu(float su) {
        this.su = su;
    }

    public float getDia() {
        return dia;
    }

    public void setDia(float dia) {
        this.dia = dia;
    }

    @Override
    public void nhap() {
        KhoiC khoiC = new KhoiC();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap Ten: ");
        String ten = scanner.nextLine();

        System.out.println("Nhap ngay sinh: ");
        String ngaySinh = scanner.nextLine();

        System.out.println("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

        System.out.println("Van: ");
        float toan = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Su: ");
        float ly = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Dia: ");
        float hoa = scanner.nextFloat();
        scanner.nextLine();

        this.setTen(ten);
        this.setNgaySinh(ngaySinh);
        this.setDiaChi(diaChi);
        this.setVan(toan);
        this.setDia(ly);
        this.setSu(hoa);
    }

    @Override
    public String toString() {
        return "KhoiC{" +
                "van=" + van +
                ", su=" + su +
                ", dia=" + dia + ", " +super.toString() +
                '}';
    }
}
