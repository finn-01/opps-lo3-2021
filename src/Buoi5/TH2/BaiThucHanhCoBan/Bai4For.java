package Buoi5.TH2.BaiThucHanhCoBan;

import java.util.Scanner;

public class Bai4For {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if(n >= 2){
            System.out.print(2);
        }
            for(int i = 3; i < n; i+=2){
                if(isPrime(i)){
                    System.out.print( " " + i);
                }
            }
    }

    public static Boolean isPrime(int n){
        if(n < 2){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
