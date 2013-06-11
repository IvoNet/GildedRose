package org.joyofcoding.objectcalisthenics.model;

/**
 * @author Ivo Woltring
 */
public class Sulfuras
        extends Item {
    public Sulfuras(final String name,
                    final int sellIn,
                    final int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        //do nothing!
    }
}
