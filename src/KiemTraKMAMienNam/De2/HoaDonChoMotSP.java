package KiemTraKMAMienNam.De2;

public class HoaDonChoMotSP {
    SanPham sanPham;
    int soLuongMua;
    float tongTienChoMotSP;

    public HoaDonChoMotSP(SanPham sanPham, int soLuongMua) {
        this.sanPham = sanPham;
        this.soLuongMua = soLuongMua;
        this.tongTienChoMotSP = this.sanPham.donGia * soLuongMua;
    }

    public void hoaDonChoMotSP(){
        System.out.println("Ten SP: " + this.sanPham.tenSP + ", so luong: " + this.soLuongMua +
                ", tong tien: " + this.tongTienChoMotSP);
    }
}
