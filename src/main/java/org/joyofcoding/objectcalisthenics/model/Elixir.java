package org.joyofcoding.objectcalisthenics.model;


public class Elixir extends Item {
    public Elixir(final int sellIn, final int quality) {
        super(sellIn, quality);
    }

    @Override
    public String toString() {
        return "Elixir of the Mongoose";
    }
}
