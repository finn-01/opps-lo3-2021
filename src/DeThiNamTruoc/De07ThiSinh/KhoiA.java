package DeThiNamTruoc.De07ThiSinh;

import java.util.Scanner;

public class KhoiA extends ThiSinh{
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public KhoiA() {
    }

    public KhoiA(float diemToan, float diemLy, float diemHoa) {
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public KhoiA(String ten, String ngaySinh, String diaChi, float diemToan, float diemLy, float diemHoa) {
        super(ten, ngaySinh, diaChi);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public void nhap() {
        KhoiA khoiA = new KhoiA();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap Ten: ");
        String ten = scanner.nextLine();

        System.out.println("Nhap ngay sinh: ");
        String ngaySinh = scanner.nextLine();

        System.out.println("Nhap dia chi: ");
        String diaChi = scanner.nextLine();

        System.out.println("Toan: ");
        float toan = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ly: ");
        float ly = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Hoa: ");
        float hoa = scanner.nextFloat();
        scanner.nextLine();

        this.setTen(ten);
        this.setNgaySinh(ngaySinh);
        this.setDiaChi(diaChi);
        this.setDiemToan(toan);
        this.setDiemLy(ly);
        this.setDiemHoa(hoa);
    }

    @Override
    public String toString() {
        return "KhoiA{" +
                "diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa + ", " +super.toString() +
                '}';
    }
}
