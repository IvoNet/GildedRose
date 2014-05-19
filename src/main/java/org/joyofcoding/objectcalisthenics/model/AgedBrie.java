package org.joyofcoding.objectcalisthenics.model;

/**
 * Representation of the Item with the AgedBrie text.
 *
 * For some polymorphism!
 * Introduce the update method here too and eliminate the redundancies.
 *
 * Copy the update method from Item and start cleaning it up.
 *
 * @author Ivo Woltring
 */
public class AgedBrie extends Item {
    public AgedBrie(final String name, final int sellIn, final int quality) {
        super(name, sellIn, quality);
    }


    @Override
    public void update() {
        getQuality().increase();

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            getQuality().increase();
        }

    }
}
