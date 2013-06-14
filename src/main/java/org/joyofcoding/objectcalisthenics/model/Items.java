package org.joyofcoding.objectcalisthenics.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Ivo Woltring
 */
public class Items implements Iterable<Item> {

    private final List<Item> items;

    public Items() {
        items = new ArrayList<>();
    }

    public void add(final Item item) {
        items.add(item);
    }

    public void update() {
        for (final Item item : items) {
            item.update();
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return items.iterator();
    }
}
