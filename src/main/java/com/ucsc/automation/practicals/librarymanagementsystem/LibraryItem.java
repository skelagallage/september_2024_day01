package com.ucsc.automation.practicals.librarymanagementsystem;

import java.io.Serializable;

public abstract class LibraryItem implements Serializable {

    private String title;
    private String author;
    private String serialNumber;
    protected boolean isBorrowed;

    public LibraryItem(String title, String author, String serialNumber) {
        this.title = title;
        this.author = author;
        this.serialNumber = serialNumber;
        this.isBorrowed = false;
    }

    public abstract void borrowItem(User user);

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}
