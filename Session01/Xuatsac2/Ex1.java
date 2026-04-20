package re;

import java.util.Scanner;

public class Ex1 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Nhập vận tốc
        System.out.print("Nhap van toc (km/h): ");
        double vanToc = sc.nextDouble();

        while(vanToc < 0){
            System.out.print("Van toc khong duoc nho hon 0. Nhap lai: ");
            vanToc = sc.nextDouble();
        }

        // Nhập thời gian
        System.out.print("Nhap thoi gian di (gio): ");
        double thoiGian = sc.nextDouble();

        while(thoiGian < 0){
            System.out.print("Thoi gian khong duoc nho hon 0. Nhap lai: ");
            thoiGian = sc.nextDouble();
        }

        // Tính quãng đường
        double quangDuong = vanToc * thoiGian;

        // In kết quả
        System.out.println("Quang duong di duoc la: " + quangDuong + " km");

        sc.close();
    }
}
