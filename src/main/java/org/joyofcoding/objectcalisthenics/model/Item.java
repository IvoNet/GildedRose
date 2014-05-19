package org.joyofcoding.objectcalisthenics.model;

public class Item {
    private String name;
    private int sellIn;
    private Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.quality = new Quality(quality);
        this.sellIn = sellIn;
    }

    public String getName() {
        return name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    public void update() {

        getQuality().decrease();

        setSellIn(getSellIn() - 1);

        if (getSellIn() < 0) {
            getQuality().decrease();
        }
    }

}
