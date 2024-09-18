package part_one;

import part_one.items.*;
import part_one.registry.LibraryRegistry;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        LibraryRegistry registry = new LibraryRegistry();

        // Книги
        registry.addItem(new Book("001", "Джордж Оруэлл", "1984", "Антиутопия"));
        registry.addItem(new Book("002", "Дж.К. Роулинг", "Гарри Поттер и философский камень", "Фэнтези"));
        registry.addItem(new Book("003", "Дж.Р.Р. Толкиен", "Хоббит", "Фэнтези"));

        // Журналы
        registry.addItem(new Magazine("004", "National Geographic", "Август 2023 года", "Цифровой"));
        registry.addItem(new Magazine("005", "Wired", "Июль 2023 года", "Печатный"));
        registry.addItem(new Magazine("006", "Scientific American", "Июнь 2023 года", "Цифровой"));

        // Письма
        registry.addItem(new Letter("007", "Джейн Остин", "Мистер Дарси"));
        registry.addItem(new Letter("008", "Чарльз Диккенс", "Оливер Твист"));
        registry.addItem(new Letter("009", "Эмили Бронте", "Хитклиф"));

        // Газеты
        registry.addItem(new Newspaper("013", "Таймс", "Ежедневное издание", "Информационно-аналитическая"));
        registry.addItem(new Newspaper("014", "Хранитель", "Еженедельное издание", "Политика"));
        registry.addItem(new Newspaper("015", "Известия", "Ежедневное издание", "Информационно-аналитическая"));

        // Аудиокниги
        registry.addItem(new Audiobook("016", "Джордж Оруэлл", "1984", 600));
        registry.addItem(new Audiobook("017", "Дж.К. Роулинг", "Гарри Поттер и философский камень", 720));
        registry.addItem(new Audiobook("018", "Дж.Р.Р. Толкиен", "Хоббит", 300));

                // Поиск по ID
        String[] idsToSearch = {
                "001",
                "017",
                "021"
        };

        for (String id : idsToSearch) {
            System.out.println("\nПоиск по ID '" + id + "':");
            LibraryItem item = registry.searchById(id);
            if (item != null) {
                System.out.println(item);
            } else {
                System.out.println("По ID '" + id + "' ничего не найдено.");
            }
        }

        // Поиск по названию
        String[] titlesToSearch = {
                "Забвение пахнет корицей",
                "Вечный зов"
        };

        for (String title : titlesToSearch) {
            System.out.println("\nПоиск по названию '" + title + "':");
            List<LibraryItem> results = registry.searchByTitle(title);
            if (!results.isEmpty()) {
                for (LibraryItem item : results) {
                    System.out.println(item);
                }
            } else {
                System.out.println("По названию '" + title + "' ничего не найдено.");
            }
        }

        // Поиск по жанру
        String[] genresToSearch = {
                "Антиутопия",
                "Фэнтези"
        };

        for (String genre : genresToSearch) {
            System.out.println("\nПоиск по жанру '" + genre + "':");
            List<LibraryItem> results = registry.searchByGenre(genre);
            if (!results.isEmpty()) {
                for (LibraryItem item : results) {
                    System.out.println(item);
                }
            } else {
                System.out.println("По жанру '" + genre + "' ничего не найдено.");
            }
        }
    }
}