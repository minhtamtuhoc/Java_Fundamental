import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentNameManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> studentList = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n******** MENU ********");
            System.out.println("1. Thêm tên sinh viên");
            System.out.println("2. Hiển thị danh sách");
            System.out.println("3. Tìm tên sinh viên chứa từ khóa");
            System.out.println("4. Đếm số sinh viên có tên bắt đầu bằng chữ cái");
            System.out.println("5. Sắp xếp danh sách tên theo thứ tự A-Z");
            System.out.println("6. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Nhập tên sinh viên: ");
                    String name = sc.nextLine();

                    studentList.add(name);

                    System.out.println("Thêm thành công!");

                    break;

                case 2:

                    if (studentList.isEmpty()) {

                        System.out.println("Danh sách rỗng!");

                    } else {

                        System.out.println("Danh sách sinh viên:");

                        for (String student : studentList) {
                            System.out.println(student);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Nhập từ khóa cần tìm: ");
                    String keyword = sc.nextLine();

                    boolean found = false;

                    System.out.println("Kết quả tìm kiếm:");

                    for (String student : studentList) {

                        if (student.toLowerCase()
                                .contains(keyword.toLowerCase())) {

                            System.out.println(student);

                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Không tìm thấy!");
                    }

                    break;

                case 4:

                    System.out.print("Nhập chữ cái bắt đầu: ");
                    char firstChar =
                            Character.toLowerCase(sc.nextLine().charAt(0));

                    int count = 0;

                    for (String student : studentList) {

                        if (Character.toLowerCase(student.charAt(0))
                                == firstChar) {

                            count++;
                        }
                    }

                    System.out.println(
                            "Số sinh viên bắt đầu bằng '"
                                    + firstChar + "' là: " + count);

                    break;

                case 5:

                    Collections.sort(studentList);

                    System.out.println("Danh sách sau khi sắp xếp:");

                    for (String student : studentList) {
                        System.out.println(student);
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