package session09.luyentap1;

public class Main {

    public static void main(String[] args) {

        // Tạo object Rectangle
        Rectangle r = new Rectangle(5, 3);

        // Gọi phương thức
        double area = r.getArea();
        double perimeter = r.getPerimeter();

        // In kết quả
        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        // In toàn bộ thông tin
        System.out.println("\nThong tin hinh chu nhat:");
        r.printInfo();
    }
}
