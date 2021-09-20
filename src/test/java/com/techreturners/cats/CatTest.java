package com.techreturners.cats;

import org.junit.Ignore;
import org.junit.Test;
import testhelper.myRandomStub;

import java.util.Random;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void checkCatIsAwake() {
        Cat domesticCat = new DomesticCat();
        assertFalse("Cat should be awake by default", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanGoToSleep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        assertTrue("Cat should be snoozing", domesticCat.isAsleep());
    }

    @Test
    public void checkCatCanWakep() {
        Cat domesticCat = new DomesticCat();
        domesticCat.goToSleep();
        domesticCat.wakeUp();
        assertFalse("Cat should be awake now", domesticCat.isAsleep());
    }

    @Test
    public void checkCatSetting() {
        Cat domesticCat = new DomesticCat();
        assertEquals("domestic", domesticCat.getSetting());
    }

    @Test
    public void checkCatHeight() {
        Cat domesticCat = new DomesticCat();
        assertEquals(23, domesticCat.getAverageHeight());
    }

    @Test
    public void checkLionHeight() {
        Cat lionCat = new LionCat();
        assertEquals(1100, lionCat.getAverageHeight());
    }

    @Test
    public void feedTheLion() {
        Cat lionCat = new LionCat();
        assertEquals("Roar!!!!", lionCat.eat());
    }

    @Test
    public void feedTheCheetah() {
        Cat cheetahCat = new CheetahCat();
        assertEquals("Zzzzzzz", cheetahCat.eat());
    }
// @Ignore
// @Test
//    public void feedTheCat() {
//        Cat domesticCat = new DomesticCat();
//        //assertEquals("Purrrrrrr", domesticCat.eat());
//    String eatComment = domesticCat.eat();
//   assertTrue("Purrrrrrr".equals(eatComment) || "Purrrrrrr! It will do I suppose".equals(eatComment));
//
//    }

    @Test
    public void feedTheCat() {
        DomesticCat domesticCat = new DomesticCat();
        String result = domesticCat.eatCat(new myRandomStub(0));
        System.out.println(result);
        assertEquals("Purrrrrrr", result);
        //assertTrue((result.contains("Purrrrrrr")));
    }
}
