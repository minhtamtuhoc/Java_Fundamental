import java.util.Scanner;

public class QuanLyDiemSV {

    static Scanner sc = new Scanner(System.in);
    static double[] diem;
    static int n;

    // 1. Nhập danh sách điểm
    public static void nhapDanhSach() {
        System.out.print("Nhập số sinh viên: ");
        n = sc.nextInt();
        diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm SV " + (i + 1) + ": ");
            diem[i] = sc.nextDouble();
        }
    }

    // 2. In danh sách
    public static void inDanhSach() {
        if (diem == null) {
            System.out.println("Chưa có dữ liệu!");
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.println("SV " + (i + 1) + ": " + diem[i]);
        }
    }

    // 3. Tính trung bình
    public static void tinhTrungBinh() {
        double sum = 0;
        for (double d : diem) {
            sum += d;
        }
        System.out.println("Điểm trung bình: " + (sum / n));
    }

    // 4. Max & Min
    public static void maxMin() {
        double max = diem[0];
        double min = diem[0];

        for (double d : diem) {
            if (d > max) max = d;
            if (d < min) min = d;
        }

        System.out.println("Điểm cao nhất: " + max);
        System.out.println("Điểm thấp nhất: " + min);
    }

    // 5. Đếm đậu / rớt
    public static void demDatRot() {
        int dat = 0, rot = 0;

        for (double d : diem) {
            if (d >= 5) dat++;
            else rot++;
        }

        System.out.println("Số SV đạt: " + dat);
        System.out.println("Số SV trượt: " + rot);
    }

    // 6. Sắp xếp tăng dần
    public static void sapXep() {
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (diem[i] > diem[j]) {
                    double temp = diem[i];
                    diem[i] = diem[j];
                    diem[j] = temp;
                }
            }
        }
        System.out.println("Đã sắp xếp!");
    }

    // 7. Thống kê giỏi + xuất sắc
    public static void thongKeGioiXuatSac() {
        int count = 0;

        for (double d : diem) {
            if (d >= 8) count++;
        }

        System.out.println("Số SV giỏi/xuất sắc: " + count);
    }

    // MENU
    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n******** QUẢN LÝ ĐIỂM SV ********");
            System.out.println("1. Nhập danh sách");
            System.out.println("2. In danh sách");
            System.out.println("3. Tính trung bình");
            System.out.println("4. Max & Min");
            System.out.println("5. Đếm đạt/trượt");
            System.out.println("6. Sắp xếp");
            System.out.println("7. Thống kê giỏi/xuất sắc");
            System.out.println("8. Thoát");

            System.out.print("Chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: nhapDanhSach(); break;
                case 2: inDanhSach(); break;
                case 3: tinhTrungBinh(); break;
                case 4: maxMin(); break;
                case 5: demDatRot(); break;
                case 6: sapXep(); break;
                case 7: thongKeGioiXuatSac(); break;
                case 8: System.out.println("Thoát..."); break;
                default: System.out.println("Chọn sai!");
            }

        } while (choice != 8);
    }
}