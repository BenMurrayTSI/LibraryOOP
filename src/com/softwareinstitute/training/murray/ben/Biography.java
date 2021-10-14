package com.softwareinstitute.training.murray.ben;

public class Biography extends Book implements NonFiction{

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Biography() {
        super("Becoming");
    }

    public Biography(String itemTitle) {
        super(itemTitle, "Michelle Obama");
    }

    public Biography(String itemTitle, String writerName) {
        super(itemTitle, writerName, "Hardcover");
    }

    public Biography(String itemTitle, String writerName, String coverType) {
        super(itemTitle, writerName, coverType, 448);
    }

    public Biography(String itemTitle, String writerName, String coverType, int pages) {
        super(itemTitle, writerName, coverType, pages);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("The real world.");
    }

    public void tellStory() {
        System.out.println("Story of a real person.");
    }

    @Override
    public void definitionOfNonFiction(){

    }

}
