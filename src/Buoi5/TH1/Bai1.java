package Buoi5.TH1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap a: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhap b: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Tong 2 so a + b = " + (a + b));
    }
}
