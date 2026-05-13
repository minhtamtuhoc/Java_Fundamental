// Main.java
package session08.productmanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Product> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== MENU SẢN PHẨM =====");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. In danh sách sản phẩm");
            System.out.println("3. Tìm sản phẩm theo khoảng giá");
            System.out.println("4. Thống kê số sản phẩm đã tạo");
            System.out.println("0. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:

                    Product p = new Product();
                    p.input();

                    list.add(p);

                    System.out.println("Thêm sản phẩm thành công!");
                    break;

                case 2:

                    if (list.isEmpty()) {
                        System.out.println("Danh sách rỗng!");
                    } else {

                        System.out.println("\nDANH SÁCH SẢN PHẨM");

                        for (Product x : list) {
                            x.print();
                        }
                    }

                    break;

                case 3:

                    if (list.isEmpty()) {
                        System.out.println("Danh sách rỗng!");
                    } else {

                        System.out.print("Nhập giá thấp nhất: ");
                        double min = Double.parseDouble(sc.nextLine());

                        System.out.print("Nhập giá cao nhất: ");
                        double max = Double.parseDouble(sc.nextLine());

                        System.out.println("\nSẢN PHẨM TRONG KHOẢNG GIÁ");

                        boolean found = false;

                        for (Product x : list) {

                            if (x.getPrice() >= min &&
                                    x.getPrice() <= max) {

                                x.print();
                                found = true;
                            }
                        }

                        if (!found) {
                            System.out.println("Không tìm thấy sản phẩm!");
                        }
                    }

                    break;

                case 4:

                    System.out.println("Tổng số sản phẩm đã tạo: "
                            + Product.getTotalProduct());

                    break;

                case 0:

                    System.out.println("Thoát chương trình!");
                    break;

                default:

                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }
}