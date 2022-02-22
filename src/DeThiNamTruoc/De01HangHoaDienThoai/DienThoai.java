package DeThiNamTruoc.De01HangHoaDienThoai;

public class DienThoai extends HangHoa{
    private String nhaSanXuat;
    private String boNho;
    private String mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaSanXuat, String boNho, String mauSac) {
        this.nhaSanXuat = nhaSanXuat;
        this.boNho = boNho;
        this.mauSac = mauSac;
    }

    public DienThoai(int maHang, String ten, String giaBan, String nhaSanXuat, String boNho, String mauSac) {
        super(maHang, ten, giaBan);
        this.nhaSanXuat = nhaSanXuat;
        this.boNho = boNho;
        this.mauSac = mauSac;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getBoNho() {
        return boNho;
    }

    public void setBoNho(String boNho) {
        this.boNho = boNho;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public String toString() {
        return "DienThoai{" +
                "nhaSanXuat='" + nhaSanXuat + '\'' +
                ", boNho='" + boNho + '\'' +
                ", mauSac='" + mauSac + '\'' + " " +super.toString() +
                '}';
    }
}
