package session02;

import java.util.Scanner;

public class ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập cạnh a: ");
        int a = sc.nextInt();

        System.out.print("Nhập cạnh b: ");
        int b = sc.nextInt();

        System.out.print("Nhập cạnh c: ");
        int c = sc.nextInt();

        // Kiểm tra hợp lệ
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Các cạnh phải là số dương.");
        } else if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        } else {
            // Phân loại tam giác
            if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a == b || b == c || a == c) {
                System.out.println("Tam giác cân");
            } else if (a * a + b * b == c * c ||
                    a * a + c * c == b * b ||
                    b * b + c * c == a * a) {
                System.out.println("Tam giác vuông");
            } else {
                System.out.println("Tam giác thường");
            }
        }
    }
}
