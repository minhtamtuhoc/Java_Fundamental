// Product.java
package session08.productmanagement;

import java.util.Scanner;

public class Product {

    private int id;
    private String name;
    private double price;

    // static tự tăng ID
    private static int AUTO_ID = 1;

    // hằng số kho
    public final String WAREHOUSE_CODE = "KHO-01";

    // Constructor không tham số
    public Product() {

    }

    // Constructor có tham số
    public Product(String name, double price) {
        this.id = AUTO_ID;
        AUTO_ID++;

        this.name = name;
        this.price = price;
    }

    // nhập thông tin
    public void input() {
        Scanner sc = new Scanner(System.in);

        id = AUTO_ID;
        AUTO_ID++;

        System.out.print("Nhập tên sản phẩm: ");
        name = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        price = Double.parseDouble(sc.nextLine());
    }

    // in thông tin
    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Tên sản phẩm: " + name);
        System.out.println("Giá: " + price);
        System.out.println("Mã kho: " + WAREHOUSE_CODE);
        System.out.println("----------------------");
    }

    // getter
    public double getPrice() {
        return price;
    }

    // thống kê số sản phẩm
    public static int getTotalProduct() {
        return AUTO_ID - 1;
    }
}