package Buoi7.KiemTraGiuaKi;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);

    public static int totalItems = 0;
    public int MAX_ITEMS = 1000;
    ArrayList<Book> listItems = new ArrayList();

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

        listItems.add(book);
        totalItems++;
    }

    public void delete (int id)
    {
        for(Book x: listItems)
        {
            if(x.getId()== id)
            {
                listItems.remove(x);
                totalItems--;
                System.out.println("Xoa thanh cong!");
                break;
            }
            else
            {
                System.out.println("Khong co sach trung voi id = " + id + " can xoa!");
                break;
            }
        }
    }

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
                break;
            }
            else
            {
                System.out.println("Khong co sach nao trung voi id = " + id + " ban vua nhap!");
                break;
            }
        }
    }

    public void list()
    {
        System.out.println("Tong so sach la: " + totalItems);
        for(Book x: listItems)
        {
            System.out.println(x + "");
        }
    }
}
