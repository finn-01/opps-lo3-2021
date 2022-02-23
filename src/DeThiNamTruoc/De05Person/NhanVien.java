package DeThiNamTruoc.De05Person;

public class NhanVien extends Person{
    private String maNV;
    private int heSoLuong;
    private String donVi;

    public NhanVien() {
    }

    public NhanVien(String maNV, int heSoLuong, String donVi) {
        this.maNV = maNV;
        this.heSoLuong = heSoLuong;
        this.donVi = donVi;
    }

    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String maNV, int heSoLuong, String donVi) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.maNV = maNV;
        this.heSoLuong = heSoLuong;
        this.donVi = donVi;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    @Override
    public String toString() {
        return super.toString() +  "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", heSoLuong=" + heSoLuong +
                ", donVi='" + donVi + '\'' +
                '}';
    }
}
