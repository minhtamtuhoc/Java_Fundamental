package session08.currency;

public class Main {

    public static void main(String[] args) {

        // Hiển thị tỉ giá mặc định
        System.out.println("Ti gia hien tai: "
                + CurrencyConverter.getRate());

        // Đổi tỉ giá
        CurrencyConverter.setRate(25000);

        System.out.println("Ti gia moi: "
                + CurrencyConverter.getRate());

        // Quy đổi tiền
        int vnd1 = 100000;
        int vnd2 = 5000000;

        double usd1 = CurrencyConverter.toUSD(vnd1);
        double usd2 = CurrencyConverter.toUSD(vnd2);

        // In kết quả
        System.out.println(vnd1 + " VND = "
                + CurrencyConverter.formatUSD(usd1));

        System.out.println(vnd2 + " VND = "
                + CurrencyConverter.formatUSD(usd2));
    }
}
