package KiemTraKMAMienNam.De1Ver2;

public class KhachHang {
    public int maKhachHang;
    public String tenKhachHang;
    public int namSinh;
    public String diaChi;
    public float tongTienMuaHang;

    public KhachHang(int maKhachHang, String tenKhachHang, int namSinh, String diaChi) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.tongTienMuaHang = 0;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(int maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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

    public void setTongTienMuaHang(float tongTienMuaHang) {
        this.tongTienMuaHang += tongTienMuaHang;
    }

    public void thongTinKhachHang(){
        System.out.println("Ma khach hang: "+ this.maKhachHang + ", ten khach hang: " + this.tenKhachHang +
                ", nam sinh: " + this.namSinh + ", dia chi: " + this.diaChi);
    }
}
