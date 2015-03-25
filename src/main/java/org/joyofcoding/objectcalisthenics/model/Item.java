package org.joyofcoding.objectcalisthenics.model;

public class Item {
    private final SellIn sellIn;
    private final Quality quality;

    public Item(final int sellIn, final int quality) {
        this.quality = new Quality(quality);
        this.sellIn = new SellIn(sellIn);
    }

    protected boolean expired() {
        return this.sellIn.isExpired();
    }

    protected void decreaseSellIn() {
        this.sellIn.decrease();
    }

    protected boolean daysLeft(final int days) {
        return this.sellIn.sellInDays(days);
    }

    public int daysLeft() {
        return this.sellIn.value();
    }

    protected void increaseQuality() {
        this.quality.increase();
    }

    protected void removeAllQuality() {
        this.quality.dropToZero();
    }

    public int qualityValue() {
        return this.quality.value();
    }

    public void update() {
        this.quality.decrease();
        decreaseSellIn();
        if (expired()) {
            this.quality.decrease();
        }
    }

}
