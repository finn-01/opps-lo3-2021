package Buoi5.TH2.BaiThucHanhCoBan;

import java.util.Scanner;

public class Bai4While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap n: ");
        int n = scanner.nextInt();


        if(n >= 2){
            System.out.print(2);
        }
        for(int i = 3; i < n; i+=2){
            if(isPrime(i)){
                System.out.print(" " + i);
            }
        }

    }

    public static Boolean isPrime(int n){
        int i = 2;

        while (i < n){
            if(n % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
