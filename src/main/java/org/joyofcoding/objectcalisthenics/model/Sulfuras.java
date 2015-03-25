package org.joyofcoding.objectcalisthenics.model;


public class Sulfuras extends Item {
    public Sulfuras(final int sellIn, final int quality) {
        super(sellIn, quality);
    }

    @Override
    public void update() {
        // Do nothing
    }

    @Override
    public String toString() {
        return "Sulfuras, Hand of Ragnaros";
    }
}
