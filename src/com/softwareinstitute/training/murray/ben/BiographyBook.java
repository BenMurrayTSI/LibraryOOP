package com.softwareinstitute.training.murray.ben;

public class BiographyBook extends Book implements TellsNonFictionStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public BiographyBook() {
        this("Biography_Book_Title");
    }

    public BiographyBook(String itemTitle) {
        this(itemTitle, "John Doe");
    }

    public BiographyBook(String itemTitle, String writerName) {
        this(itemTitle, writerName, "Hardcover");
    }

    public BiographyBook(String itemTitle, String writerName, String coverType) {
        super(itemTitle, writerName, coverType, 600);
    }

    public BiographyBook(String itemTitle, String writerName, String coverType, int pages) {
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
    public void realBeginning(){

    }

    @Override
    public void realMiddle(){

    }

    @Override
    public void realEnd(){

    }

}