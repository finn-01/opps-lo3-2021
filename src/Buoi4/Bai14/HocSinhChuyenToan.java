package Buoi4.Bai14;

public class HocSinhChuyenToan extends HocSinh{
    public HocSinhChuyenToan() {
    }

    public HocSinhChuyenToan(String hoTen, String lop, float ly, float toan, float hoa) {
        super(hoTen, lop, ly, toan, hoa);
    }

    @Override
    public float getTBC() {
        return (this.toan * 2 + this.hoa + this.ly) / 4;
    }
}
