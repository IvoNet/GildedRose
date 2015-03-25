package org.joyofcoding.objectcalisthenics.model;


public class AgedBrie extends Item {

    public AgedBrie(final int sellIn, final int quality) {
        super(sellIn, quality);
    }

    @Override
    public void update() {
        increaseQuality();

        decreaseSellIn();

        if (expired()) {
            increaseQuality();
        }
    }

    @Override
    public String toString() {
        return "Aged Brie";
    }

}
