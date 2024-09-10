package part_one.items;

import part_one.interfaces.Format;

public class Microfilm extends LibraryItem implements Format {
    private final String format;

    public Microfilm(String inventoryNumber, String author, String format) {
        super(inventoryNumber, author);
        this.format = format;
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Микрофильм - " + super.toString() +
               ", Характер: " + format;
    }
}
