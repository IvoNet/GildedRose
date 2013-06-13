package org.joyofcoding.objectcalisthenics.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ivo Woltring
 */
public class Items {

    private List<Item> items;

    public Items() {
        items = new ArrayList<>();
    }

    public void add(Item item) {
        items.add(item);
    }

    public void update() {
        for (final Item item : items) {
            item.update();
        }
    }

}
