package session08.currency;

import java.text.DecimalFormat;

public class CurrencyConverter {

    // Tỉ giá USD/VND dùng chung cho toàn bộ chương trình
    private static double rate = 26000;

    // Constructor private để không cho tạo object
    private CurrencyConverter() {
    }

    // Đặt tỉ giá
    public static void setRate(double r) {

        if (r <= 0) {
            System.out.println("Ti gia khong hop le!");
            return;
        }

        rate = r;
    }

    // Lấy tỉ giá hiện tại
    public static double getRate() {
        return rate;
    }

    // Quy đổi VND -> USD
    public static double toUSD(int vnd) {

        if (vnd < 0) {
            System.out.println("So tien VND khong hop le!");
            return 0;
        }

        return vnd / rate;
    }

    // Format USD
    public static String formatUSD(double usd) {

        DecimalFormat df = new DecimalFormat("#,##0.00");

        return df.format(usd) + " USD";
    }
}
