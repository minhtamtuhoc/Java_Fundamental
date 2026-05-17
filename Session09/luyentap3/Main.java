package session09.luyentap3;

public class Main {

    public static void main(String[] args) {

        // Tạo object Student
        Student s1 = new Student(
                "S01",
                "Nguyen Van A",
                20,
                3.5
        );

        Student s2 = new Student(
                "S02",
                "Tran Thi B",
                21,
                3.8
        );

        Student s3 = new Student(
                "S03",
                "Le Van C",
                19,
                3.2
        );

        // In thông tin sinh viên
        s1.printInfo();
        s2.printInfo();
        s3.printInfo();

        // In tổng số sinh viên
        System.out.println(
                "Tong so sinh vien: "
                        + Student.getCount()
        );
    }
}
