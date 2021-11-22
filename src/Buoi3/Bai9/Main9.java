package Buoi3.Bai9;

public class Main9 {
    public static void main(String[] args) {
        SoNguyenTo soNguyenTo = new SoNguyenTo();
        soNguyenTo.setA(13);
        soNguyenTo.isNTTiepTheo();
        System.out.println("-------------------------");

        SoNguyenTo soNguyenTo1 = new SoNguyenTo(13);
        System.out.println("-------------------------");

        SoNguyenTo soNguyenTo2 = new SoNguyenTo(12);
        System.out.println("-------------------------");

        SoNguyenTo soNguyenTo3 = new SoNguyenTo();
        soNguyenTo3.setA(12);
        soNguyenTo3.isNTTiepTheo();
        System.out.println("-------------------------");
    }
}
