package Buoi7.KiemTraGiuaKi;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    //Input
    Scanner scanner = new Scanner(System.in);

    //Khai bao
    public static int totalItems = 0;
    public int MAX_ITEMS = 1000;
    ArrayList<Book> listItems = new ArrayList();

    //Ham them sach
    public void add ()
    {
        Book book = new Book();

        System.out.println("Nhap ID: ");
        book.setId(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Nhap ten sach: ");
        book.setName(scanner.nextLine());

        System.out.println("Nhap gia sach: ");
        book.setPrice(scanner.nextInt());
        scanner.nextLine();

        listItems.add(book);
        totalItems++;

        System.out.println("Da them thanh cong: " + book.toString() + " vao danh sach.");
    }

    //Ham xoa
    public void delete (int id)
    {
        for(Book x: listItems)
        {
            if(x.getId()== id)
            {
                listItems.remove(x);
                totalItems--;
                System.out.println("Xoa thanh cong sach co id = " + id);
                break;
            }
            else
            {
                System.out.println("Khong co sach trung voi id = " + id + " can xoa!");
                break;
            }
        }
    }

    //Ham tim
    public void find(String name)
    {
        for(Book x: listItems)
        {
            if(x.getName().equalsIgnoreCase(name))
            {
                System.out.println("Book: " + x.toString());
                break;
            }
            else
            {
                System.out.println("Khong tim duoc sach = " + name + " theo ten can tim!");
                break;
            }
        }
    }

    //Ham sua
    public void edit(int id)
    {
        for(Book x: listItems)
        {
            if(x.getId()== id)
            {
                scanner.nextLine();
                System.out.println("Nhap ten sach moi: ");
                x.setName(scanner.nextLine());

                System.out.println("Nhap gia sach moi: ");
                x.setPrice(scanner.nextInt());
                scanner.nextLine();

                System.out.println("Da sua thanh cong!");
                System.out.println("Sach da sua thanh: " + x.toString());
                break;
            }
            else
            {
                System.out.println("Khong co sach nao trung voi id = " + id + " ban vua nhap!");
                break;
            }
        }
    }

    //Ham liet ke sách
    public void list()
    {
        System.out.println("Tong so sach la: " + totalItems);
        for(Book x: listItems)
        {
            System.out.println(x + "");
        }
    }
}
