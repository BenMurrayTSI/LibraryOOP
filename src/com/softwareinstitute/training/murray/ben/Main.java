package com.softwareinstitute.training.murray.ben;

public class Main {

    public static void main(String[] args) {
        System.out.println();

        System.out.println("Book-Fantasy");
        Fantasy myFantasy = new Fantasy();
        myFantasy = new Fantasy();
        System.out.println("Item title: " + myFantasy.getItemTitle());
        System.out.println("Writer: " + myFantasy.getWriterName());
        System.out.println("Cover type: " + myFantasy.getCoverType());
        System.out.println("Number of pages: " + myFantasy.getPages());
        myFantasy.storyMedium();
        myFantasy.setting();
        myFantasy.tellStory();
        System.out.println();

        System.out.println("Book-Biography");
        Biography myBiography = new Biography();
        myBiography = new Biography();
        System.out.println("Item title: " + myBiography.getItemTitle());
        System.out.println("Writer: " + myBiography.getWriterName());
        System.out.println("Cover type: " + myBiography.getCoverType());
        System.out.println("Number of pages: " + myBiography.getPages());
        myBiography.storyMedium();
        myBiography.setting();
        myBiography.tellStory();
        System.out.println();

        System.out.println("DVD-Documentary");
        Documentary myDocumentary = new Documentary();
        myDocumentary = new Documentary();
        System.out.println("Item title: " + myDocumentary.getItemTitle());
        System.out.println("Writer: " + myDocumentary.getWriterName());
        System.out.println("Quality: " + myDocumentary.getQuality());
        System.out.println("Runtime: " + myDocumentary.getRuntime());
        myDocumentary.storyMedium();
        myDocumentary.setting();
        myDocumentary.tellStory();
        System.out.println();

        System.out.println("DVD-Animation");
        Animation myAnimation = new Animation();
        myAnimation = new Animation();
        System.out.println("Item title: " + myAnimation.getItemTitle());
        System.out.println("Writer: " + myAnimation.getWriterName());
        System.out.println("Quality: " + myAnimation.getQuality());
        System.out.println("Runtime: " + myAnimation.getRuntime());
        myAnimation.storyMedium();
        myAnimation.setting();
        myAnimation.tellStory();
        System.out.println();
    }
}
