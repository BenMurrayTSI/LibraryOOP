package com.softwareinstitute.training.murray.ben;

public abstract class Book extends LibraryItem {

    /////////////////////////////////////////Attributes////////////////////////////////////////////

    private int pages;
    private String coverType ;

    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Book(String itemTitle) {
        super(itemTitle);
    }

    public Book(String itemTitle, String writerName) {
        super(itemTitle, writerName);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void storyMedium() {
        System.out.println("You read it.");
    }





}
