package KiemTraKMAMienNam.De1Ver2;

import java.util.ArrayList;
import java.util.Scanner;

public class SieuThi {
    public ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
    public ArrayList<KhachHang> khachHangArrayList= new ArrayList<>();
    public ArrayList<HoaDon> hoaDonArrayList = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);

    public SanPham checkIDSanPham(int maSanPham){
        for (int i = 0; i < sanPhamArrayList.size(); i++) {

            //Neu ma co thi se tra ra san pham [i]
            if(maSanPham == sanPhamArrayList.get(i).maSanPham){
                return sanPhamArrayList.get(i);
            }
        }

        //Khong co thi return ra null
        return null;
    }

    public KhachHang checkIDKhachHang(int maKhachHang){

        //Co thi return ra khach hang
        for (int i = 0; i < khachHangArrayList.size(); i++) {
            if(maKhachHang == khachHangArrayList.get(i).maKhachHang){
                return  khachHangArrayList.get(i);
            }
        }

        //Khong co thi return null
        return null;
    }

    public void themSanPham(){
        System.out.println("Nhap ma san pham: ");
        int maSanPham = scanner.nextInt();
        scanner.nextLine();

        //Kiem tra xem ma co ton tai hay khong, neu ton tai thi them so luong, khong thi them san pham
        SanPham sanPham = checkIDSanPham(maSanPham);

        //Neu ma san pham khong ton tai
        if(sanPham == null){
            System.out.println("Nhap ten san pham: ");
            String tenSanPham = scanner.nextLine();

            System.out.println("Gia: ");
            float donGia = scanner.nextFloat();
            scanner.nextLine();

            System.out.println("Ngay san xuat: ");
            String ngaySanXuat = scanner.nextLine();

            System.out.println("So luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            //Tao ra 1 san pham moi
            SanPham newSanPham = new SanPham(maSanPham, tenSanPham, donGia, ngaySanXuat, soLuong);

            //Them vao arrayList
            sanPhamArrayList.add(newSanPham);
        }
        //Neu ma trung san pham thi tang so luong
        else {
            System.out.println("Nhap so luong: ");
            int soLuong = scanner.nextInt();
            scanner.nextLine();

            sanPham.tangSoLuong(soLuong);
        }
    }

    public void themKhachHang(){
        System.out.println("Nhap ma khach hang: ");
        int maKhachHang = scanner.nextInt();
        scanner.nextLine();

        //Check xem khach hang co trung khong
        KhachHang khachHang = checkIDKhachHang(maKhachHang);

        if(khachHang == null){
            System.out.println("Ten: ");
            String tenKhachHang = scanner.nextLine();

            System.out.println("Nam sinh: ");
            int namSinh = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Dia chi: ");
            String diaChi = scanner.nextLine();

            KhachHang newKhachHang = new KhachHang(maKhachHang, tenKhachHang, namSinh, diaChi);

            khachHangArrayList.add(newKhachHang);
        }
        else {
            System.out.println("Ma khach hang" + maKhachHang + " da ton tai!");
        }
    }

    public void suaThongTinKhachHang(){
        System.out.println("Nhap ma khach hang muon sua: ");
        int maKhachHang = scanner.nextInt();
        scanner.nextLine();

        //check khach hang
        KhachHang khachHang = checkIDKhachHang(maKhachHang);

        //khach hang null
        if(khachHang == null){
            System.out.println("Khach hang co ma khach hang: " + maKhachHang + " khong ton tai!");
            return;
        }

        //Nhap ten, tuoi neu thay
        System.out.println("Nhap ten moi: ");
        String newTen = scanner.nextLine();

        System.out.println("Nhap nam sinh moi: ");
        int newNam = scanner.nextInt();
        scanner.nextLine();

        //set ten
        khachHang.setTenKhachHang(newTen);
        khachHang.setNamSinh(newNam);
    }

    public void inThongTinSanPhamCuaSieuThi(){
        for (int i = 0; i < sanPhamArrayList.size(); i++) {
            sanPhamArrayList.get(i).thongTinSanPham();
        }
    }

    //dang nhap de mua hang
    public KhachHang dangNhapKhachHang(){
        System.out.println("Dang nhap cung ma khach hang: ");
        int maKhachHang = scanner.nextInt();
        scanner.nextLine();

        //check khach hang
        KhachHang khachHang = checkIDKhachHang(maKhachHang);

        //neu sai thi nhap lai
        while (khachHang == null){
            System.out.println("Dang nhap that bai vi ma khach hang " + maKhachHang + " khong ton tai");
            System.out.println("Vui long dang nhap lai!!!");

            maKhachHang = scanner.nextInt();
            scanner.nextLine();

            khachHang = checkIDKhachHang(maKhachHang);
        }
        return khachHang;
    }

    public void khachHangMuaSanPham() throws InterruptedException {
        //khach hang da dang ki voi sieu thi
        KhachHang khachHang = dangNhapKhachHang();

        //hoa don phai co thong tin khach hang
        HoaDon hoaDon = new HoaDon(khachHang);

        int choice = -1;

        do{
            System.out.println("San pham cua sieu thi: ");
            this.inThongTinSanPhamCuaSieuThi();
            System.out.println("Nhap ma san pham de mua hoac nhap 0 de thoat: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            //thoat
            if(choice == 0){
                System.out.print("Dang thoat");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.print(".");
                Thread.sleep(1000);
                System.out.println(".");
                break;
            }

            //check sp co ton tai hay khong
            SanPham sanPham = checkIDSanPham(choice);

            //sp khong ton tai
            if(sanPham == null){
                System.out.println("Ma san pham " + choice + " khong ton tai!");
                break;
            }

            System.out.println("Nhap so luong: ");
            int soLuong = scanner.nextInt();

            //So luong sp k du se break
            if(soLuong > sanPham.getSoLuong()){
                System.out.println("Khong du so luong de ban!");
                break;
            }

            //Neu sp du thi se tru sp trong arrays voi so san pham muon lay
            sanPham.giamSoLuong(soLuong);

            //tao ra hoa don moi
            hoaDon.add(sanPham, soLuong);
        }while (choice != 0);

        if(!hoaDon.hoaDonChoTungSanPhamArrayList.isEmpty()){
            hoaDonArrayList.add(hoaDon);
            hoaDon.thongTinHoaDon();
            hoaDon.khachHang.setTongTienMuaHang(hoaDon.tinhTongTienHoaDon());
        }
    }

    //in khach hang
    public void inThongTinKhachHang(){
        for (int i = 0; i < khachHangArrayList.size(); i++) {
            khachHangArrayList.get(i).thongTinKhachHang();
        }
    }

    //in hoa don
    public void inHoaDon(){
        for (int i = 0; i < hoaDonArrayList.size(); i++) {
            hoaDonArrayList.get(i).thongTinHoaDon();
        }
    }

    //in khach hang va sap xep
    public void inKhachHangSapXep(){
        //sort
        khachHangArrayList.sort((n, m) ->(int) (n.tongTienMuaHang - m.tongTienMuaHang));

        for (int i = 0; i < khachHangArrayList.size(); i++) {
            System.out.println("Ten khach hang: " + khachHangArrayList.get(i).tenKhachHang + ", tong tien: " +
                    khachHangArrayList.get(i).tongTienMuaHang);
        }
    }
}
