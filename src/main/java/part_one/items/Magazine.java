package part_one.items;

import part_one.interfaces.Format;

public class Magazine extends LibraryItem implements Format {
    private final String title;
    private final String format;

    public Magazine(String inventoryNumber, String author, String title, String format) {
        super(inventoryNumber, author);
        this.title = title;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public String toString() {
        return "Журнал - " + super.toString() +
               ", Название: " + title +
               ", Характер: " + format;
    }
}
