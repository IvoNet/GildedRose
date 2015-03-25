package org.joyofcoding.objectcalisthenics.model;


public class SellIn {
    private int sellIn;

    public SellIn(final int sellIn) {
        this.sellIn = sellIn;
    }

    public void decrease() {
        this.sellIn--;
    }

    public boolean isExpired() {
        return this.sellIn < 0;
    }

    public boolean sellInDays(final int days) {
        return this.sellIn < days;
    }

    public Integer value() {
        return this.sellIn;
    }
}
