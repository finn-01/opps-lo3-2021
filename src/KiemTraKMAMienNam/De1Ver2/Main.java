package KiemTraKMAMienNam.De1Ver2;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        SieuThi sieuThi = new SieuThi();

        int choice = 0;

        do{
            menu();
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("Ban chon nhap san pham!");
                    sieuThi.themSanPham();
                    break;
                case 2:
                    System.out.println("Ban da chon them khach hang!");
                    sieuThi.themKhachHang();
                    break;
                case 3:
                    System.out.println("Ban da chon sua thong tin khach hang!");
                    sieuThi.suaThongTinKhachHang();
                    break;
                case 4:
                    System.out.println("Ban da chon in san pham!");
                    sieuThi.inThongTinSanPhamCuaSieuThi();
                    break;
                case 5:
                    System.out.println("Ban da chon mua san pham!");
                    sieuThi.khachHangMuaSanPham();
                    break;
                case 6:
                    System.out.println("Ban da chon in khach hang va sap xep!");
                    sieuThi.inKhachHangSapXep();
                    break;
                case 7:
                    System.out.println("Ban da chon in thong tin khach hang!");
                    sieuThi.inThongTinKhachHang();
                    break;
                case 8:
                    System.out.println("Ban da chon in thong tin hoa don!");
                    sieuThi.inHoaDon();
                    break;
                case 0:
                    exit(0);
                default:
                    System.out.println("Chi nhap tu 0 - 8");
                    break;

            }

        }while (choice != 0);
    }

    public static void menu() throws InterruptedException {
        System.out.println(" ___________________________________________");
        System.out.println("|                     Menu                  |");
        System.out.println("|-------------------------------------------|");
        System.out.println("|  1.Nhap San Pham                          |");
        System.out.println("|  2.Them Khach Hang                        |");
        System.out.println("|  3.Sua thong tin Khach Hang               |");
        System.out.println("|  4.In tat ca thong tin San Pham           |");
        System.out.println("|  5.Khach Hang mua San Pham                |");
        System.out.println("|  6.In tat ca khach hang da mua va sap xep |");
        System.out.println("|  7.In tat ca khach hang                   |");
        System.out.println("|  8.In tat ca Hoa Don                      |");
        System.out.println("|  0.Exit                                   |");
        System.out.println(" ===========================================");
        System.out.printf("Moi nhap lua chon: ");

    }
}
