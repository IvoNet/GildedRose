package org.joyofcoding.objectcalisthenics.model;

/**
 *
 * @author Ivo Woltring
 */
public class Sulfuras extends Item {
    public Sulfuras(final String name, final int sellIn, final int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void update() {
        //If you copied the whole update method from Item and you remove every statement that can never be true
        //knowing you are a Sulfuras then you end up with an empty method...
    }
}
