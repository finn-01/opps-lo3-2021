package Buoi7.KiemTraGiuaKi;

import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Store store = new Store();

        int chon;

        while(true)
        {
            menu();
            chon = scanner.nextInt();
            switch(chon)
            {
                case 1:
                {
                    System.out.println("Ban da chon nhap them sach!");
                    store.add();
                    break;
                }
                case 2:
                {
                    System.out.println("Ban da chon sua thong tin sach!");
                    System.out.println("Nhap id sach can sua: ");
                    int idSua = scanner.nextInt();
                    store.edit(idSua);
                    break;
                }
                case 3:
                {
                    System.out.println("Ban da chon xoa sach!");
                    System.out.println("Nhap id sach can xoa: ");
                    int idXoa = scanner.nextInt();
                    store.delete(idXoa);
                    break;
                }
                case 4:
                {
                    scanner.nextLine();
                    System.out.println("Ban da chon tim sach!");
                    System.out.println("Nhap ten sach can tim:");
                    String name = scanner.nextLine();
                    store.find(name);
                    break;
                }
                case 5:
                {
                    System.out.println("Ban da chon hien thi toan bo sach!");
                    store.list();
                    break;
                }
                case 0:
                {
                    exit(0);
                }
                default:
                    System.out.println("Vui long chon tu 0-5!");
            }
        }
    }

    //Menu
    public static void menu()
    {
        System.out.println(" __________________________________________");
        System.out.println("|                     MENU                 |");
        System.out.println("|------------------------------------------|");
        System.out.println("| 1.Them sach                              |");
        System.out.println("| 2.Chinh sua thong tin sach               |");
        System.out.println("| 3.Xoa sach                               |");
        System.out.println("| 4.Tim sach                               |");
        System.out.println("| 5.Hien thi sach                          |");
        System.out.println("| 0.Exit                                   |");
        System.out.println("|__________________________________________|");
    }
}
