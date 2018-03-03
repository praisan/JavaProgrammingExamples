package bookstore;

public class Book {

    private String title;
    private double initialPrice, salePrice;
    private static int count;

    public Book(String title, double price) {
        this.title = title;
        this.initialPrice = price;
        this.salePrice = price;
        count++;
    }

    public String toString() {
        return "Book title: " + title + " initial price=" + initialPrice + " sale price=" + salePrice;
    }
}
