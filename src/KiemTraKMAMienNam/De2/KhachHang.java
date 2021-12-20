package KiemTraKMAMienNam.De2;

public class KhachHang{
    int maKH;
    String tenKH;
    int namSinh;
    DiaChi diaChi;
    float tongTienMuaHang;

    public KhachHang() {
    }

    public KhachHang(int maKH, String tenKH, int namSinh, DiaChi diaChi) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tongTienMuaHang = 0;
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

    public DiaChi getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(DiaChi diaChi) {
        this.diaChi = diaChi;
    }

    public void setTongTienMuaHang(float tongTienMuaHang){
        this.tongTienMuaHang += tongTienMuaHang;
    }

    public void thongTinKhachHang(){
        System.out.println("KhachHang{ maKH: " + this.maKH + ", tenKH: " + this.tenKH + ", nam sinh: " + this.namSinh +
                ", dia chi: " + this.diaChi.getDiaChiKH() + ", tong tien mua hang: " + this.tongTienMuaHang + "}");
    }
}
