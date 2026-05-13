package session08;

// Student.java
import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double gpa;

    // static đếm số lượng sinh viên
    private static int countStudent = 0;

    // hằng số
    public final double SCORE_FACTOR = 0.25;

    // Constructor không tham số
    public Student() {
        countStudent++;
    }

    // Constructor có tham số
    public Student(int id, String name, double gpa) {
        this(); // gọi constructor không tham số
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // nhập thông tin
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập ID: ");
        id = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập tên: ");
        name = sc.nextLine();

        System.out.print("Nhập GPA: ");
        gpa = Double.parseDouble(sc.nextLine());
    }

    // in thông tin
    public void print() {
        System.out.println("ID: " + id);
        System.out.println("Tên: " + name);
        System.out.println("GPA: " + gpa);
        System.out.println("SCORE_FACTOR: " + SCORE_FACTOR);
        System.out.println("----------------------");
    }

    // getter GPA
    public double getGpa() {
        return gpa;
    }

    // static method
    public static int getTotalStudent() {
        return countStudent;
    }
}
