package com.softwareinstitute.training.murray.ben;

public class Fantasy extends Book {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Fantasy() {
        super("The Two Towers");
    }

    public Fantasy(String itemTitle) {
        super(itemTitle, "Tolkien");
    }

    public Fantasy(String itemTitle, String writerName) {
        super(itemTitle, writerName);
    }




    /////////////////////////////////////////Methods////////////////////////////////////////////



    public void setting() {
        System.out.println("Fantasy");
    }

    public void tellStory() {
        System.out.println("Story in fantasy world.");
    }

}
