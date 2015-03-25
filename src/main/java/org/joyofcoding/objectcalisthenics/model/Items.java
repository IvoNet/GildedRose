package org.joyofcoding.objectcalisthenics.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Items implements Iterable<Item> {
    private final List<Item> items;

    public Items() {
        this.items = new ArrayList<Item>();
    }

    public void add(final Item item) {
        this.items.add(item);
    }

    public void update() {
        for (final Item item : this.items) {
            item.update();
        }
    }

    @Override
    public Iterator<Item> iterator() {
        return this.items.iterator();
    }

//    public List<Integer> retrieveSellInsAsList() {
//        final List<Integer> sellIns = new ArrayList<Integer>();
//        for (final Item item : this.items) {
//            sellIns.add(item.daysLeft());
//        }
//        return sellIns;
//    }
}
