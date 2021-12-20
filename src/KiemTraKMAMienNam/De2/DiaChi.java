package KiemTraKMAMienNam.De2;

public class DiaChi {
    String to;
    String phuong;
    String quan;
    String thanhPho;

    public DiaChi() {
    }

    public DiaChi(String to, String phuong, String quan, String thanhPho) {
        this.to = to;
        this.phuong = phuong;
        this.quan = quan;
        this.thanhPho = thanhPho;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getPhuong() {
        return phuong;
    }

    public void setPhuong(String phuong) {
        this.phuong = phuong;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public String getThanhPho() {
        return thanhPho;
    }

    public void setThanhPho(String thanhPho) {
        this.thanhPho = thanhPho;
    }

    public String getDiaChiKH(){
        return this.to + "-" + this.phuong + "-" + this.quan + "-" + this.thanhPho;
    }
}
