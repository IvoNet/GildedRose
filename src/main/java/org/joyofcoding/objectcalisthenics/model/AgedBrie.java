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

    public void update() {
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);

        }

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            if (getQuality() < 50) {
                setQuality(getQuality() + 1);
            }
        }


    }

}
