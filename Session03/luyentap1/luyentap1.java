package session03_md02;

import java.util.Scanner;

public class luyentap1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Nhập dữ liệu
        System.out.print("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();

        System.out.print("Nhập số lượng: ");
        int quantity = sc.nextInt();

        System.out.print("Có thẻ thành viên (true/false): ");
        boolean isMember = sc.nextBoolean();

        // Tính toán
        double thanhTien = price * quantity;

        double giamGia = 0;
        if (isMember) {
            giamGia = thanhTien * 0.10;
        }

        double vat = (thanhTien - giamGia) * 0.08;

        double tongThanhToan = thanhTien - giamGia + vat;

        // In kết quả
        System.out.println("\n===== HÓA ĐƠN =====");
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Số lượng: " + quantity);
        System.out.println("Đơn giá: " + price);
        System.out.println("Thành tiền: " + thanhTien);
        System.out.println("Giảm giá: " + giamGia);
        System.out.println("VAT (8%): " + vat);
        System.out.println("Tổng thanh toán: " + tongThanhToan);
    }
}
