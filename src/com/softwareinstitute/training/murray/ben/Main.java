package com.softwareinstitute.training.murray.ben;

public class Main {

    public static void main(String[] args) {

        Fantasy myFantasy = new Fantasy();
        myFantasy = new Fantasy();
        System.out.println("Item title: " + myFantasy.getItemTitle());
        System.out.println("Writer: " + myFantasy.getWriterName());
        System.out.println("Cover type: " + myFantasy.getCoverType());
        System.out.println("Number of pages: " + myFantasy.getPages());
        System.out.println();
        myFantasy.storyMedium();
        myFantasy.setting();
        myFantasy.tellStory();
        System.out.println();

        Biography myBiography = new Biography();
        myBiography = new Biography();
        System.out.println("Item title: " + myBiography.getItemTitle());
        System.out.println("Writer: " + myBiography.getWriterName());
        System.out.println("Cover type: " + myBiography.getCoverType());
        System.out.println("Number of pages: " + myBiography.getPages());
        System.out.println();
        myBiography.storyMedium();
        myBiography.setting();
        myBiography.tellStory();
        System.out.println();

        Documentary myDocumentary = new Documentary();
        myDocumentary = new Documentary();
        System.out.println("Item title: " + myDocumentary.getItemTitle());
        System.out.println("Writer: " + myDocumentary.getWriterName());
        System.out.println("Quality: " + myDocumentary.getQuality());
        System.out.println("Runtime: " + myDocumentary.getRuntime());
        System.out.println();
        myDocumentary.storyMedium();
        myDocumentary.setting();
        myDocumentary.tellStory();
        System.out.println();

    }
}
