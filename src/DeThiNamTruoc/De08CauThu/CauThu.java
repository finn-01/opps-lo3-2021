package DeThiNamTruoc.De08CauThu;

import java.io.*;
import java.util.Scanner;

public class CauThu {
    private int id;
    private String ten;
    private int namSinh;
    private String viTri;

    public CauThu() {
    }

    public CauThu(int id, String ten, int namSinh, String viTri) {
        this.id = id;
        this.ten = ten;
        this.namSinh = namSinh;
        this.viTri = viTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    @Override
    public String toString() {
        return "CauThu{" +
                "id=" + id +
                ", ten='" + ten + '\'' +
                ", namSinh=" + namSinh +
                ", viTri='" + viTri + '\'' +
                '}';
    }

    public void nhapCauThu(){
        CauThu cauThu = new CauThu();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma cau thu: ");
        int maCT = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ten: ");
        String ten = scanner.nextLine();

        System.out.println("Nam sinh: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Vi tri: ");
        String viTri = scanner.nextLine();

        this.setId(maCT);
        this.setTen(ten);
        this.setViTri(viTri);
        this.setNamSinh(tuoi);

        try{
            FileOutputStream fileOutputStream= new FileOutputStream("cauthu.txt");
            ObjectOutputStream outputStream = new ObjectOutputStream((fileOutputStream));
            outputStream.writeUTF(cauThu.toString());
            outputStream.close();
            System.out.println("Ghi thanh cong");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void in(){
        try{
            File file = new File("cauthu.txt");
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()){
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CauThu cauThu = new CauThu();

        cauThu.nhapCauThu();
        cauThu.in();
        System.out.println(cauThu.toString());
    }
}
