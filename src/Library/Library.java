package Library;

import Books.Book;

import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books = new ArrayList<Book>();

    public void Add(Book book) {
        this.books.add(book);
    }

    public void Remove(Book book) {
        this.books.remove(book);
    }

    public void ShowAllBooks() {
        for (Book book : this.books) {
            book.DisplayInfo();
        }
    }
}
