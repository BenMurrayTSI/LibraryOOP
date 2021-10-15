package com.softwareinstitute.training.murray.ben;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Book-Fantasy");
        Fantasy defaultFantasy = new Fantasy();
        defaultFantasy = new Fantasy();
        System.out.println("Item title: " + defaultFantasy.getItemTitle());
        System.out.println("Writer: " + defaultFantasy.getWriterName());
        System.out.println("Cover type: " + defaultFantasy.getCoverType());
        System.out.println("Number of pages: " + defaultFantasy.getPages());
        defaultFantasy.storyMedium();
        defaultFantasy.setting();
        defaultFantasy.tellStory();
        System.out.println();

        System.out.println("Book-Biography");
        Biography defaultBiography = new Biography();
        defaultBiography = new Biography();
        System.out.println("Item title: " + defaultBiography.getItemTitle());
        System.out.println("Writer: " + defaultBiography.getWriterName());
        System.out.println("Cover type: " + defaultBiography.getCoverType());
        System.out.println("Number of pages: " + defaultBiography.getPages());
        defaultBiography.storyMedium();
        defaultBiography.setting();
        defaultBiography.tellStory();
        System.out.println();

        System.out.println("DVD-Documentary");
        Documentary defaultDocumentary = new Documentary();
        defaultDocumentary = new Documentary();
        System.out.println("Item title: " + defaultDocumentary.getItemTitle());
        System.out.println("Writer: " + defaultDocumentary.getWriterName());
        System.out.println("Quality: " + defaultDocumentary.getQuality());
        System.out.println("Runtime: " + defaultDocumentary.getRuntime());
        defaultDocumentary.storyMedium();
        defaultDocumentary.setting();
        defaultDocumentary.tellStory();
        System.out.println();

        System.out.println("DVD-Animation");
        Animation defaultAnimation = new Animation();
        defaultAnimation = new Animation();
        System.out.println("Item title: " + defaultAnimation.getItemTitle());
        System.out.println("Writer: " + defaultAnimation.getWriterName());
        System.out.println("Quality: " + defaultAnimation.getQuality());
        System.out.println("Runtime: " + defaultAnimation.getRuntime());
        defaultAnimation.storyMedium();
        defaultAnimation.setting();
        defaultAnimation.tellStory();
        System.out.println();

        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem myFantasy = new Fantasy("Two Towers", "Tolkien", "Paperback", 352);

        items.add(myFantasy);

    }
}
