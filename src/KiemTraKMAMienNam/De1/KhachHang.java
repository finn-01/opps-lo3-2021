package KiemTraKMAMienNam.De1;

public class KhachHang {
    public int maKH;
    public String tenKH;
    public int namSinh;
    public String diaChi;
    public int tongTienMuaHang;

    public KhachHang() {
    }

    public KhachHang(int maKH, String tenKH, int namSinh, String diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tongTienMuaHang = 0;
    }

    public void setTongTienMuaHang(int tongTienMuaHang) {
        this.tongTienMuaHang += tongTienMuaHang;
    }

    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Khach hang{ Ten KH: " +this.tenKH + ", ma KH: " + this.maKH + ", nam sinh: " + this.namSinh +
                ", dia chi: " + this.diaChi + "}";
    }
}
