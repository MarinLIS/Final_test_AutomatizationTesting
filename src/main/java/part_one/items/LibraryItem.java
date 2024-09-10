package part_one.items;

import part_one.interfaces.Searchable;

public abstract class LibraryItem implements Searchable {
    private final String id;
    private final String author;

    public LibraryItem(String inventoryNumber, String author) {
        this.id = inventoryNumber;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String getSearchKey() {
        return id;
    }

    @Override
    public String toString() {
        return "ID: " + id +
               ", Автор: " + author;
    }
}
