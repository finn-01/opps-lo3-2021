package Buoi4.Bai15;

public class USB {
    public String id;
    public float price;
    public int quantity;

    public USB() {
    }

    public USB(String id, float price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float tongTien(){
        return price * quantity;
    }

    public void showInfoDonHang(){
        System.out.println("DON HANG: ");
        System.out.println("Ma hang: " + this.getId());
        System.out.println("Gia: " + this.getPrice());
        System.out.println("So luong: " + this.getQuantity());
        System.out.println("TONG TIEN: " + this.tongTien());
        System.out.println("-----------------------------------");
    }


}
