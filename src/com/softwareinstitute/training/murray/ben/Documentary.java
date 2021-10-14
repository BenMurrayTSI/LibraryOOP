package com.softwareinstitute.training.murray.ben;

public class Documentary extends DVD implements TellsNonFictionStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Documentary() {
        this("Documentary_DVD_Title");
    }

    public Documentary(String itemTitle) {
        this(itemTitle, "Jane Doe");
    }

    public Documentary(String itemTitle, String writerName) {
        this(itemTitle, writerName, "HD");
    }

    public Documentary(String itemTitle, String writerName, String quality) {
        super(itemTitle, writerName, quality, 110);
    }

    public Documentary(String itemTitle, String writerName, String coverType, int length) {
        super(itemTitle, writerName, coverType, length);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Setting is the real world.");
    }

    public void tellStory() {
        System.out.println("Tells story about real events.");
    }

    @Override
    public void realBeginning(){

    }

    @Override
    public void realMiddle(){

    }

    @Override
    public void realEnd(){

    }

}
