import java.util.Scanner;

public class PasswordValidator {

    // Hàm kiểm tra mật khẩu hợp lệ
    public static boolean isValidPassword(String password) {

        String regex =
                "^(?=.*[a-z])" +      // ít nhất 1 chữ thường
                        "(?=.*[A-Z])" +       // ít nhất 1 chữ hoa
                        "(?=.*\\d)" +         // ít nhất 1 số
                        "(?=.*[@#$!%])" +     // ít nhất 1 ký tự đặc biệt
                        ".{8,}$";             // tối thiểu 8 ký tự

        return password.matches(regex);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập mật khẩu: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println("Mật khẩu không hợp lệ");
        }

        sc.close();
    }
}