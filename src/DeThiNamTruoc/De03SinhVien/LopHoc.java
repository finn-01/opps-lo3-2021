package DeThiNamTruoc.De03SinhVien;

public class LopHoc extends SinhVien{
    private int siSo;
    private String tenLop;

    public LopHoc() {
    }

    public LopHoc(int siSo, String tenLop) {
        this.siSo = siSo;
        this.tenLop = tenLop;
    }

    public LopHoc(String ten, String ma, float diemHP, float diemQT, int siSo, String tenLop) {
        super(ten, ma, diemHP, diemQT);
        this.siSo = siSo;
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    @Override
    public String toString() {
        return "LopHoc{" +
                "siSo=" + siSo +
                ", tenLop='" + tenLop + '\'' + ", " +  super.toString() +
                '}';
    }
}
