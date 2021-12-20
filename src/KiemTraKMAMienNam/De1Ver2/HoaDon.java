package KiemTraKMAMienNam.De1Ver2;

import java.util.ArrayList;

public class HoaDon {
    public KhachHang khachHang;
    public ArrayList<HoaDonChoTungSanPham> hoaDonChoTungSanPhamArrayList = new ArrayList<>();

    public void add(SanPham sanPham, int soLuongMua){
        HoaDonChoTungSanPham hoaDonChoTungSanPham = new HoaDonChoTungSanPham(sanPham, soLuongMua);

        hoaDonChoTungSanPhamArrayList.add(hoaDonChoTungSanPham);
    }

    public HoaDon(KhachHang khachHang){
        this.khachHang = khachHang;
    }

    public float tinhTongTienHoaDon(){
        float result = 0;
        for (int i = 0; i < hoaDonChoTungSanPhamArrayList.size(); i++) {
            result += hoaDonChoTungSanPhamArrayList.get(i).tongTienCho1SanPham;
        }
        return result;
    }

    public void thongTinHoaDon(){
        System.out.println("===================Thong tin hoa don:====================");
        System.out.println("Ten khach hang: " + this.khachHang.tenKhachHang);

        for (int i = 0; i < hoaDonChoTungSanPhamArrayList.size(); i++) {
            hoaDonChoTungSanPhamArrayList.get(i).hoaDonCho1SanPham();
        }

        System.out.println("-> Tong tien: " + tinhTongTienHoaDon());
    }
}
