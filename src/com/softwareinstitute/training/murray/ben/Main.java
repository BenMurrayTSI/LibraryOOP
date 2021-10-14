package com.softwareinstitute.training.murray.ben;

public class Main {

    public static void main(String[] args) {

        Fantasy defaultFantasy = new Fantasy();
        defaultFantasy = new Fantasy();

        System.out.println(defaultFantasy.getItemTitle());
        System.out.println(defaultFantasy.getWriterName());
        System.out.println(defaultFantasy.getCoverType());
        System.out.println(defaultFantasy.getPages());

        System.out.println();

        Fantasy myFantasy = new Fantasy();
        myFantasy = new Fantasy("Notes","Ben","Hardcover",10);

        System.out.println(myFantasy.getItemTitle());
        System.out.println(myFantasy.getWriterName());
        System.out.println(myFantasy.getCoverType());
        System.out.println(myFantasy.getPages());

        System.out.println();

        Biography myBiography = new Biography();
        myBiography = new Biography();

        System.out.println(myBiography.getItemTitle());
        System.out.println(myBiography.getWriterName());
        System.out.println(myBiography.getCoverType());
        System.out.println(myBiography.getPages());



    }
}
