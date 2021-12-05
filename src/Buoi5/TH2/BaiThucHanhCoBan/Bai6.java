package Buoi5.TH2.BaiThucHanhCoBan;

import java.util.Scanner;

public class Bai6 {
    public static int sum(int n){
        long tong = 0;
        long tich = 1;
        for(int i = 1; i <= n; i++){
            tich = tich *i;
            tong = tong + tich;
        }
        return (int) tong;
    }

    public static int chanLe(int n){
        int sum= 0;
        if(n % 2 == 0){
            for(int i = 0; i <= n; i+=2){
                sum+=i;
            }
        }
        else {
            for(int i = 0; i <= n; i+=2){
                sum+=i;
            }
        }
        return sum;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        System.out.println(sum(n));
        System.out.println(chanLe(n));
    }
}
