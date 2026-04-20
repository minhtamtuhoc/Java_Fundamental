package re;

import java.util.Scanner;

public class Ex2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Nhập cân nặng
        System.out.print("Nhap can nang (kg): ");
        double canNang = sc.nextDouble();

        // Nhập chiều cao
        System.out.print("Nhap chieu cao (m): ");
        double chieuCao = sc.nextDouble();

        // Tính BMI
        double bmi = canNang / (chieuCao * chieuCao);

        // In kết quả
        System.out.println("Chi so BMI cua ban la: " + bmi);

        sc.close();
    }
}
