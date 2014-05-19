package org.joyofcoding.objectcalisthenics.model;

/**
 *
 * @author Ivo Woltring
 */
public class SellIn {
    private int days;

    public SellIn(final int days) {
        this.days = days;
    }

    public void decrease() {
        this.days--;
    }

    public boolean isExpired() {
        return this.days < 0;
    }

    public boolean sellInLessThenDays(final int value) {
        return this.days < value;
    }

    public Integer daysLeft() {
        return this.days;
    }
}
