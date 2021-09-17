package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatCategory {

    public DomesticCat() {
        super.setSetting("domestic");
        super.setAverageHeight(23);
    }


    @Override
    public String eat() {
        String[] randomOutput = {"Purrrrrrr", "Purrrrrrr! It will do I suppose"};
        Random rand = new Random();
        return randomOutput[rand.nextInt(randomOutput.length)];
    }

    @Override
    public String sleep() {
        return "small snooze and snores";
    }

}
