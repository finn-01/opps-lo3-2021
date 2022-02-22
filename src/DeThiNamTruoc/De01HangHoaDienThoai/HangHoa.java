package DeThiNamTruoc.De01HangHoaDienThoai;

public class HangHoa {
    private int maHang;
    private String ten;
    private String giaBan;

    public HangHoa() {
    }

    public HangHoa(int maHang, String ten, String giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.giaBan = giaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(String giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "HangHoa{" +
                "maHang=" + maHang +
                ", ten='" + ten + '\'' +
                ", giaBan='" + giaBan + '\'' +
                '}';
    }
}
