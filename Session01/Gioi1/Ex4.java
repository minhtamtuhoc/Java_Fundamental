package re;

import java.util.Scanner;

public class Ex4 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        // Khai báo biến
        int tu1, mau1, tu2, mau2;
        int tuTong, mauTong;

        // Nhập phân số thứ nhất
        System.out.print("Nhap tu so phan so thu nhat: ");
        tu1 = sc.nextInt();

        System.out.print("Nhap mau so phan so thu nhat: ");
        mau1 = sc.nextInt();

        // Nhập phân số thứ hai
        System.out.print("Nhap tu so phan so thu hai: ");
        tu2 = sc.nextInt();

        System.out.print("Nhap mau so phan so thu hai: ");
        mau2 = sc.nextInt();

        // Tính tổng
        tuTong = (tu1 * mau2) + (tu2 * mau1);
        mauTong = mau1 * mau2;

        // In kết quả
        System.out.println("Tong hai phan so la: " + tuTong + "/" + mauTong);

        sc.close();
    }
}
