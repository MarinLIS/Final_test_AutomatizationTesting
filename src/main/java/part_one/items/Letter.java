package part_one.items;

public class Letter extends LibraryItem {
    private final String recipient;

    public Letter(String inventoryNumber, String author, String recipient) {
        super(inventoryNumber, author);
        this.recipient = recipient;
    }

    @Override
    public String toString() {
        return "Письмо - " + super.toString() +
               ", Получатель: " + recipient;
    }
}
