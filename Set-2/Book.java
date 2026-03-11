public class Book {
    private String title;
    private int price;

    Book() {
        title = "Unknown";
        price = 0;
    }

    Book(String n, int r) {
        title = n;
        price = r;
    }
    void display(){
        System.out.println("title = " + title + " , price = " + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
        Book b2 = new Book("ABC", 999);
        b2.display();
    }
}
