package Buoi5.TH3.BaiThucHanhCoBan.Bai2;

import java.util.Scanner;

public class TheMuon extends SinhVien{
    public int soPhieuMuon;
    public String ngayMuon;
    public String hanTra;
    public int soHieuSach;

    public TheMuon() {
    }

    public TheMuon(int soPhieuMuon, String ngayMuon, String hanTra, int soHieuSach) {
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public TheMuon(String hoTen, String namSinh, String tuoi, String lop, int soPhieuMuon, String ngayMuon, String hanTra, int soHieuSach) {
        super(hoTen, namSinh, tuoi, lop);
        this.soPhieuMuon = soPhieuMuon;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
        this.soHieuSach = soHieuSach;
    }

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getHanTra() {
        return hanTra;
    }

    public void setHanTra(String hanTra) {
        this.hanTra = hanTra;
    }

    public int getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(int soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public void nhapTT(){
        TheMuon theMuon = new TheMuon();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ten sinh vien: ");
        String ten = scanner.nextLine();
        this.setHoTen(ten);

        System.out.println("Nam sinh: ");
        String namSinh = scanner.nextLine();
        this.setNamSinh(namSinh);

        System.out.println("Tuoi: ");
        String tuoi = scanner.nextLine();
        this.setTuoi(tuoi);

        System.out.println("Lop: ");
        String lop = scanner.nextLine();
        this.setLop(lop);

        System.out.println("So phieu muon: ");
        int soPhieuMuon = scanner.nextInt();
        scanner.nextLine();
        this.setSoPhieuMuon(soPhieuMuon);

        System.out.println("Ngay muon: ");
        String ngayMuon = scanner.nextLine();
        this.setNgayMuon(ngayMuon);

        System.out.println("Ngay tra: ");
        String ngayTra = scanner.nextLine();
        this.setHanTra(ngayTra);

        System.out.println("Hieu sach: ");
        int hieuSach = scanner.nextInt();
        scanner.nextLine();
        this.setSoHieuSach(hieuSach);
    }

    public void inTT(){
        System.out.println("Thong tin sinh vien muon sach: ");
        System.out.println("Ten: " + this.getHoTen());
        System.out.println("Nam sinh: " + this.getNamSinh());
        System.out.println("Tuoi: " + this.getTuoi());
        System.out.println("Lop: " + this.getLop());
        System.out.println("So phieu muon: " + this.getSoPhieuMuon());
        System.out.println("Ngay muo: " + this.getNgayMuon());
        System.out.println("Han tra: " + this.getHanTra());
        System.out.println("Hieu sach: " + this.getSoHieuSach());

    }
}
