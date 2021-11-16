package Buoi3.NhanVien;

import java.util.Scanner;

public class NhanVien {
    public String name;
    public int old;
    public String address;
    public double salary;
    public int time;

    public NhanVien() {
    }

    public NhanVien(String name, int old, String address, double salary, int time) {
        this.name = name;
        this.old = old;
        this.address = address;
        this.salary = salary;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void inputInfo(NhanVien nhanVien){
        Scanner scanner = new Scanner(System.in);
//        NhanVien nhanVien = new NhanVien();
        System.out.println("Nhap ten: ");
        nhanVien.name = scanner.nextLine();
        System.out.println("Tuoi: ");
        nhanVien.old = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Dia chi: ");
        nhanVien.address = scanner.nextLine();
        System.out.println("Luong: ");
        nhanVien.salary = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Tong thoi gian: ");
        nhanVien.time = scanner.nextInt();
        scanner.nextLine();
    }

    public void printInfo(){
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ten: " + getName());
        System.out.println("Tuoi: " + getOld());
        System.out.println("Dia chi: " + getAddress());
        System.out.println("Luong: " + getSalary());
        System.out.println("So gio lam: " + getTime());
        System.out.println("------------------------------");
    }

    public double tinhThuong(double tien){

        if(time >= 200){
            return tien = (float) salary * 0.2;
        }
        else if(time < 200 && time >= 100 ){
            return tien = (float) salary * 0.1;
        }
        else {
            tien = 0;
        }
        return tien;
    }
}
