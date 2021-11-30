package Buoi5.TH1.BaiThucHanhNangCao;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input float: ");
        float a = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Input double: ");
        double b = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Tong: " + (a + b));
        System.out.println("Hieu: " + (a - b));
        System.out.println("Nhan: " + (a * b));
        System.out.println("Chia: " + (a / b));
        System.out.println("Modun: " + (a % b));
    }
}
