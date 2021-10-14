package com.softwareinstitute.training.murray.ben;

public class Animation extends DVD{

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public Animation() {
        this("Wall-E");
    }

    public Animation(String itemTitle) {
        this(itemTitle, "Andrew Stanton");
    }

    public Animation(String itemTitle, String writerName) {
        this(itemTitle, writerName, "HD");
    }

    public Animation(String itemTitle, String writerName, String quality) {
        super(itemTitle, writerName, quality, 97);
    }

    public Animation(String itemTitle, String writerName, String coverType, int length) {
        super(itemTitle, writerName, coverType, length);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Can be any setting.");
    }

    public void tellStory() {
        System.out.println("Story told with animated characters.");
    }

}
