package KiemTraKMAMienNam.De1;

import java.util.Scanner;

public class SanPham {
    public int iD;
    public String tenSP;
    public int donGia;
    public String ngaySX;
    public int soLuong;

    public SanPham() {
    }

    public SanPham(int iD, String tenSP, int donGia, String ngaySX, int soLuong) {
        this.iD = iD;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.ngaySX = ngaySX;
        this.soLuong = soLuong;
    }

    public SanPham(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public String getNgaySX() {
        return ngaySX;
    }

    public void setNgaySX(String ngaySX) {
        this.ngaySX = ngaySX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void themSoLuong(int soLuong) {
        this.soLuong += soLuong;
    }

    public void giamSoLuong(int soLuong) {
        this.soLuong -= soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "San pham: {" + "Ma SP: " + this.iD + ", ten SP: " + this.tenSP + ", don gia: " + this.donGia +
                ", ngay SX: " + this.ngaySX + ", so luong: " + this.soLuong + "}";
    }
}
