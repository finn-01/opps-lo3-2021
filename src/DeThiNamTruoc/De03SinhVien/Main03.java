package DeThiNamTruoc.De03SinhVien;

import java.util.ArrayList;

public class Main03 {
    public static void main(String[] args) {
        ArrayList<LopHoc> lopHocs = new ArrayList<>();

        lopHocs.add(new LopHoc("Sam", "1", 9.0f, 8.0f, 50, "AT16D"));
        lopHocs.add(new LopHoc("Sam1", "1", 9.0f, 8.0f, 50, "AT16D"));
        lopHocs.add(new LopHoc("Sam2", "1", 9.0f, 8.0f, 50, "AT16D"));
        lopHocs.add(new LopHoc("Sam3", "1", 9.0f, 8.0f, 50, "AT16D"));
        for (LopHoc x: lopHocs){
            System.out.println(x.toString());
        }
    }


}
