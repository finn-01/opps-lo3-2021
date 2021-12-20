package KiemTraKMAMienNam.De1Ver2;

public class HoaDonChoTungSanPham {
    public SanPham sanPham;
    public int soLuongMua;
    public float tongTienCho1SanPham;

    public HoaDonChoTungSanPham(SanPham sanPham, int soLuongMua) {
        this.sanPham = sanPham;
        this.soLuongMua = soLuongMua;
        this.tongTienCho1SanPham = this.sanPham.donGia * soLuongMua;
    }

    public void hoaDonCho1SanPham(){
        System.out.println("Ten san pham: "+ this.sanPham.tenSanPham + ", so luong: " + this.soLuongMua +
                ", tong tien: " + this.tongTienCho1SanPham);
    }
}
