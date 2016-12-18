package org.joyofcoding.objectcalisthenics.model;

/**
 * @author Ivo Woltring
 */
public class SellIn {
    private static final int MIN_DAYS_LEFT = 0;
    private Integer sellIn;

    public SellIn(final int sellIn) {
        this.sellIn = sellIn;
    }

    public void decrease() {
        sellIn--;
    }

    public boolean isExpired() {
        return sellIn < MIN_DAYS_LEFT;
    }

    public boolean sellWithin(final int days) {
        return sellIn < days;
    }

    public Integer daysLeft() {
        return sellIn;
    }
}
