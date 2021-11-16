package Buoi3.Bai7;

import java.util.Scanner;

public class Student {
    public String maSV;
    public float diemTB;
    public int tuoi;
    public String lop;

    public Student() {
    }

    public Student(String maSV, float diemTB, int tuoi, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public void inputInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap sinh vien: ");
        do{
            System.out.println("MaSV: ");
            maSV = scanner.nextLine();
            if(maSV.length() < 8){
                System.out.println("Ma sinh vien phai lon hon 8");
            }
        }while (maSV.length() < 8);

        System.out.println("Nhap diem: ");
        do{
            diemTB = scanner.nextFloat();
            scanner.nextLine();
            if(diemTB < 0 || diemTB > 10){
                System.out.println("Nhap lai diem");
            }
        }while (diemTB < 0 || diemTB > 10);

        System.out.println("Tuoi: ");
        do{
            tuoi = scanner.nextInt();
            scanner.nextLine();
            if(tuoi < 18){
                System.out.println("Nhap lai tuoi");
            }
        }while (tuoi < 18);

        char a = 'A';
        char c = 'C';
        System.out.println("Nhap lop: ");
        do{
            lop = scanner.nextLine();
            if(!lop.startsWith("A") && !lop.startsWith("C")){
                System.out.println("Nhaplai lop");
            }
        }while (!lop.startsWith("A") && !lop.startsWith("C"));
    }

    public void showInfo(){
        System.out.println("Student: ");
        System.out.println("Ma Sinh vien: " + getMaSV());
        System.out.println("Diem trung binh: " + getDiemTB());
        System.out.println("Tuoi: " + getTuoi());
        System.out.println("Lop" + getLop());
    }

    public void hocBong(float diem){
        if (diem > 8){
            System.out.println("Dat hoc bong");
        }else {
            System.out.println("k dat");
        }
    }

}
