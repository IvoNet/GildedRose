package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.model.AgedBrie;
import org.joyofcoding.objectcalisthenics.model.BackstagePass;
import org.joyofcoding.objectcalisthenics.model.ConjuredManaCake;
import org.joyofcoding.objectcalisthenics.model.DexterityVest;
import org.joyofcoding.objectcalisthenics.model.Elixir;
import org.joyofcoding.objectcalisthenics.model.Items;
import org.joyofcoding.objectcalisthenics.model.Sulfuras;

public class GildedRose {
    public Items makeItems() {
        final Items items = new Items();
        items.add(new DexterityVest(10, 20));
        items.add(new AgedBrie(2, 0));
        items.add(new Elixir(5, 7));
        items.add(new Sulfuras(0, 80));
        items.add(new BackstagePass(15, 20));
        items.add(new ConjuredManaCake(3, 6));
        return items;
    }

    public void updateQuality(final Items items) {
        items.update();
    }

    public static void main(final String[] args) {
        final GildedRose gildedRose = new GildedRose();
        final Items items = gildedRose.makeItems();
        gildedRose.updateQuality(items);
    }
}
