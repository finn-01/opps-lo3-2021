package Buoi4.Bai15;

public class Mouse extends USB{
    public Mouse() {
    }

    public Mouse(String id, float price, int quantity) {
        super(id, price, quantity);
    }


    @Override
    public float tongTien() {
        return  (this.price * this.quantity * (float) 0.8);
    }

    @Override
    public void showInfoDonHang() {
        super.showInfoDonHang();
    }
}
