package org.joyofcoding.objectcalisthenics.model;

/**
 *
 * @author Ivo Woltring
 */
public class BackstagePass extends Item {
    public BackstagePass(final String name, final int sellIn, final int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        getQuality().increase();
        if (getSellIn() < 11) {
            getQuality().increase();
        }

        if (getSellIn() < 6) {
            getQuality().increase();
        }

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            getQuality().dropToZero();
        }
    }
}
