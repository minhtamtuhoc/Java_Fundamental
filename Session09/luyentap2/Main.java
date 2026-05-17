package session09.luyentap2;

public class Main {

    public static void main(String[] args) {

        // Tạo các object Book
        Book b1 = new Book(
                "Clean Code",
                "Robert C. Martin",
                15.5
        );

        Book b2 = new Book(
                "Java Programming",
                "James Gosling",
                20.0
        );

        Book b3 = new Book(
                "Design Patterns",
                "GoF",
                30.0
        );

        // Tạo danh sách sách
        Book[] books = {b1, b2, b3};

        // In danh sách sách
        System.out.println("Danh sach sach:\n");

        for (Book b : books) {
            b.printInfo();
        }
    }
}
