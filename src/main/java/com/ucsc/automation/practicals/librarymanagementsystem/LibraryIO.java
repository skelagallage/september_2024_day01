package com.ucsc.automation.practicals.librarymanagementsystem;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibraryIO {

    public static void saveItemToFile(List<LibraryItem> libraryItemList, String fileName){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))){
            oos.writeObject(libraryItemList);
            System.out.println("libraryItemList saved to the file successfully.");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static List<LibraryItem> loadItemsFromFile(String fileName){
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

    public static void saveBorrowedItemsToFile(
            Map<LibraryItem, User> borrowedItems,String fileName){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))){
            for(Map.Entry<LibraryItem, User> entry : borrowedItems.entrySet()){
                LibraryItem key = entry.getKey();
                User value = entry.getValue();
                bw.write("serialNumber:::"+key.getSerialNumber()+"###user"
                        +value.getName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
