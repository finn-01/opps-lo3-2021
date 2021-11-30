package Buoi5.TH2.BaiThucHanhCoBan;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Chuyen doi sang nhi phan: " + n + " = " + Integer.toBinaryString(n));
    }
}
