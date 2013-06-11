package org.joyofcoding.objectcalisthenics;

import org.joyofcoding.objectcalisthenics.model.AgedBrie;
import org.joyofcoding.objectcalisthenics.model.BackstagePass;
import org.joyofcoding.objectcalisthenics.model.Item;
import org.joyofcoding.objectcalisthenics.model.Sulfuras;

import java.util.ArrayList;
import java.util.List;

public class GildedRose {
    public static void main(String[] args) {
		GildedRose gildedRose = new GildedRose();
        gildedRose.updateQuality(gildedRose.makeItems());
	}

    public List<Item> makeItems() {
        List<Item> items = new ArrayList<>();
		items.add(new Item("+5 Dexterity Vest", 10, 20));
		items.add(new AgedBrie("Aged Brie", 2, 0));
		items.add(new Item("Elixir of the Mongoose", 5, 7));
		items.add(new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new BackstagePass("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new Item("Conjured Mana Cake", 3, 6));
        return items;
    }

    public void updateQuality(List<Item> list) {
        for (final Item item : list) {
            item.update();
        }
    }

}
