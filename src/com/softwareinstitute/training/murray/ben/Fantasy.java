package com.softwareinstitute.training.murray.ben;

public class Fantasy extends Book implements TellsFictionalStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Fantasy() {
        this("Fantasy_Book_Title");
    }

    public Fantasy(String itemTitle) {
        this(itemTitle, "John Doe");
    }

    public Fantasy(String itemTitle, String writerName) {
        this(itemTitle, writerName, "Paperback");
    }

    public Fantasy(String itemTitle, String writerName, String coverType) {
        super(itemTitle, writerName, coverType, 400);
    }

    public Fantasy(String itemTitle, String writerName, String coverType, int pages) {
        super(itemTitle, writerName, coverType, pages);
    }




    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Setting is goblins and stuff.");
    }

    public void tellStory() {
        System.out.println("Tells story with magic.");
    }

    @Override
    public void beginning() {

    }

    @Override
    public void middle() {

    }

    @Override
    public void end() {

    }

}
