package com.ucsc.automation.practicals.librarymanagementsystem;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        List<LibraryItem> libraryItems = LibraryIO.loadItemsFromFile("itemList.lms");
        for(LibraryItem item : libraryItems){
            library.addItem(item);
        }

        LibraryItem book1 = new Book("Book1", "Author1", "10001");
        LibraryItem book2 = new Book("Book2", "Author2", "10002");

        LibraryItem magazine1 = new Magazine("Magazine1", "Author1", "M10001");

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magazine1);

        LibraryIO.saveItemToFile(library.getLibraryItems(), "itemList.lms");
    }
}
