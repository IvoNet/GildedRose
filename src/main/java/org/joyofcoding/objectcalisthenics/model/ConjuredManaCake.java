package org.joyofcoding.objectcalisthenics.model;


public class ConjuredManaCake extends Item {
    public ConjuredManaCake(final int sellIn, final int quality) {
        super(sellIn, quality);
    }

    @Override
    public String toString() {
        return "Conjured Mana Cake";
    }
}
