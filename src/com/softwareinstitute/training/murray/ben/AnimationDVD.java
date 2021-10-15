package com.softwareinstitute.training.murray.ben;

public class AnimationDVD extends DVD implements TellsFictionalStory {

    /////////////////////////////////////////Attributes////////////////////////////////////////////



    /////////////////////////////////////////Constructors///////////////////////////////////////////

    public AnimationDVD() {
        this("Animation_DVD_Title");
    }

    public AnimationDVD(String itemTitle) {
        this(itemTitle, "Jane Doe");
    }

    public AnimationDVD(String itemTitle, String writerName) {
        this(itemTitle, writerName, "HD");
    }

    public AnimationDVD(String itemTitle, String writerName, String quality) {
        super(itemTitle, writerName, quality, 90);
    }

    public AnimationDVD(String itemTitle, String writerName, String coverType, int length) {
        super(itemTitle, writerName, coverType, length);
    }

    /////////////////////////////////////////Methods////////////////////////////////////////////

    public void setting() {
        System.out.println("Setting could be anything.");
    }

    public void tellStory() {
        System.out.println("Tells story with animated characters.");
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
