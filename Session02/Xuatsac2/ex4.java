package session02;

import java.util.Scanner;

public class ex4 {
    // Hàm đếm số chữ số
    public static int countDigits(int n) {
        if (n == 0) return 1;
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    // Hàm kiểm tra Armstrong
    public static boolean isArmstrong(int n) {
        int k = countDigits(n);
        int sum = 0;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, k);
            temp /= 10;
        }

        return sum == n;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        int N;

        // Nhập hợp lệ
        do {
            System.out.print("Nhập số nguyên dương N: ");
            N = sc.nextInt();
            if (N < 0) {
                System.out.println("Số nhập vào không hợp lệ, nhập lại!");
            }
        } while (N < 0);

        System.out.println("Các số Armstrong từ 0 đến " + N + ":");

        for (int i = 0; i <= N; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
