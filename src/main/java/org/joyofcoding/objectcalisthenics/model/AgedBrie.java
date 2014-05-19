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
        if (!getName().equals("Aged Brie") && !getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (getQuality() > 0) {
                if (!getName().equals("Sulfuras, Hand of Ragnaros")) {
                    setQuality(getQuality() - 1);
                }
            }
        } else {
            if (getQuality() < 50) {
                setQuality(getQuality() + 1);

                if (getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
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
            }
        }

        if (!getName().equals("Sulfuras, Hand of Ragnaros")) {
            setSellIn(getSellIn() - 1);
        }

        if (getSellIn() < 0) {
            if (!getName().equals("Aged Brie")) {
                if (!getName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (getQuality() > 0) {
                        if (!getName().equals("Sulfuras, Hand of Ragnaros")) {
                            setQuality(getQuality() - 1);
                        }
                    }
                } else {
                    setQuality(getQuality() - getQuality());
                }
            } else {
                if (getQuality() < 50) {
                    setQuality(getQuality() + 1);
                }
            }
        }

    }
}
