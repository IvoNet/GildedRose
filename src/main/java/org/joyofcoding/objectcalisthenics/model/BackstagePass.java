package org.joyofcoding.objectcalisthenics.model;

/**
 * @author Ivo Woltring
 */
public class BackstagePass
        extends Item {

    public BackstagePass(final String s,
                         final int sellIn,
                         final int quality) {
        super(s, sellIn, quality);
    }

    @Override
    public void update() {
        getQuality().increase();
        accountForExpiration();
    }

    @Override
    public void accountForExpiration() {
        if (sellIn.sellWithin(11)) {
            quality.increase();
        }

        if (sellIn.sellWithin(6)) {
            quality.increase();
        }

        sellIn.decrease();

        if (sellIn.isExpired()) {
            quality.dropToZero();
        }
    }
}
