package com.techreturners.cats;

public class LionCat extends CatCategory {
    public LionCat() {
        super.setAverageHeight(1100);
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }


}
