package Buoi4.Bai15;

public class Main15 {
    public static void main(String[] args) {
        USB usb = new USB("At14", 100, 5);
        Mouse mouse = new Mouse("At16", 150, 10);
        usb.showInfoDonHang();
        mouse.showInfoDonHang();
    }


}
