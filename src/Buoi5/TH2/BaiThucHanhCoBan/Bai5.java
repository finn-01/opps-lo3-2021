package Buoi5.TH2.BaiThucHanhCoBan;

import java.util.Scanner;

public class Bai5 {
    public static boolean isPrime(int n){
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

    //Perfect number: 6 = 1 + 2 + 3
    //Not perfect num:12 =  1 + 2 + 3+ 4 + 6
    public static boolean perfectNumber(int n){
        int sum = 0;
        for(int i = 1; i < n / 2; i++){
            if(n % i == 0){
                sum += i;
            }
        }
        if(sum == n){
            return true;
        }
        return false;
    }

    public static boolean squareNumber(int n){
        int temp = (int) Math.sqrt(n);
        if(temp * temp == n){
            return true;
        }
        return false;
    }

    public static int fibonacci(int n){
        int f0 = 0;
        int f1 = 1;
        int fn = 1;

        if(n < 0){
            return -1;
        }
        else if (n == 0 || n == 1){
            return n;
        }
        else {
            for (int  i = 2; i < n; i++){
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("N: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        if(isPrime(n)){
            System.out.println(n + " la SNT");
        }
        if(perfectNumber(n)){
            System.out.println(n + " la so hoan hao");
        }
        if(squareNumber(n)){
            System.out.println(n + " la so chan phuong");
        }
        System.out.println("Fibonacci: " + fibonacci(n));
    }
}
