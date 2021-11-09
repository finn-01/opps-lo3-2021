package Chapter2;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        final int FIVE_HUNDRED_THOUSAND = 500000;
        final int TWO_HUNDRED_THOUSAND = 200000;
        final int ONE_HUNDRED_THOUSAND = 100000;
        final int FIFTY_THOUSAND = 50000;
        final int TWENTY_THOUSAND = 20000;
        final int ONE_THOUSAND = 50000;

        int fiveHundredThousand = 0;
        int twoHundredThousand = 0;
        int oneHundredThousand = 0;
        int fiftyThousand = 0;
        int twentyThousand = 0;
        int oneThousand = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so tien can rut: ");
        int money = scanner.nextInt();
        scanner.nextLine();

        if(money >= FIVE_HUNDRED_THOUSAND){
            fiveHundredThousand = money / FIVE_HUNDRED_THOUSAND;
            money = money % FIVE_HUNDRED_THOUSAND;
            System.out.println("Gia tri: " + FIVE_HUNDRED_THOUSAND + " : " + fiveHundredThousand);
        }

        if(money >= TWO_HUNDRED_THOUSAND){
            twoHundredThousand = money / TWO_HUNDRED_THOUSAND;
            money = money % TWO_HUNDRED_THOUSAND;
            System.out.println("Gia tri: " + TWO_HUNDRED_THOUSAND + " : " + twoHundredThousand);
        }

        if(money >= ONE_HUNDRED_THOUSAND){
            oneHundredThousand = money / ONE_HUNDRED_THOUSAND;
            money = money % ONE_HUNDRED_THOUSAND;
            System.out.println("Gia tri: " + ONE_HUNDRED_THOUSAND + " : " + oneHundredThousand);
        }

        if(money >= FIFTY_THOUSAND){
            fiftyThousand = money / FIFTY_THOUSAND;
            money = money % FIFTY_THOUSAND;
            System.out.println("Gia tri: " + FIFTY_THOUSAND + " : " + FIFTY_THOUSAND);
        }

        if(money >= TWENTY_THOUSAND){
            twentyThousand = money / TWENTY_THOUSAND;
            money = money % TWENTY_THOUSAND;
            System.out.println("Gia tri: " + TWENTY_THOUSAND + " : " + twentyThousand);
        }

        if(money >= ONE_THOUSAND){
            oneThousand = money / ONE_THOUSAND;
            money = money % ONE_THOUSAND;
            System.out.println("Gia tri: " + ONE_THOUSAND + " : " + oneThousand);
        }

    }
}
