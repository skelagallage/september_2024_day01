package com.ucsc.automation.practicals.librarymanagementsystem;

public class Magazine extends LibraryItem{

    public Magazine(String title, String author, String serialNumber) {
        super(title, author, serialNumber);
    }

    @Override
    public void borrowItem(User user) {
        if(!isBorrowed){
            isBorrowed = true;
            System.out.println(user + " borrowed the magazine " + getTitle());
        }
    }
}
