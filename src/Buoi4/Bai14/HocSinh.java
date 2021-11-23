package Buoi4.Bai14;

public class HocSinh {
    public String hoTen;
    public String lop;
    public float ly;
    public float toan;
    public float hoa;

    public HocSinh() {
    }

    public HocSinh(String hoTen, String lop, float ly, float toan, float hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.ly = ly;
        this.toan = toan;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getTBC(){
        return (toan + ly + hoa) / 3;
    }
}
