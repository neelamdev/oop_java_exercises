package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatCategory {

    Random random = new Random();

    public DomesticCat() {
        super.setSetting("domestic");
        super.setAverageHeight(23);

    }

    @Override
    public String eat() {
        return feedTheHappyCat(random);
    }

    public String feedTheHappyCat(Random random) {
        String[] randomOutput = {"Purrrrrrr", "Purrrrrrr! It will do I suppose"};

        return randomOutput[random.nextInt(randomOutput.length)];
    }

    @Override
    public String sleep() {
        return "small snooze and snores";
    }

}
