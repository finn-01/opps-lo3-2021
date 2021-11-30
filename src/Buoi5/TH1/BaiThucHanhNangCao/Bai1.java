package Buoi5.TH1.BaiThucHanhNangCao;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so canh da giac: ");
        int n = scanner.nextInt();

        int[] arrays = new int[n];
        int chuVi= 0;
        int i = 0;

        while (i < n){
            System.out.println("Nhap chieu dai cac canh: ");
            int chieuDai = scanner.nextInt();
            scanner.nextLine();

            chuVi += chieuDai;
            arrays[i] = chieuDai;

            i++;
        }

        for(int y = 0; y < n; y++){
            System.out.println("Chieu dai thu[" + y + "] = " + arrays[y]);
        }

        System.out.println("Chu vi: " + chuVi);
    }
}
