package session09.luyentap2;

public class Book {

    // Thuộc tính private
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Phương thức in thông tin
    public void printInfo() {

        System.out.println("Title : " + title);
        System.out.println("Author: " + author);
        System.out.println("Price : " + price);
        System.out.println("----------------------");
    }
}
