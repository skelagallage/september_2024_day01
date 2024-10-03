package com.ucsc.automation.practicals.librarymanagementsystem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        Library library = new Library();

        List<LibraryItem> libraryItems = LibraryIO.loadItemsFromFile("itemList.lms");
        for(LibraryItem item : libraryItems){
            library.addItem(item);
        }

        List<User> users = LibraryIO.loadUserListFromFile("userList.lms");
        for(User user : users){
            library.addUser(user);
        }

        Map<String, String> borrowedItems = LibraryIO.loadBorrowedItemsToFile("borrowedItem.lms");
        for(Map.Entry<String, String> map : borrowedItems.entrySet()){
            library.getBorrowedItems().put(map.getKey(), map.getValue());
        }

        System.out.println("Here... Find the list of all library items");
        library.getLibraryItems().forEach(item -> System.out.println(item.getTitle() + "\t" + item.getAuthor() + "\t" + item.getSerialNumber()));
        System.out.println("---------------------------------------------------------------");

        System.out.println("Here... Find the users of the library");
        library.getUsers().forEach(user -> System.out.println(user.getName()));
        System.out.println("---------------------------------------------------------------");

        System.out.println("Here... Find the borrowed items of the library");
        library.getBorrowedItems().forEach((item, user) -> System.out.println(item + " : " + user));
        System.out.println("----------------------------------------------------------------");

        //////////////////////////////////////
        boolean exit = false;
        while (!exit){
            System.out.println("Enter the main option");
            System.out.println("1. Need to create new Item");
            System.out.println("2. Need to create new User");
            System.out.println("3. User need to borrow item");
            System.out.println("4. User need to return item");
            System.out.println("5. Exit");

            BufferedReader mainOption = new BufferedReader(new InputStreamReader(System.in));
            int mainOptionStr;
            try {
                mainOptionStr = Integer.parseInt(mainOption.readLine());
            }catch (NumberFormatException nfex){
                System.out.println(nfex.getMessage());
                continue;
            }


            if(mainOptionStr == 1){
                System.out.println("Which item do you need to create?");
                System.out.println("1. A book");
                System.out.println("2. A Magazine");
                BufferedReader createdItemType = new BufferedReader(new InputStreamReader(System.in));
                int createdItemTypeStr = Integer.parseInt(createdItemType.readLine());
                if(createdItemTypeStr == 1){
                    System.out.println("Please provide the book name");
                    String bookNameStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    System.out.println("Please provide the book author");
                    String bookAuthorStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    System.out.println("Please provide the book serial number");
                    String bookSerialNumberStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    for(LibraryItem li : library.getLibraryItems()){
                        if(Objects.equals(li.getSerialNumber(), bookSerialNumberStr)){
                            System.out.println("This serial number is already entered!");
                            continue;
                        }
                    }
                    LibraryItem createdBook = new Book(bookNameStr, bookAuthorStr, bookSerialNumberStr);
                    library.addItem(createdBook);
                } else if (createdItemTypeStr == 2) {
                    System.out.println("Please provide the magazine name");
                    String magazineNameStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    System.out.println("Please provide the book author");
                    String magazineAuthorStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    System.out.println("Please provide the book serial number");
                    String magazineSerialNumberStr = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    for(LibraryItem li : library.getLibraryItems()){
                        if(Objects.equals(li.getSerialNumber(), magazineSerialNumberStr)){
                            System.out.println("This serial number is already entered!");
                            continue;
                        }
                    }
                    LibraryItem createdMagazine = new Magazine(magazineNameStr, magazineAuthorStr, magazineSerialNumberStr);
                    library.addItem(createdMagazine);
                }
            }else if(mainOptionStr == 2){
                System.out.println("What is the name of the user?");
                String username = new BufferedReader(new InputStreamReader(System.in)).readLine();
                User user = new User(username);
                library.addUser(user);
            } else if (mainOptionStr == 3) {
                System.out.println("Which user is going to buy the item?");
                IntStream.range(0, library.getUsers().size()).forEach(index -> System.out.println(index + ". " + library.getUsers().get(index).getName()));
                int usernameIndex = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                System.out.println("What is the serial number of the item?");
                String serialNumber = new BufferedReader(new InputStreamReader(System.in)).readLine();
                library.borrowItem(serialNumber, library.getUsers().get(usernameIndex));
            }else if (mainOptionStr == 4) {
                System.out.println("Which user is going to return the item?");
                IntStream.range(0, library.getUsers().size()).forEach(index -> System.out.println(index + ". " + library.getUsers().get(index).getName()));
                int usernameIndex = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                System.out.println("What is the serial number of the item?");
                String serialNumber = new BufferedReader(new InputStreamReader(System.in)).readLine();
                library.returnBorrowedItem(serialNumber, library.getUsers().get(usernameIndex));
            }else if(mainOptionStr == 5){
                exit = true;
            }else{
                System.out.println("You selected wrong option");
            }
        }



        //////////////////

//        LibraryItem book1 = new Book("Book1", "Author1", "10001");
//        LibraryItem book2 = new Book("Book2", "Author2", "10002");
//
//        LibraryItem magazine1 = new Magazine("Magazine1", "Author1", "M10001");
//
//        library.addItem(book1);
//        library.addItem(book2);
//        library.addItem(magazine1);
//
        LibraryIO.saveUserListToFile(library.getUsers(), "userList.lms");
        LibraryIO.saveItemToFile(library.getLibraryItems(), "itemList.lms");
        LibraryIO.saveBorrowedItemsToFile(library.getBorrowedItems(), "borrowedItem.lms");
    }
}
