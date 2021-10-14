package com.softwareinstitute.training.murray.ben;

public class Documentary extends DVD implements NonFiction {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Documentary() {
        this("Amy");
    }

    public Documentary(String itemTitle) {
        this(itemTitle, "Asif Kapadia");
    }

    public Documentary(String itemTitle, String writerName) {
        this(itemTitle, writerName, "HD");
    }

    public Documentary(String itemTitle, String writerName, String quality) {
        super(itemTitle, writerName, quality, 128);
    }

    public Documentary(String itemTitle, String writerName, String coverType, int length) {
        super(itemTitle, writerName, coverType, length);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("The real world.");
    }

    public void tellStory() {
        System.out.println("Shows real events.");
    }

    @Override
    public void definitionOfNonFiction(){

    }

}
