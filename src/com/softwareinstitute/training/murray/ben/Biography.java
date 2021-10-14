package com.softwareinstitute.training.murray.ben;

public class Biography extends Book implements NonFiction{

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Biography() {
        this("Biography_Book_Title");
    }

    public Biography(String itemTitle) {
        this(itemTitle, "John Doe");
    }

    public Biography(String itemTitle, String writerName) {
        this(itemTitle, writerName, "Hardcover");
    }

    public Biography(String itemTitle, String writerName, String coverType) {
        super(itemTitle, writerName, coverType, 600);
    }

    public Biography(String itemTitle, String writerName, String coverType, int pages) {
        super(itemTitle, writerName, coverType, pages);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Setting is the real world.");
    }

    public void tellStory() {
        System.out.println("Tells story of a real person.");
    }

    @Override
    public void definitionOfNonFiction(){

    }

}
