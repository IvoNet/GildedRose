package org.joyofcoding.objectcalisthenics.model;

/**
 * @author Ivo Woltring
 */
public class AgedBrie
        extends Item {


    public AgedBrie(final String name,
                    final int sellIn,
                    final int quality) {
        super(name, sellIn, quality);
    }


    @Override
    public void updateQuality() {
        quality.increase();
    }

    @Override
    public void accountForExpiration() {
        if (sellIn.isExpired()) {
            quality.increase();
        }
    }
}
