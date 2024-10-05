package com.ucsc.automation.lmstest;

import com.ucsc.automation.practicals.librarymanagementsystem.Library;
import com.ucsc.automation.practicals.librarymanagementsystem.LibraryIO;
import com.ucsc.automation.practicals.librarymanagementsystem.LibraryItem;
import com.ucsc.automation.practicals.librarymanagementsystem.User;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

public class LibraryTest {
    Library library = new Library();

    @BeforeClass
    public void setUp(){
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
    }

    @Test
    public void testVerifyThatUserAddToTheSystemSuccessfully(){
        User user = new User("TestUser001");
        library.addUser(user);

        Assert.assertTrue(library.getUsers().contains(user));
    }
}
