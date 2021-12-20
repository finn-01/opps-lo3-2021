package KiemTraKMAMienNam.De1;

import java.util.ArrayList;
import java.util.Scanner;

public class SieuThi {
    ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
    ArrayList<KhachHang> khachHangArrayList = new ArrayList<>();
    ArrayList<HoaDon> hoaDonArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public SanPham checkMaSP(int maSP){
        for(int i = 0; i < sanPhamArrayList.size(); i++){
            if(maSP == (sanPhamArrayList.get(i)).iD){
                return sanPhamArrayList.get(i);
            }
        }
        return null;
    }

    public KhachHang checkMaKH(int maKH){
        for(int i = 0; i < khachHangArrayList.size(); i++){
            if(maKH == khachHangArrayList.get(i).maKH){
                return khachHangArrayList.get(i);
            }
        }
        return null;
    }

    public void nhapSP(){
        System.out.println("Nhap ma san pham: ");
        int maSp = scanner.nextInt();
        scanner.nextLine();

        SanPham sanPham = checkMaSP(maSp);
        if(sanPham == null){
            System.out.println("Nhap ten SP: ");
            String tenSP = scanner.nextLine();

            System.out.println("Nhap gia SP: ");
            int gia = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ngay san xuat: ");
            String ngaySX = scanner.nextLine();

            System.out.println("So luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            SanPham sanPham1 = new SanPham(maSp,tenSP, gia, ngaySX, soLuong);

            sanPhamArrayList.add(sanPham1);
        }else {
            System.out.println("Nhap so luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            sanPham.themSoLuong(soLuong);
        }
    }

    public void inAllSP(){
        for(int i= 0; i < sanPhamArrayList.size(); i++){
            System.out.println(sanPhamArrayList.get(i).toString());
        }
    }

    public void dangKiKH(){
        System.out.println("Nhap ma KH: ");
        int maKH = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhap ten KH: ");
        String tenKH = scanner.nextLine();

        System.out.println("Nam sinh: ");
        int nam = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dia chi: ");
        String diaChi = scanner.nextLine();

        KhachHang khachHang = new KhachHang(maKH, tenKH, nam, diaChi);
        khachHangArrayList.add(khachHang);
    }

    public void suaKH(){
        System.out.println("Nhap ma KH muon sua");
        int maKH = scanner.nextInt();
        scanner.nextLine();

        KhachHang khachHang = checkMaKH(maKH);
        if(khachHang == null){
            System.out.println("Khong co kh");
            return;
        }

        System.out.println("Nhap ten moi: ");
        String tenKH = scanner.nextLine();

        System.out.println("Nam sinh moi: ");
        int nam = scanner.nextInt();
        scanner.nextLine();

        khachHang.setTenKH(tenKH);
        khachHang.setNamSinh(nam);
    }

    public KhachHang dangNhapKH(){
        System.out.println("Dang nhap voi maKH: ");
        int maKH = scanner.nextInt();
        scanner.nextLine();

        KhachHang khachHang = checkMaKH(maKH);
        while (khachHang == null){
            System.out.println("Dang nhap that bai!");
            System.out.println("Dang nhap lai: ");
            maKH = scanner.nextInt();

            khachHang = checkMaKH(maKH);
        }
        return khachHang;
    }

    public void khachMuaHang(){
        KhachHang khachHang = dangNhapKH();
        HoaDon hoaDon = new HoaDon(khachHang);

        int choice = -1;

        do{
            this.inAllSP();
            System.out.println("Nhap SP muon mua hoac bam 0 de thoat!");
            choice = scanner.nextInt();
            if(choice == 0) break;
            SanPham sanPham = checkMaSP(choice);
            if(sanPham == null){
                System.out.println("SP khong ton tai!");
                break;
            }
            System.out.println("Nhap so luong mua: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();
            if(soLuong > sanPham.soLuong){
                System.out.println("SP nay khong du!");
                break;
            }
            sanPham.giamSoLuong(soLuong);
            hoaDon.add(sanPham, soLuong);
        }while (choice != 0);

        if(hoaDon.arrayList.size() != 0){
            {
                hoaDonArrayList.add(hoaDon);
                hoaDon.khachHang.setTongTienMuaHang(hoaDon.tongTien());
            }
        }
    }

    public void inAllHD(){
        for (HoaDon h : hoaDonArrayList
                ) {
            System.out.println(h.toString());
        }
    }

    public void inAllKH(){
        for (int i = 0; i < khachHangArrayList.size(); i++) {
            System.out.println(khachHangArrayList.get(i).toString());
        }
    }

    public void sapSepKH(){
        khachHangArrayList.sort((n, m) ->(int) (n.tongTienMuaHang - m.tongTienMuaHang));
        for (int i = 0; i < khachHangArrayList.size(); i++) {
            System.out.println("Ten KH: " + khachHangArrayList.get(i).tenKH + ", tong tien: " + khachHangArrayList.get(i).tongTienMuaHang);
            System.out.println();
        }
    }
}
