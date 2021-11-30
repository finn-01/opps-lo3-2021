package Buoi5.TH2.BaiThucHanhCoBan;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class Bai3 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2021, 11,30);
        DayOfWeek day = date.getDayOfWeek();

        System.out.println("Day: " + day.getDisplayName(TextStyle.FULL, Locale  .getDefault()));
    }
}
