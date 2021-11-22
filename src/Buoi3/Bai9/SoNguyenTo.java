package Buoi3.Bai9;

public class SoNguyenTo {
    private int a;

    public SoNguyenTo() {
    }

    public SoNguyenTo(int a) {
        if(isSoNT(a)){
            this.a = a;
        }
        else {
            System.out.println(a + " khong la SNT");
        }
    }

    public static boolean isSoNT(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int isNTTiepTheo(){
        if(isSoNT(this.getA())){
            while (true){
                int SNT = this.a + 1;
                if(isSoNT(SNT)){
                    System.out.println(SNT + " la so nt");
                    break;
                }
            }
        }
        else {
            System.out.println(this.getA() + " khong la SNT");
        }
        return 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if(isSoNT(a)){
            this.a = a;
        }else {
            System.out.println("khong set");
        }
    }
}
