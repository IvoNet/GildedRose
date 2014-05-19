package org.joyofcoding.objectcalisthenics.model;

public class Item {
    private final String name;
    private final SellIn sellIn;
    private final Quality quality;

    public Item(final String name, final int sellIn, final int quality) {
        this.name = name;
        this.quality = new Quality(quality);
        this.sellIn = new SellIn(sellIn);
    }

    public String getName() {
        return this.name;
    }

    public SellIn getSellIn() {
        return this.sellIn;
    }


    public Quality getQuality() {
        return this.quality;
    }


    public void update() {

        getQuality().decrease();

        getSellIn().decrease();

        if (getSellIn().isExpired()) {
            getQuality().decrease();
        }
    }

}
