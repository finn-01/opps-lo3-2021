package KiemTraKMAMienNam.De2;

import java.util.ArrayList;

public class HoaDon {
    KhachHang khachHang;
    ArrayList<HoaDonChoMotSP> hoaDonChoMotSPS = new ArrayList<>();

    public HoaDon(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void add(SanPham sanPham, int soLuong){
        HoaDonChoMotSP hoaDonChoMotSP = new HoaDonChoMotSP(sanPham, soLuong);

        hoaDonChoMotSPS.add(hoaDonChoMotSP);
    }

    public float tinhTongHoaDon(){
        float result = 0;

        for (int i = 0; i < hoaDonChoMotSPS.size(); i++) {
            result += hoaDonChoMotSPS.get(i).tongTienChoMotSP;
        }
        return result;
    }

    public void thongTinHoaDon(){
        System.out.println("Thong tin hoa don: ");
        System.out.println("Ten KH: " + this.khachHang.tenKH);

        for (int i = 0; i < hoaDonChoMotSPS.size(); i++) {
            hoaDonChoMotSPS.get(i).hoaDonChoMotSP();
        }

        System.out.println("-> Tong tien: " + tinhTongHoaDon());
    }
}
