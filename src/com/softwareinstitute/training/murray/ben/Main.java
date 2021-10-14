package com.softwareinstitute.training.murray.ben;

public class Main {

    public static void main(String[] args) {

        Fantasy defaultFantasy = new Fantasy();
        defaultFantasy = new Fantasy();

        System.out.println(defaultFantasy.getItemTitle());
        System.out.println(defaultFantasy.getWriterName());
        System.out.println(defaultFantasy.getCoverType());
        System.out.println(defaultFantasy.getPages());

    }
}
