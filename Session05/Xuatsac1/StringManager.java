import java.util.Scanner;

public class StringManager {

    // Hàm đếm ký tự
    public static void countCharacters(String str) {

        int lower = 0;
        int upper = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                lower++;
            } else if (Character.isUpperCase(ch)) {
                upper++;
            } else if (Character.isDigit(ch)) {
                digit++;
            } else {
                special++;
            }
        }

        System.out.println("Số chữ thường: " + lower);
        System.out.println("Số chữ hoa: " + upper);
        System.out.println("Số chữ số: " + digit);
        System.out.println("Số ký tự đặc biệt: " + special);
    }

    // Hàm đảo ngược chuỗi
    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);

        return sb.reverse().toString();
    }

    // Hàm kiểm tra palindrome
    public static boolean isPalindrome(String str) {

        String reversed = reverseString(str);

        return str.equalsIgnoreCase(reversed);
    }

    // Hàm chuẩn hóa chuỗi
    public static String normalizeString(String str) {

        // Xóa khoảng trắng dư thừa
        str = str.trim().replaceAll("\\s+", " ");

        // Viết hoa ký tự đầu
        if (str.length() > 0) {
            str = Character.toUpperCase(str.charAt(0))
                    + str.substring(1);
        }

        return str;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "";
        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Nhập chuỗi");
            System.out.println("2. Đếm số ký tự thường, hoa, số, đặc biệt");
            System.out.println("3. Đảo ngược chuỗi");
            System.out.println("4. Kiểm tra Palindrome");
            System.out.println("5. Chuẩn hóa chuỗi");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Nhập chuỗi: ");
                    str = sc.nextLine();

                    break;

                case 2:

                    countCharacters(str);

                    break;

                case 3:

                    System.out.println("Chuỗi đảo ngược: "
                            + reverseString(str));

                    break;

                case 4:

                    if (isPalindrome(str)) {
                        System.out.println("Chuỗi là Palindrome");
                    } else {
                        System.out.println("Chuỗi không phải Palindrome");
                    }

                    break;

                case 5:

                    str = normalizeString(str);

                    System.out.println("Chuỗi sau chuẩn hóa: " + str);

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