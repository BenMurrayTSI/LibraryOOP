package com.softwareinstitute.training.murray.ben;

public class Fantasy extends Book {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Fantasy() {
        this("The Two Towers");
    }

    public Fantasy(String itemTitle) {
        this(itemTitle, "Tolkien");
    }

    public Fantasy(String itemTitle, String writerName) {
        this(itemTitle, writerName, "Paperback");
    }

    public Fantasy(String itemTitle, String writerName, String coverType) {
        super(itemTitle, writerName, coverType, 352);
    }

    public Fantasy(String itemTitle, String writerName, String coverType, int pages) {
        super(itemTitle, writerName, coverType, pages);
    }




    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Goblins and stuff.");
    }

    public void tellStory() {
        System.out.println("Story in fantasy world with magic.");
    }



}
