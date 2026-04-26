package session02;

import java.util.Scanner;

public class ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số nguyên N: ");
        int n = sc.nextInt();

        // Nếu số âm → chuyển thành dương
        n = Math.abs(n);

        int sum = 0;

        // Tách từng chữ số
        while (n > 0) {
            int digit = n % 10; // lấy chữ số cuối
            sum += digit;       // cộng vào tổng
            n = n / 10;         // bỏ chữ số cuối
        }

        System.out.println("Tổng các chữ số = " + sum);
    }
}