package Buoi3.Bai4;

public class Account {
    private int id;
    private String name;
    private double balance;

    public Account() {
    }

    public Account(int id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void credit(int amount){
        this.balance = this.balance + amount;
        System.out.println("Balance khi nhan acc1: " + this.balance);
        System.out.println("------------------------------------");
    }

    public void debit(int amount){
        this.balance = (this.balance - amount);
        System.out.println("Balance khi chuyen acc1: " + this.balance);
        System.out.println("------------------------------------");
    }

    public void transferTo(Account account, int amount){
        System.out.println("So du hien tai cua Account nhan: " + account.getBalance());
        account.setBalance(account.balance + amount);
        System.out.println("So du sau khi chuyen cua Account nhan: " + account.getBalance());
        this.setBalance(balance - amount);
        account.showInfo();
    }

    public void showInfo(){
        System.out.println("Username: " + this.getName());
        System.out.println("ID: " + this.getId());
        System.out.println("Balance: " + this.getBalance());
        System.out.println("------------------------------------");
    }
}
