package re;

import java.util.Scanner;

public class Ex3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Khai báo biến
        float width, height;
        float area, perimeter;

        // Nhập dữ liệu
        System.out.print("Nhap chieu rong: ");
        width = sc.nextFloat();

        System.out.print("Nhap chieu dai: ");
        height = sc.nextFloat();

        // Tính toán
        area = width * height;
        perimeter = 2 * (width + height);

        // In kết quả
        System.out.println("Dien tich hinh chu nhat: " + area);
        System.out.println("Chu vi hinh chu nhat: " + perimeter);

        sc.close();
    }
}
