package Buoi5.TH3.BaiThucHanhNangCao.Bai1;

public class Main {
    public static void main(String[] args) {
//        DaGiac daGiac = new DaGiac();
//        daGiac.nhapTT();
//        System.out.println("Chu vi: " + daGiac.chuVi());

        TamGiac tamGiac = new TamGiac();
        tamGiac.nhapTT();
        System.out.println("Chu vi: " +tamGiac.chuVi());
        System.out.println("Dien tich: " + tamGiac.dienTich() );
    }
}
