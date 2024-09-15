package com.ucsc.automation.practicals.librarymanagementsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LibraryIO {

    public void saveItemToFile(List<LibraryItem> libraryItemList, String fileName){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(libraryItemList);
            System.out.println("libraryItemList saved to the file successfully.");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public List<LibraryItem> loadItemsFromFile(String fileName){
        File file = new File(fileName);
        if(!file.exists()){
            return new ArrayList<>();
        }

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            return (List<LibraryItem>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
