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
        if (getSellIn().sellInLessThenDays(11)) {
            getQuality().increase();
        }
        if (getSellIn().sellInLessThenDays(6)) {
            getQuality().increase();
        }

        getSellIn().decrease();


        if (getSellIn().isExpired()) {
            getQuality().dropToZero();
        }
    }
}
