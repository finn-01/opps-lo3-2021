package Buoi5.TH3.BaiThucHanhCoBan.Bai3;

import java.util.Scanner;

public class BienLai extends KhachHang{
    public int chiSoCu;
    public int chiSoMoi;
    public int tienPhaiTra;

    public BienLai() {
    }

    public BienLai(int chiSoCu, int chiSoMoi, int tienPhaiTra) {
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.tienPhaiTra = tienPhaiTra;
    }

    public BienLai(String ten, int soNha, int maSoCongTo, int chiSoCu, int chiSoMoi, int tienPhaiTra) {
        super(ten, soNha, maSoCongTo);
        this.chiSoCu = chiSoCu;
        this.chiSoMoi = chiSoMoi;
        this.tienPhaiTra = tienPhaiTra;
    }

    public int getChiSoCu() {
        return chiSoCu;
    }

    public void setChiSoCu(int chiSoCu) {
        this.chiSoCu = chiSoCu;
    }

    public int getChiSoMoi() {
        return chiSoMoi;
    }

    public void setChiSoMoi(int chiSoMoi) {
        this.chiSoMoi = chiSoMoi;
    }

    public int getTienPhaiTra() {
        return (chiSoMoi - chiSoCu) * 850000;
    }

    public void setTienPhaiTra(int tienPhaiTra) {
        this.tienPhaiTra = tienPhaiTra;
    }

    public void nhapTT(){
        BienLai bienLai = new BienLai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chu ho: ");
        String ten = scanner.nextLine();
        this.setTen(ten);

        System.out.println("So nha: ");
        int soNha= scanner.nextInt();
        scanner.nextLine();
        this.setSoNha(soNha);

        System.out.println("Ma cong to: ");
        int maCongTo = scanner.nextInt();
        scanner.nextLine();
        this.setMaSoCongTo(maCongTo);

        System.out.println("Chi so cu: ");
        int chiSoCu = scanner.nextInt();
        scanner.nextLine();
        this.setChiSoCu(chiSoCu);

        System.out.println("Chi so moi: ");
        int chiSoMoi = scanner.nextInt();
        scanner.nextLine();
        this.setChiSoMoi(chiSoMoi);

    }

    public void hoaDon(){
        System.out.println("Hoa don: ");
        System.out.println("Ten chu ho: " + this.getTen());
        System.out.println("So nha: " + this.getSoNha());
        System.out.println("Ma cong to: " + this.getMaSoCongTo());
        System.out.println("Chi so cu: " + this.getChiSoCu() + ", chi so moi: " + this.getChiSoMoi());
        System.out.println("Tong tien: " + this.getTienPhaiTra());

    }
}
