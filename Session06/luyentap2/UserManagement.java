package session06;

import java.util.Scanner;

public class UserManagement {
    static String name = "";
    static String email = "";
    static String phone = "";
    static String password = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("********* QUẢN LÝ NGƯỜI DÙNG *********");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Nhập họ tên: ");
                    name = sc.nextLine();

                    System.out.print("Nhập email: ");
                    email = sc.nextLine();

                    System.out.print("Nhập số điện thoại: ");
                    phone = sc.nextLine();

                    System.out.print("Nhập mật khẩu: ");
                    password = sc.nextLine();
                    break;

                case 2:
                    name = normalizeName(name);
                    System.out.println("Tên sau chuẩn hóa: " + name);
                    break;

                case 3:
                    if (isValidEmail(email))
                        System.out.println("Email hợp lệ");
                    else
                        System.out.println("Email không hợp lệ");
                    break;

                case 4:
                    if (isValidPhone(phone))
                        System.out.println("SĐT hợp lệ");
                    else
                        System.out.println("SĐT không hợp lệ");
                    break;

                case 5:
                    if (isValidPassword(password))
                        System.out.println("Mật khẩu hợp lệ");
                    else
                        System.out.println("Mật khẩu không hợp lệ");
                    break;

                case 6:
                    System.out.println("Thoát chương trình...");
                    break;

                default:
                    System.out.println("Chọn sai!");
            }

        } while (choice != 6);
    }

    // 🔥 Chuẩn hóa tên (StringBuilder)
    public static String normalizeName(String name) {
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1))
                    .append(" ");
        }

        return sb.toString().trim();
    }

    // 🔥 Validate Email
    public static boolean isValidEmail(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
    }

    // 🔥 Validate Phone
    public static boolean isValidPhone(String phone) {
        return phone.matches("^(03|05|07|08|09)[0-9]{8}$");
    }

    // 🔥 Validate Password
    public static boolean isValidPassword(String password) {
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
    }
}
