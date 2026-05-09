package session05;

import java.util.Random;
import java.util.Scanner;

public class RandomCodeGenerator {
    // Hàm tạo chuỗi ngẫu nhiên
    public static String generateRandomCode(int n) {

        // Tập ký tự cho phép
        String characters =
                "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                        "abcdefghijklmnopqrstuvwxyz" +
                        "0123456789";

        Random random = new Random();

        // Dùng StringBuilder để tối ưu hiệu năng
        StringBuilder sb = new StringBuilder();

        // Tạo chuỗi ngẫu nhiên
        for (int i = 0; i < n; i++) {

            // Random vị trí ký tự
            int index = random.nextInt(characters.length());

            // Thêm ký tự vào chuỗi
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;

        do {
            System.out.print("Nhập độ dài chuỗi (1 - 1000): ");
            n = sc.nextInt();

            if (n < 1 || n > 1000) {
                System.out.println("Vui lòng nhập từ 1 đến 1000!");
            }

        } while (n < 1 || n > 1000);

        String result = generateRandomCode(n);

        System.out.println("Chuỗi ngẫu nhiên: " + result);

        sc.close();
    }
}
