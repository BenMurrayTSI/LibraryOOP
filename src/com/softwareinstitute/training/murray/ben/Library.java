package com.softwareinstitute.training.murray.ben;

import com.softwareinstitute.training.murray.ben.LibraryItem;
import java.util.ArrayList;

public class Library {

    /////////////////////////////////////////Attributes////////////////////////////////////////////

    private ArrayList<LibraryItem> items;

    /////////////////////////////////////////Constructors////////////////////////////////////////////

    public Library(ArrayList<LibraryItem> items) {
        this.items = new ArrayList<>(items);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public ArrayList<LibraryItem> getItems() {
        return items;
    }

}
