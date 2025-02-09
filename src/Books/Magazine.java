package Books;

public class Magazine extends Book {
    public String publisher;

    public Magazine(Integer listAmount, String publisher) {
        super(listAmount);
        this.publisher = publisher;
    }

    @Override
    public void DisplayInfo() {
        System.out.println("This is Magazine");
    }

    @Override
    public void Read() {
        System.out.println("Read " + publisher + " Magazine");
    }
}
