package org.joyofcoding.objectcalisthenics.model;


public class DexterityVest extends Item {
    public DexterityVest(final int sellIn, final int quality) {
        super(sellIn, quality);
    }

    @Override
    public String toString() {
        return "+5 Dexterity Vest";
    }
}
