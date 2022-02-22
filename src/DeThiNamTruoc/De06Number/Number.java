package DeThiNamTruoc.De06Number;

import java.util.Scanner;

public class Number {
    private int numA;
    private int numB;

    public Number() {
    }

    public Number(int numA, int numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public int getNumA() {
        return numA;
    }

    public void setNumA(int numA) {
        this.numA = numA;
    }

    public int getNumB() {
        return numB;
    }

    public void setNumB(int numB) {
        this.numB = numB;
    }

    public int addNum(){
        return getNumA() + getNumB();
    }

    public int subNum(){
        return getNumA() - getNumB();
    }

    public int mulNum(){
        return getNumA() * getNumB();
    }

    public float chiaNum(){
        return getNumA() / getNumB();
    }

    public int UCLN(int a, int b){
        if(b == 0) return a;
        return UCLN(b, a % b);
    }

    public void input(){
        Number number = new Number();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap A: ");
        int a = scanner.nextInt();

        System.out.println("Nhap B: ");
        int b = scanner.nextInt();

        this.setNumA(a);
        this.setNumB(b);


    }

    public static void main(String[] args) {
        Number number = new Number();
        number.input();

        System.out.println("Add: " + number.addNum());
        System.out.println("Sub: " + number.subNum());
        System.out.println("Mul: " + number.mulNum());
        System.out.println("Chia: " + number.chiaNum());
        System.out.println("UCLN: " + number.UCLN(number.getNumA(), number.getNumB()));
    }
}
