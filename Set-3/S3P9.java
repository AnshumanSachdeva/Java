class Book {
    String title, author;
}
class IssuedBook extends Book{
    String issuedDate, returnDate;
    IssuedBook(String t, String a, String i, String r){
        title = t;
        author = a;
        issuedDate = i;
        returnDate = r;
    }
    void displayData(){
        System.out.println("Details of issued book is:");
        System.out.println("title:"+title);
        System.out.println("author:"+author);
        System.out.println("issuedDate:"+issuedDate);
        System.out.println("returnDate:"+returnDate);
    }
}
public class S3P9 {
    public static void main(String[] args) {
        IssuedBook i1 = new IssuedBook("ASDF", "Williomson", "22-1-2026", "25-3-2036");
        i1.displayData();
    }
}
