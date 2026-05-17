package session08.calculate;

public class Main {

    public static void main(String[] args) {

        // Tạo 3 đối tượng Rectangle
        Rectangle r1 = new Rectangle(3, 4);
        Rectangle r2 = new Rectangle(5, 2);
        Rectangle r3 = new Rectangle(4.5, 3.5);

        // In thông tin từng hình
        System.out.println("Thong tin cac hinh chu nhat:");
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);

        // Tìm diện tích lớn nhất
        double maxArea = Math.max(r1.getArea(),
                Math.max(r2.getArea(), r3.getArea()));

        System.out.println("\nDien tich lon nhat: " + maxArea);

        // Kiểm tra có bao nhiêu hình có diện tích lớn nhất
        int count = 0;

        if (r1.getArea() == maxArea) {
            count++;
        }

        if (r2.getArea() == maxArea) {
            count++;
        }

        if (r3.getArea() == maxArea) {
            count++;
        }

        // In kết quả
        if (count > 1) {
            System.out.println("Co nhieu hinh co cung dien tich lon nhat:");
        } else {
            System.out.println("Hinh co dien tich lon nhat:");
        }

        if (r1.getArea() == maxArea) {
            System.out.println(r1);
        }

        if (r2.getArea() == maxArea) {
            System.out.println(r2);
        }

        if (r3.getArea() == maxArea) {
            System.out.println(r3);
        }
    }
}
