package com.ucsc.automation.practicals.librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private List<LibraryItem> libraryItems;
    private Map<LibraryItem, User> borrowedItem;

    public Library() {
        libraryItems = new ArrayList<>();
        borrowedItem = new HashMap<>();
    }

    public void addItem(LibraryItem item){
        libraryItems.add(item);
    }

    public List<LibraryItem> getLibraryItems(){
        return libraryItems;
    }

    public void borrowItem(String serialNumber, User user){
        for(LibraryItem item : libraryItems){
            if(item.getSerialNumber().equals(serialNumber)){
                if(!item.isBorrowed){
                    System.out.println(user.getName() + " is going to borrow " + item.getTitle());
                    item.borrowItem(user);
                    borrowedItem.put(item, user);
                    System.out.println(user.getName() + " borrowed " + item.getTitle());
                }else {
                    System.out.println("The item " + item.getSerialNumber() + "is already borrowed.");
                }
                break;
            }
        }
    }
}
