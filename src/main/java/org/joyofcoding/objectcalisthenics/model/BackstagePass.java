package org.joyofcoding.objectcalisthenics.model;


public class BackstagePass extends Item {
    public BackstagePass(final int sellIn, final int quality) {
        super(sellIn, quality);
    }


    @Override
    public void update() {
        increaseQuality();

        if (daysLeft(11)) {
            increaseQuality();
        }

        if (daysLeft(6)) {
            increaseQuality();
        }

        decreaseSellIn();

        if (expired()) {
            removeAllQuality();
        }
    }


    @Override
    public String toString() {
        return "Backstage passes to a TAFKAL80ETC concert";
    }

}
