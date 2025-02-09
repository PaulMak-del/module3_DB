package Books;

import Interfaces.IReadable;

public abstract class Book implements IReadable {
    public Integer listAmount;

    public Book(Integer listAmount) {
        this.listAmount = listAmount;
    }

    public abstract void DisplayInfo();
}
