package Books;

public class HandBindingBook extends Book {
    public String author;

    public HandBindingBook(Integer listAmount, String author) {
        super(listAmount);
        this.author = author;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("This is Hand Binging Book");
    }

    @Override
    public void Read() {
        System.out.println("Read Hand Binding Book by " + author);
    }
}
