import Books.Book;
import Books.DigitalBook;
import Books.HandBindingBook;
import Books.Magazine;
import Library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book b1 = new DigitalBook(10, "google.com");
        Book b2 = new HandBindingBook(20, "Paul");
        Book b3 = new Magazine(5, "NewYorkeTimes");

        library.Add(b1);
        library.Add(b2);
        library.Add(b3);

        library.ShowAllBooks();
    }
}
