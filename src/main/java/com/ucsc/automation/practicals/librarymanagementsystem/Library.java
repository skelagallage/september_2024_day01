package com.ucsc.automation.practicals.librarymanagementsystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private List<LibraryItem> libraryItems;
    private List<User> userList;
    private Map<String, String> borrowedItem;

    public Library() {
        libraryItems = new ArrayList<>();
        borrowedItem = new HashMap<>();
        userList = new ArrayList<>();
    }

    public void addItem(LibraryItem item){
        libraryItems.add(item);
    }

    public void addUser(User user){
        userList.add(user);
    }

    public List<LibraryItem> getLibraryItems(){
        return libraryItems;
    }

    public List<User> getUsers(){
        return userList;
    }

    public void borrowItem(String serialNumber, User user){
        for(LibraryItem item : libraryItems){
            if(item.getSerialNumber().equals(serialNumber)){
                if(borrowedItem.containsKey(item.getSerialNumber())){
                    System.out.println("Item " + item.getTitle() + "is already borrowed");
                    return;
                }
                borrowedItem.put(item.getSerialNumber(), user.getName());
                item.isBorrowed = true;
                System.out.println("Item " + item.getTitle() + " is successfully borrowed by " + user.getName());
                return;
            }
        }
        System.out.println("Item with serial number " + serialNumber + " is not valid.");
    }

    public void returnBorrowedItem(String serialNumber, User user){
        for(LibraryItem item : libraryItems){
            if(item.getSerialNumber().equals(serialNumber)){
                borrowedItem.remove(item.getSerialNumber());
                return;
            }
        }
        System.out.println("Item with serial number " + serialNumber + " is not valid.");
    }

    public Map<String, String> getBorrowedItems(){
        return borrowedItem;
    }
}
