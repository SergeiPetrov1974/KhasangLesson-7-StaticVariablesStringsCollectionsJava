package io.khasang_7_3;

public class Menu {

    public static void start() {
        Library library = new Library();
        Reader reader = new Reader();

        int chooseAction;
        System.out.println("Сейчас в каталоге книг - " + library.getCountBook());
        for (int i = 0; i < 10; i++) {
            System.out.println("Что будем делать: 0-Добавить книгу; 1-Найти книгу; 2-Удалить книгу");
            chooseAction = selectAction(reader);
            if (chooseAction == 1) {
                searchBook(reader, library);
            }
            if (chooseAction == 0) {
                addLibraryBook(reader, library);
                System.out.println("В каталоге книг - " + library.getCountBook());
            }
            if (chooseAction == 2) {
                if (library.getCountBook() > 0) {
                    removeLibraryBook(reader, library);
                    System.out.println("В каталоге осталось книг - " + library.getCountBook());
                } else {
                    System.out.println("В каталоге пусто. Нет книг для удаления");
                }
            }
        }
    }

    static int selectAction(Reader reader) {
        int action;
        do {
            action = reader.getAnswer();
            if (action != 0 & action != 1 & action != 2) {
                System.out.println("Укажите что нужно сделать: 0-Добавить книгу; 1-Найти книгу; 2-Удалить книгу");
            }
        } while (action != 0 & action != 1 & action != 2);
        return action;
    }

    static void searchBook(Reader reader, Library catalog) {
        System.out.println("Что ищем?");
        String str = reader.getString();
        int rez = catalog.searchBookByName(str);
        if (rez == 0) {
            System.out.println("Книга \"" + str + "\" не найдена");
        }
    }

    static void addLibraryBook(Reader reader, Library library) {
        String name = null;
        String author = null;
        int publicationYear = 0;
        System.out.println("Укажите название книги");
        name = reader.getString();
        System.out.println("Укажите автора книги");
        author = reader.getString();
        System.out.println("Укажите год публикации");
        publicationYear = Integer.parseInt(reader.getString());
        library.addBook(new Book(name, author, publicationYear));
        System.out.println("Книга добавлена в каталог");
    }

    static void removeLibraryBook(Reader reader, Library catalog) {
        int numBook;
        System.out.println("В каталоге книг - " + catalog.getCountBook());
        System.out.println("Укажите номер удаляемой книги");
        do {
            numBook = reader.getAnswer();
        } while (numBook < 1 || numBook > catalog.getCountBook());
        --numBook;
        System.out.println("Вы уверены что хотите удалить книну: " + catalog.getBookInfoById(numBook) + "?");
        System.out.println("0-нет; 1-да");
        int ans;
        do {
            ans = reader.getAnswer();
        } while (ans != 0 & ans != 1);
        if (ans == 1) {
            catalog.removeBook(numBook);
        }
    }
}

