package org.joyofcoding.objectcalisthenics.model;

public class Item {
    String name;
    SellIn sellIn;
    Quality quality;

    public Item(String name,
                int sellIn,
                int quality) {
        this.name = name;
        this.quality = new Quality(quality);
        this.sellIn = new SellIn(sellIn);
    }

    public String getName() {
        return name;
    }

    public SellIn getSellIn() {
        return sellIn;
    }

    public Quality getQuality() {
        return quality;
    }

    public void update() {
        updateQuality();
        sellIn.decrease();
        accountForExpiration();
    }

    public void updateQuality() {
        quality.decrease();
    }

    public void accountForExpiration() {
        if (sellIn.isExpired()) {
            updateQuality();
        }
    }
}
