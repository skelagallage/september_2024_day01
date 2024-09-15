package com.ucsc.automation.practicals.librarymanagementsystem;

public class Book extends LibraryItem{

    public Book(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowItem(User user) {
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println(user + " borrowed the book " + getTitle());
        }
    }
}
