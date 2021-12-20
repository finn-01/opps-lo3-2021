package KiemTraKMAMienNam.De1;

import java.util.ArrayList;

public class HoaDon extends SanPham{
    KhachHang khachHang;
    ArrayList<HoaDonTungSP> arrayList = new ArrayList<>();

    public void add(SanPham maSp, int soLuongMua){
        HoaDonTungSP hoaDonTungSP = new HoaDonTungSP(maSp, soLuongMua);
        arrayList.add(hoaDonTungSP);
    }

    public HoaDon(KhachHang khachHang){
        this.khachHang = khachHang;
    }

    public int tongTien(){
        int result=  0;

        for(int i = 0; i < arrayList.size(); i++){
            result += arrayList.get(i).tongTieng1Sp;
        }
        return result;
    }

    public void info(){
        System.out.println("================Hoa Don=================");
        System.out.println("Ten KH: " + this.khachHang.getTenKH());
        for(int i = 0; i < arrayList.size(); i++){
            arrayList.get(i).info();
        }

        System.out.println("Tong tien hoa don: " + tongTien());
        System.out.println();
    }
}
