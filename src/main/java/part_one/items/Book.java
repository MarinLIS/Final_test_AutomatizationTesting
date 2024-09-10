package part_one.items;

import part_one.interfaces.Genre;

public class Book extends LibraryItem implements Genre {
    private final String title;
    private final String genre;

    public Book(String inventoryNumber, String author, String title, String genre) {
        super(inventoryNumber, author);
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Книга - " + super.toString() +
               ", Название: " + title +
               ", Жанр: " + genre;
    }
}
