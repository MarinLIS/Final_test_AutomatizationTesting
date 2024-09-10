package part_one.items;

import part_one.interfaces.Genre;

public class Newspaper extends LibraryItem implements Genre {
    private final String title;
    private final String genre;

    public Newspaper(String inventoryNumber, String author, String title, String genre) {
        super(inventoryNumber, author);
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "Газета - " + super.toString() +
               ", Название: " + title +
               ", Жанр: " + genre;
    }
}
