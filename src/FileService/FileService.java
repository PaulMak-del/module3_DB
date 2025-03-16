package FileService;

import Books.Book;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileService {
    private static final String FILE_PATH = "booksStorage.txt";

    public void SaveBookToFile(Book book) {
        try(FileOutputStream fOut = new FileOutputStream(FILE_PATH, true)) {
            fOut.write(book.toString().getBytes());
        } catch (IOException e) {
            System.out.println("Error while writing " + FILE_PATH);
        }
    }


    public String GetBooksFromFile() {
        try(FileInputStream fIn = new FileInputStream(FILE_PATH)) {
            return new String(fIn.readAllBytes());
        } catch (IOException e) {
            System.out.println("Error while reading " + FILE_PATH);
            return "";
        }
    }
}