package part_one.items;

import part_one.interfaces.Format;

public class VideoHomeSystem extends LibraryItem implements Format {
    private final String title;
    private final String format;
    private final int durationInMinutes;

    public VideoHomeSystem(String inventoryNumber, String author, String title, String format, int durationInMinutes) {
        super(inventoryNumber, author);
        this.title = title;
        this.format = format;
        this.durationInMinutes = durationInMinutes;
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
        return "Видеокассета - " + super.toString()
               + ", Название: " + title +
               ", Характер: " + format +
               ", Продолжительность: " + durationInMinutes + " минут";
    }
}
