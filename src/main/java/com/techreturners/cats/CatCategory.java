package com.techreturners.cats;

public abstract class CatCategory implements Cat{
    private String setting;
    private int averageHeight;
    protected boolean isAsleep = false;


    public int getAverageHeight() {
        return averageHeight;
    }

    public void setAverageHeight(int averageHeight){
        this.averageHeight=averageHeight;
    }


    public String getSetting() {
        return setting;
    }

    public void setSetting(String setting){
        this.setting=setting;
    }

    public void goToSleep() {
        sleep();
        isAsleep = true;
    }


    public void wakeUp() {
        isAsleep = false;

    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }

    @Override
    public String sleep() {
        return null;
    }
}
