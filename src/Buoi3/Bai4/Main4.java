package Buoi3.Bai4;

public class Main4 {
    public static void main(String[] args) {
        Account account= new Account(1, "Sam", 1000);
        account.credit(500);
        account.debit(500);
        account.transferTo(new Account(2, "Ngo", 2000), 300);
        account.showInfo();
    }
}
