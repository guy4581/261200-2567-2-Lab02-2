import java.awt.desktop.SystemEventListener;

public class Book {
    String title;
    String author;
    Double price;

    public Book() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
    }
    public Book(String title, String author, Double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        // TODO: Complete the rest of this constructor.
    }
    public void displayDetails() {
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price : " + price);
        // TODO: Complete the rest of this method.
    }
    public void updatePrice(double newPrice) {
        if (newPrice < 0) {
            throw new IllegalArgumentException("Price cannot be negative: " + newPrice);
        }
        price = newPrice;
    }
    public void applyDiscount(Double discount){

        if(discount > 0 && discount < 100){

            this.price = price - ((price*discount)/100);
            System.out.println("The discount percentage applied");

        }else{

            System.out.println("Error input is invalid");
        }
    }
}



