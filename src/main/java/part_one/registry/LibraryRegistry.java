package part_one.registry;

import part_one.interfaces.Format;
import part_one.interfaces.Genre;
import part_one.items.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LibraryRegistry {
    private final List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> searchByInventoryNumber(String inventoryNumber) {
        return items.stream()
                .filter(item -> item.getId().equals(inventoryNumber))
                .collect(Collectors.toList());
    }

    public List<LibraryItem> searchByAuthor(String author) {
        return items.stream()
                .filter(item -> item.getAuthor().equalsIgnoreCase(author))
                .collect(Collectors.toList());
    }

    public List<LibraryItem> searchByGenre(String genre) {
        return items.stream()
                .filter(item -> item instanceof Genre && ((Genre) item).getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public List<LibraryItem> searchByFormat(String format) {
        return items.stream()
                .filter(item -> item instanceof Format && ((Format) item).getFormat().equalsIgnoreCase(format))
                .collect(Collectors.toList());
    }

    public List<LibraryItem> searchByTitle(String title) {
        return items.stream()
                .filter(item -> {
                    if (item instanceof Book) {
                        return ((Book) item).getTitle().equalsIgnoreCase(title);
                    } else if (item instanceof Magazine) {
                        return ((Magazine) item).getTitle().equalsIgnoreCase(title);
                    } else if (item instanceof Audiobook) {
                        return ((Audiobook) item).getTitle().equalsIgnoreCase(title);
                    } else if (item instanceof VideoHomeSystem) {
                        return ((VideoHomeSystem) item).getTitle().equalsIgnoreCase(title);
                    }
                    return false;
                })
                .collect(Collectors.toList());
    }

    public LibraryItem searchById(String id) {
        return items.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
