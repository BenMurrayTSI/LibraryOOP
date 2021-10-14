package com.softwareinstitute.training.murray.ben;

import com.softwareinstitute.training.murray.ben.LibraryItem;
import java.util.ArrayList;

public class Library {

    public Library(ArrayList<LibraryItem> items) {
        this.items = new ArrayList<>(items);
    }

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

    private ArrayList<LibraryItem> items;

    
}
