package com.softwareinstitute.training.murray.ben;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Book-Fantasy");
        FantasyBook defaultFantasyBook = new FantasyBook();
        defaultFantasyBook = new FantasyBook();
        System.out.println("Item title: " + defaultFantasyBook.getItemTitle());
        System.out.println("Writer: " + defaultFantasyBook.getWriterName());
        System.out.println("Cover type: " + defaultFantasyBook.getCoverType());
        System.out.println("Number of pages: " + defaultFantasyBook.getPages());
        defaultFantasyBook.storyMedium();
        defaultFantasyBook.setting();
        defaultFantasyBook.tellStory();
        System.out.println();

        System.out.println("Book-Biography");
        BiographyBook defaultBiographyBook = new BiographyBook();
        defaultBiographyBook = new BiographyBook();
        System.out.println("Item title: " + defaultBiographyBook.getItemTitle());
        System.out.println("Writer: " + defaultBiographyBook.getWriterName());
        System.out.println("Cover type: " + defaultBiographyBook.getCoverType());
        System.out.println("Number of pages: " + defaultBiographyBook.getPages());
        defaultBiographyBook.storyMedium();
        defaultBiographyBook.setting();
        defaultBiographyBook.tellStory();
        System.out.println();

        System.out.println("DVD-Documentary");
        DocumentaryDVD defaultDocumentaryDVD = new DocumentaryDVD();
        defaultDocumentaryDVD = new DocumentaryDVD();
        System.out.println("Item title: " + defaultDocumentaryDVD.getItemTitle());
        System.out.println("Writer: " + defaultDocumentaryDVD.getWriterName());
        System.out.println("Quality: " + defaultDocumentaryDVD.getQuality());
        System.out.println("Runtime: " + defaultDocumentaryDVD.getRuntime());
        defaultDocumentaryDVD.storyMedium();
        defaultDocumentaryDVD.setting();
        defaultDocumentaryDVD.tellStory();
        System.out.println();

        System.out.println("DVD-Animation");
        AnimationDVD defaultAnimationDVD = new AnimationDVD();
        defaultAnimationDVD = new AnimationDVD();
        System.out.println("Item title: " + defaultAnimationDVD.getItemTitle());
        System.out.println("Writer: " + defaultAnimationDVD.getWriterName());
        System.out.println("Quality: " + defaultAnimationDVD.getQuality());
        System.out.println("Runtime: " + defaultAnimationDVD.getRuntime());
        defaultAnimationDVD.storyMedium();
        defaultAnimationDVD.setting();
        defaultAnimationDVD.tellStory();
        System.out.println();

        ArrayList<LibraryItem> items = new ArrayList<>();

        LibraryItem myFantasy = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);

        items.add(myFantasy);

    }
}
