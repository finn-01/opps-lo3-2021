package KiemTraKMAMienNam.De1Ver2;

public class SanPham {
    public int maSanPham;
    public String tenSanPham;
    public float donGia;
    public String ngaySanXuat;
    public int soLuong;

    public SanPham() {
    }

    public SanPham(int maSanPham, String tenSanPham, float donGia, String ngaySanXuat, int soLuong) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.soLuong = soLuong;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public String getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(String ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    //Khi khach hang mua thi se giam
    public void giamSoLuong(int soLuong){
        this.soLuong -= soLuong;
    }

    //Khi them san pham bi trung ma san pham
    public void tangSoLuong(int soLuong){
        this.soLuong += soLuong;
    }

    public void thongTinSanPham(){
        System.out.println("Ma san pham: " + this.maSanPham + ", ten san pham: " + this.tenSanPham + ", gia: " + this.donGia +
                ", ngay san xuat: " + this.ngaySanXuat + ", so luong: " + this.soLuong);
    }
}
