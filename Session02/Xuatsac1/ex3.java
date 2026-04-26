package session02;

import java.util.Scanner;

public class ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số (100-999): ");
        int n = sc.nextInt();

        // Kiểm tra hợp lệ
        if (n < 100 || n > 999) {
            System.out.println("Số nhập vào không hợp lệ");
            return;
        }

        int hundreds = n / 100;
        int tens = (n / 10) % 10;
        int units = n % 10;

        String result = "";

        // Hàng trăm
        switch (hundreds) {
            case 1: result += "Một trăm "; break;
            case 2: result += "Hai trăm "; break;
            case 3: result += "Ba trăm "; break;
            case 4: result += "Bốn trăm "; break;
            case 5: result += "Năm trăm "; break;
            case 6: result += "Sáu trăm "; break;
            case 7: result += "Bảy trăm "; break;
            case 8: result += "Tám trăm "; break;
            case 9: result += "Chín trăm "; break;
        }

        // Hàng chục
        if (tens == 0) {
            if (units != 0) result += "lẻ ";
        } else if (tens == 1) {
            result += "mười ";
        } else {
            switch (tens) {
                case 2: result += "hai mươi "; break;
                case 3: result += "ba mươi "; break;
                case 4: result += "bốn mươi "; break;
                case 5: result += "năm mươi "; break;
                case 6: result += "sáu mươi "; break;
                case 7: result += "bảy mươi "; break;
                case 8: result += "tám mươi "; break;
                case 9: result += "chín mươi "; break;
            }
        }

        // Hàng đơn vị
        if (units != 0) {
            if (tens >= 2 && units == 1) {
                result += "mốt";
            } else if (tens >= 1 && units == 5) {
                result += "lăm";
            } else {
                switch (units) {
                    case 1: result += "một"; break;
                    case 2: result += "hai"; break;
                    case 3: result += "ba"; break;
                    case 4: result += "bốn"; break;
                    case 5: result += "năm"; break;
                    case 6: result += "sáu"; break;
                    case 7: result += "bảy"; break;
                    case 8: result += "tám"; break;
                    case 9: result += "chín"; break;
                }
            }
        }

        System.out.println("Đọc là: " + result.trim());
    }
}
