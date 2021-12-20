package KiemTraKMAMienNam.De2;

public class SanPham {
    int maSP;
    String tenSP;
    float donGia;
    String ngaySX;
    int soLuong;

    public SanPham() {
    }

    public SanPham(int maSP, String tenSP, float donGia, String ngaySX, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.soLuong = soLuong;
    }

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void themSoLuong(int soLuong){
        this.soLuong += soLuong;
    }

    public void  giamSoLuong(int soLuong){
        this.soLuong -= soLuong;
    }

    public void thongTinSanPham(){
        System.out.println("SanPham{ ma SP : " + this.maSP + ", ten SP: " + this.tenSP + ", gia: " + this.donGia
        + ", ngay SX: " + this.ngaySX + ", so luong: " + this.soLuong + "}");
    }
}
