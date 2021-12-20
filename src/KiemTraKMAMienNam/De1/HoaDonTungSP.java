package KiemTraKMAMienNam.De1;

public class HoaDonTungSP {
    SanPham sanPham;
    int soLuongMua;
    int tongTieng1Sp;

    public HoaDonTungSP() {
    }

    public HoaDonTungSP(SanPham sanPham, int soLuongMua) {
        this.sanPham = sanPham;
        this.soLuongMua = soLuongMua;
        this.tongTieng1Sp = tongTieng1Sp * soLuongMua;
    }

    public void info() {
        System.out.printf("TenSP: %s, soLuong: %d, TongTien: %.1f", this.sanPham.tenSP, this.soLuongMua, this.tongTieng1Sp);
        System.out.println("");
    }

}
