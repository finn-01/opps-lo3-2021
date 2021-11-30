package Buoi5.TH1.BaiThucHanhCoBan;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a: ");
        int a = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input b: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Sum: a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
    }
}
