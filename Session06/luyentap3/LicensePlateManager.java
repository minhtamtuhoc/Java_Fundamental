package session06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LicensePlateManager {

    // Hàm kiểm tra biển số hợp lệ
    public static boolean isValidPlate(String plate) {

        // Ví dụ hợp lệ: 30F-123.45
        String regex = "^[0-9]{2}[A-Z]-[0-9]{3}\\.[0-9]{2}$";

        return plate.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> plateList = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n************* QUẢN LÝ BIỂN SỐ XE *************");
            System.out.println("1. Thêm các biển số xe");
            System.out.println("2. Hiển thị danh sách biển số xe");
            System.out.println("3. Tìm kiếm biển số xe");
            System.out.println("4. Tìm biển số xe theo mã tỉnh");
            System.out.println("5. Sắp xếp biển số xe tăng dần");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Nhập số lượng biển số cần thêm: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < n; i++) {

                        String plate;

                        do {

                            System.out.print("Nhập biển số thứ "
                                    + (i + 1) + ": ");

                            plate = sc.nextLine().toUpperCase();

                            if (!isValidPlate(plate)) {

                                System.out.println("Biển số không hợp lệ!");
                            }

                        } while (!isValidPlate(plate));

                        plateList.add(plate);
                    }

                    System.out.println("Thêm thành công!");

                    break;

                case 2:

                    if (plateList.isEmpty()) {

                        System.out.println("Danh sách trống!");

                    } else {

                        System.out.println("Danh sách biển số xe:");

                        for (String plate : plateList) {

                            System.out.println(plate);
                        }
                    }

                    break;

                case 3:

                    if (plateList.isEmpty()) {

                        System.out.println("Danh sách trống!");

                    } else {

                        System.out.print("Nhập biển số cần tìm: ");
                        String searchPlate =
                                sc.nextLine().toUpperCase();

                        boolean found = false;

                        for (String plate : plateList) {

                            if (plate.equals(searchPlate)) {

                                System.out.println("Tìm thấy: " + plate);

                                found = true;

                                break;
                            }
                        }

                        if (!found) {

                            System.out.println("Không tìm thấy!");
                        }
                    }

                    break;

                case 4:

                    if (plateList.isEmpty()) {

                        System.out.println("Danh sách trống!");

                    } else {

                        System.out.print("Nhập mã tỉnh: ");
                        String provinceCode = sc.nextLine();

                        boolean foundProvince = false;

                        System.out.println("Biển số thuộc mã tỉnh "
                                + provinceCode + ":");

                        for (String plate : plateList) {

                            // Lấy 2 ký tự đầu
                            if (plate.startsWith(provinceCode)) {

                                System.out.println(plate);

                                foundProvince = true;
                            }
                        }

                        if (!foundProvince) {

                            System.out.println("Không có biển số nào!");
                        }
                    }

                    break;

                case 5:

                    if (plateList.isEmpty()) {

                        System.out.println("Danh sách trống!");

                    } else {

                        Collections.sort(plateList);

                        System.out.println("Danh sách sau sắp xếp:");

                        for (String plate : plateList) {

                            System.out.println(plate);
                        }
                    }

                    break;

                case 6:

                    System.out.println("Thoát chương trình...");

                    break;

                default:

                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 6);

        sc.close();
    }
}
