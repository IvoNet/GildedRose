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
        if (getQuality() < 50) {
            setQuality(getQuality() + 1);

            if (getSellIn() < 11) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }

            if (getSellIn() < 6) {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }
        }

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            setQuality(getQuality() - getQuality());
        }


    }

}
