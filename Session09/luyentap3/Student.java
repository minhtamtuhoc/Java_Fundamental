package session09.luyentap3;

public class Student {

    // Thuộc tính private
    private String id;
    private String fullName;
    private int age;
    private double gpa;

    // Static variable
    private static int count = 0;

    // Final constants
    public static final double MIN_GPA = 0.0;
    public static final double MAX_GPA = 4.0;

    // Constructor
    public Student(String id, String fullName,
                   int age, double gpa) {

        this.id = id;
        this.fullName = fullName;
        this.age = age;

        // Kiểm tra GPA hợp lệ
        if (gpa >= MIN_GPA && gpa <= MAX_GPA) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
        }

        // Tăng số lượng object
        count++;
    }

    // Method in thông tin
    public void printInfo() {

        System.out.println("ID       : " + id);
        System.out.println("Full Name: " + fullName);
        System.out.println("Age      : " + age);
        System.out.println("GPA      : " + gpa);
        System.out.println("------------------------");
    }

    // Static getter cho count
    public static int getCount() {
        return count;
    }
}
