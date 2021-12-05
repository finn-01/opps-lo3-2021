package Buoi5.TH3.BaiThucHanhCoBan.Bai3;

public class KhachHang {
    public String ten;
    public int soNha;
    public int maSoCongTo;

    public KhachHang() {
    }

    public KhachHang(String ten, int soNha, int maSoCongTo) {
        this.ten = ten;
        this.soNha = soNha;
        this.maSoCongTo = maSoCongTo;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoNha() {
        return soNha;
    }

    public void setSoNha(int soNha) {
        this.soNha = soNha;
    }

    public int getMaSoCongTo() {
        return maSoCongTo;
    }

    public void setMaSoCongTo(int maSoCongTo) {
        this.maSoCongTo = maSoCongTo;
    }
}
