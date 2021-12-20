package KiemTraKMAMienNam.De2;

import java.util.ArrayList;
import java.util.Scanner;

public class SieuThi {
    ArrayList<SanPham> sanPhams = new ArrayList<>();
    ArrayList<KhachHang> khachHangs = new ArrayList<>();
    ArrayList<HoaDon> hoaDons = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public SanPham checkIDSP(int maSP){
        for(int i = 0; i < sanPhams.size(); i++){
            if(maSP == sanPhams.get(i).maSP){
                return sanPhams.get(i);
            }
        }
        return null;
    }

    public KhachHang checkIDKH(int maKH){
        for(int i = 0; i < khachHangs.size(); i++){
            if(maKH == khachHangs.get(i).maKH){
                return khachHangs.get(i);
            }
        }
        return null;
    }

    public void themSP(){
        System.out.println("Nhap maSP: ");
        int maSP = scanner.nextInt();
        scanner.nextLine();

        SanPham newSP = checkIDSP(maSP);

        if(newSP == null){
            System.out.println("TenSP: ");
            String ten = scanner.nextLine();

            System.out.println("Gia: ");
            float gia = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Ngay SX: ");
            String ngaySX = scanner.nextLine();

            System.out.println("So luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            SanPham sanPham = new SanPham(maSP, ten, gia, ngaySX,soLuong);

            sanPhams.add(sanPham);
        }
        else {
            System.out.println("Nhap so luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            newSP.themSoLuong(soLuong);
        }
    }

    public void themKH(){
        System.out.println("Nhap maKH: ");
        int maKH = scanner.nextInt();
        scanner.nextLine();

        KhachHang newKhachHang = checkIDKH(maKH);

        if(newKhachHang == null){
            System.out.println("Ten: ");
            String ten = scanner.nextLine();

            System.out.println("Nam sinh: ");
            int nam = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Dia chi: ");
            System.out.println("To: ");
            String to = scanner.nextLine();
            System.out.println("Phuong: ");
            String phuong = scanner.nextLine();
            System.out.println("Quan: ");
            String quan = scanner.nextLine();
            System.out.println("Thanh pho: ");
            String tp = scanner.nextLine();

            DiaChi diaChi= new DiaChi(to, phuong, quan, tp);
            KhachHang khachHang = new KhachHang(maKH, ten, nam, diaChi);

            khachHangs.add(khachHang);
        }
        else {
            System.out.println("Ma khach hang: " + maKH + " da ton tai!");
        }
    }

    public void suaDoiThongTinSP(){
        System.out.println("Nhap maSP: ");
        int maSP = scanner.nextInt();
        scanner.nextLine();

        SanPham sanPham = checkIDSP(maSP);

        if(sanPham == null){
            System.out.println("Ma SP " + maSP + " khong ton tai");
            return;
        }

        System.out.println("Ten SP moi: ");
        String ten = scanner.nextLine();

        System.out.println("Gia moi: ");
        float gia = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Ngay SX moi: ");
        String ngaySX = scanner.nextLine();

        System.out.println("So luong moi: ");
        int soLuong = scanner.nextInt();
        scanner.nextLine();

        sanPham.setMaSP(maSP);
        sanPham.setTenSP(ten);
        sanPham.setDonGia(gia);
        sanPham.setNgaySX(ngaySX);
        sanPham.setSoLuong(soLuong);
    }

    public void inTatCaSP(){
        for (int i = 0; i < sanPhams.size(); i++) {
            sanPhams.get(i).thongTinSanPham();
        }
    }

    public KhachHang dangNhapSieuThi(){
        System.out.println("Nhap maKH: ");
        int maKH = scanner.nextInt();
        scanner.nextLine();

        KhachHang khachHang = checkIDKH(maKH);

        while (khachHang == null){
            System.out.println("Ma KH " + maKH + " khong ton tai! Vui long dang nhap lai");
            maKH= scanner.nextInt();
            scanner.nextLine();

            khachHang = checkIDKH(maKH);
        }
        return khachHang;
    }

    public void khachHangMuaHang(){
        KhachHang khachHang = dangNhapSieuThi();
        HoaDon newHoaDon = new HoaDon(khachHang);

        int choice = -1;

        do{
            this.inTatCaSP();
            System.out.println("Nhap maSp muon mua hoac 0 de thoat: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            SanPham sanPham = checkIDSP(choice);

            if(sanPham == null){
                System.out.println("Ma sp " + choice + " khong ton tai");
                break;
            }

            System.out.println("Nhap so luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            if(soLuong > sanPham.getSoLuong()){
                System.out.println("So luong khong du");
                break;
            }

            sanPham.giamSoLuong(soLuong);
            newHoaDon.add(sanPham, soLuong);
        }while (choice != 0);

        if(!newHoaDon.hoaDonChoMotSPS.isEmpty()){
            hoaDons.add(newHoaDon);
            newHoaDon.thongTinHoaDon();
            newHoaDon.khachHang.setTongTienMuaHang(newHoaDon.tinhTongHoaDon());
        }
    }

    public void inAllHD(){
        for (int i = 0; i < hoaDons.size(); i++) {
            hoaDons.get(i).thongTinHoaDon();
        }
    }

    public void inAllKH(){
        for (int i = 0; i < khachHangs.size(); i++) {
            khachHangs.get(i).thongTinKhachHang();
        }
    }

    public void inKHMuaNhieuNhat(){
        float max = khachHangs.get(0).tongTienMuaHang;
        int index = 0;

        for (int i = 0; i < khachHangs.size(); i++) {
            if(khachHangs.get(i).tongTienMuaHang > max){
                max = khachHangs.get(i).tongTienMuaHang;
                index = i;
            }
        }
        System.out.println("Khach hang mua nhieu nhat: Ten: " + khachHangs.get(index).tenKH + ", tong tien: " + khachHangs.get(index).tongTienMuaHang);
    }
}
