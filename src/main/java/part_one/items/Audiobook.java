package part_one.items;

public class Audiobook extends LibraryItem {
    private final String title;
    private final int durationInMinutes;

    public Audiobook(String inventoryNumber, String author, String title, int durationInMinutes) {
        super(inventoryNumber, author);
        this.title = title;
        this.durationInMinutes = durationInMinutes;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Аудиокнига - " + super.toString() +
               ", Название: " + title +
               ", Продолжительность: " + durationInMinutes + " минут";
    }
}
