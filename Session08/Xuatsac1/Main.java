package session08;

// Main.java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        int choice;

        do {
            System.out.println("\n===== MENU SINH VIÊN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. In danh sách sinh viên");
            System.out.println("3. Tìm sinh viên GPA cao nhất");
            System.out.println("4. In tổng số sinh viên đã tạo");
            System.out.println("0. Thoát");

            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    int n = Integer.parseInt(sc.nextLine());

                    for (int i = 0; i < n; i++) {
                        System.out.println("\nNhập sinh viên thứ " + (i + 1));

                        Student st = new Student();
                        st.input();

                        list.add(st);
                    }
                    break;

                case 2:
                    if (list.isEmpty()) {
                        System.out.println("Danh sách rỗng!");
                    } else {
                        System.out.println("\nDANH SÁCH SINH VIÊN");
                        for (Student st : list) {
                            st.print();
                        }
                    }
                    break;

                case 3:
                    if (list.isEmpty()) {
                        System.out.println("Danh sách rỗng!");
                    } else {
                        Student max = list.get(0);

                        for (Student st : list) {
                            if (st.getGpa() > max.getGpa()) {
                                max = st;
                            }
                        }

                        System.out.println("\nSINH VIÊN GPA CAO NHẤT");
                        max.print();
                    }
                    break;

                case 4:
                    System.out.println("Tổng số sinh viên đã tạo: "
                            + Student.getTotalStudent());
                    break;

                case 0:
                    System.out.println("Thoát chương trình!");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);
    }
}
