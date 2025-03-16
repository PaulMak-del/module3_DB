package Books;

public class DigitalBook extends Book {
    public String url;
    public String author;

    public DigitalBook(Integer listAmount, String url) {
        super(listAmount);
        this.url = url;
    }

    public DigitalBook(Integer listAmount, String url, String author) {
        super(listAmount);
        this.url = url;
        this.author = author;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("This is Digital Book");
    }

    public void Download() {
        System.out.print("Downloading");
        System.out.print(".");
        System.out.print(".");
        System.out.println(".");
        System.out.print("Complete!");
    }

    @Override
    public String toString() {
        return "DigitalBook | url: " + url + "; author: " + author + "; listAmount: " + listAmount + '\n';
    }

    @Override
    public void Read() {
        System.out.println("Read book from " + url);
    }
}
