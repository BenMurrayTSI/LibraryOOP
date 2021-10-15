package com.softwareinstitute.training.murray.ben;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        System.out.println("Book-Fantasy");
        FantasyBook defaultFantasyBook = new FantasyBook();
        System.out.println(defaultFantasyBook);
        System.out.println();

        System.out.println("Book-Biography");
        BiographyBook defaultBiographyBook = new BiographyBook();
        System.out.println(defaultBiographyBook);
        System.out.println();

        System.out.println("DVD-Documentary");
        DocumentaryDVD defaultDocumentaryDVD = new DocumentaryDVD();
        System.out.println(defaultDocumentaryDVD);
        System.out.println();

        System.out.println("DVD-Animation");
        AnimationDVD defaultAnimationDVD = new AnimationDVD();
        System.out.println(defaultAnimationDVD);
        System.out.println();

        FantasyBook myFantasy = new FantasyBook("Two Towers", "Tolkien", "Paperback", 352);

        System.out.println(myFantasy);

    }
}
