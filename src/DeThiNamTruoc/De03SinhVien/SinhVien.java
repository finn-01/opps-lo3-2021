package DeThiNamTruoc.De03SinhVien;

public class SinhVien {
    private String ten;
    private String ma;
    private double diemHP;
    private float diemQT;

    public SinhVien() {
    }

    public SinhVien(String ten, String ma, float diemHP, float diemQT) {
        this.ten = ten;
        this.ma = ma;
        this.diemHP = diemHP;
        this.diemQT = diemQT;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public double getDiemHP() {
        return diemHP;
    }

    public void setDiemHP(double diemHP) {
        this.diemHP = diemHP;
    }

    public double getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(float diemQT) {
        this.diemQT = diemQT;
    }

    public double getDiemTB(){
        return  (diemQT * 0.3 + diemHP * 0.7);
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "ten='" + ten + '\'' +
                ", ma='" + ma + '\'' +
                ", diemHP=" + diemHP +
                ", diemQT=" + diemQT + ", diem TB: " + getDiemTB() +
                '}';
    }

}
