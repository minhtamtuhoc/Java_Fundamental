import java.util.Scanner;

public class QuanLyLuong {

    static Scanner sc = new Scanner(System.in);
    static double[] salaries;
    static int n;

    // 1. Nhập dữ liệu
    public static void nhap() {
        System.out.print("Nhập số nhân viên: ");
        n = sc.nextInt();
        salaries = new double[n];

        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Nhập lương NV " + (i + 1) + ": ");
                salaries[i] = sc.nextDouble();
            } while (salaries[i] < 0); // validate
        }
    }

    // 2. Hiển thị
    public static void hienThi() {
        if (salaries == null) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("NV %d: %.2f\n", i + 1, salaries[i]);
        }
    }

    // 3. Sắp xếp
    public static void sapXep() {
        System.out.println("1. Tăng dần");
        System.out.println("2. Giảm dần");
        System.out.print("Chọn: ");
        int choice = sc.nextInt();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (choice == 1 && salaries[i] > salaries[j] ||
                        choice == 2 && salaries[i] < salaries[j]) {

                    double temp = salaries[i];
                    salaries[i] = salaries[j];
                    salaries[j] = temp;
                }
            }
        }

        System.out.println("Đã sắp xếp!");
        hienThi();
    }

    // 4. Tìm kiếm (Linear Search)
    public static void timKiem() {
        System.out.print("Nhập lương cần tìm: ");
        double x = sc.nextDouble();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (salaries[i] == x) {
                System.out.println("Tìm thấy tại vị trí: " + i);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy!");
        }
    }

    // 5. Thống kê
    public static void thongKe() {
        double sum = 0;
        double max = salaries[0];
        double min = salaries[0];

        for (double s : salaries) {
            sum += s;
            if (s > max) max = s;
            if (s < min) min = s;
        }

        double avg = sum / n;

        int countAboveAvg = 0;
        for (double s : salaries) {
            if (s > avg) countAboveAvg++;
        }

        System.out.println("Tổng lương: " + sum);
        System.out.println("Lương trung bình: " + avg);
        System.out.println("Lương cao nhất: " + max);
        System.out.println("Lương thấp nhất: " + min);
        System.out.println("Số NV > trung bình: " + countAboveAvg);
    }

    // MENU
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n====== QUẢN LÝ LƯƠNG ======");
            System.out.println("1. Nhập dữ liệu");
            System.out.println("2. Xem danh sách");
            System.out.println("3. Sắp xếp");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thống kê");
            System.out.println("6. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: nhap(); break;
                case 2: hienThi(); break;
                case 3: sapXep(); break;
                case 4: timKiem(); break;
                case 5: thongKe(); break;
                case 6: System.out.println("Thoát..."); break;
                default: System.out.println("Chọn sai!");
            }

        } while (choice != 6);
    }
}