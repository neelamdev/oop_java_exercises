package com.techreturners.cats;

import java.util.Random;

public class DomesticCat extends CatCategory {

    Random random = new Random();
    //private int randomness;

    public DomesticCat() {
        super.setSetting("domestic");
        super.setAverageHeight(23);

    }

//    public DomesticCat(int randomNumber)
//    {
//        this.randomness = randomNumber;
//    }

    @Override
    public String eat() {
       // eatCat(random);
        //String[] randomOutput = {"Purrrrrrr", "Purrrrrrr! It will do I suppose"};

        return eatCat(random);
    }

    public String eatCat(Random random) {
        String[] randomOutput = {"Purrrrrrr", "Purrrrrrr! It will do I suppose"};

        return randomOutput[random.nextInt(randomOutput.length)];
    }

    @Override
    public String sleep() {
        return "small snooze and snores";
    }

}
