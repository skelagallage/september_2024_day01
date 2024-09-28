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
                if(borrowedItem.containsKey(item)){
                    System.out.println("Item " + item.getTitle() + "is already borrowed");
                    break;
                }
                borrowedItem.put(item, user);
                item.isBorrowed = true;
                System.out.println("Item " + item.getTitle() + " is successfully borrowed by " + user.getName());
                break;
            }
        }
    }

    public void saveBorrowedItems(){
        LibraryIO.saveBorrowedItemsToFile(borrowedItem, "borrowedItems.txt");
    }
}
