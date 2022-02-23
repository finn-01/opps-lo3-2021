package DeThiNamTruoc.De05Person;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<NhanVien> nhanVienArrayList= new ArrayList<>();
        ArrayList<NhanVien> nhanVienArrayList1 = new ArrayList<>();

        nhanVienArrayList.add(new NhanVien("Sam", "2001", "HN", "Nam", "1", 1000, "HD"));
        nhanVienArrayList.add(new NhanVien("Sam1", "2001", "HN", "Nam", "1", 1000, "HD"));
        nhanVienArrayList.add(new NhanVien("Sam2", "2001", "HN", "Nam", "1", 1000, "HD"));
        nhanVienArrayList.add(new NhanVien("Sam3", "2001", "HN", "Nam", "1", 1000, "HD"));


        //Ghi File
        try{
            File file = new File("nhanvien.dat");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for(NhanVien x: nhanVienArrayList){
                bufferedWriter.write(x.toString());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for (NhanVien x: nhanVienArrayList){
            System.out.println(x.toString());
        }

        //Doc File
        try{
            File file = new File("docfile.dat");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String str;
            while ((str = br.readLine()) != null){
                String obj[] = str.split("\\$");
                String ten = obj[0];
                String ngaySinh = obj[1];
                String diaChi = obj[2];
                String gioiTinh = obj[3];
                String maNV = obj[4];
                int heSoLuong = Integer.parseInt(obj[5]);
                String donVi = obj[6];


                nhanVienArrayList1.add(new NhanVien(ten, ngaySinh, diaChi, gioiTinh, maNV, heSoLuong, donVi));
            }
            br.close();;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(NhanVien x: nhanVienArrayList1){
            System.out.println(x.toString());
        }
    }
}
