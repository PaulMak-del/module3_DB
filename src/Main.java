import Books.DigitalBook;
import Books.HandBindingBook;
import Books.Magazine;
import FileService.FileService;

public class Main {
    public static void main(String[] args) {
        // Создание книг
        DigitalBook digitalBook = new DigitalBook(150, "http://example.com", "John Doe");
        HandBindingBook handBindingBook = new HandBindingBook(300, "Jane Smith");
        Magazine magazine = new Magazine(50, "Times");

        FileService service = new FileService();

        service.SaveBookToFile(digitalBook);
        service.SaveBookToFile(handBindingBook);
        service.SaveBookToFile(magazine);

        System.out.println(service.GetBooksFromFile());
    }
}
