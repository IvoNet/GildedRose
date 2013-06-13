package org.joyofcoding.objectcalisthenics.assertions;

import org.fest.assertions.api.AbstractIterableAssert;
import org.fest.assertions.api.Assertions;
import org.joyofcoding.objectcalisthenics.model.Item;
import org.joyofcoding.objectcalisthenics.model.Quality;
import org.joyofcoding.objectcalisthenics.model.SellIn;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.extractProperty;

public class ItemsAssert
        extends AbstractIterableAssert<ItemsAssert, Iterable<Item>, Item> {


    protected ItemsAssert(Iterable<Item> actual) {
        super(actual, ItemsAssert.class);
    }

    public static ItemsAssert assertThat(Iterable<Item> actual) {
        return new ItemsAssert(actual);
    }

    public ItemsAssert containsOnlyItemNames(String... names) {
        isNotNull();

        Iterable<String> actualItemNames = extractProperty("name", String.class).from(actual);


        Assertions.assertThat(actualItemNames)
                  .containsOnly(names);

        return this;
    }

    public ItemsAssert containsOnlyItemQualities(Integer... qualities) {
        isNotNull();

//        Iterable<Integer> actualItemQualities = extractProperty("quality", Integer.class).from(actual);
        List<Integer> actualItemQualities = new ArrayList<>();
        for (final Item item : actual) {
            final Quality quality = item.getQuality();
            actualItemQualities.add(quality.getQuality());
        }

        Assertions.assertThat(actualItemQualities)
                  .containsOnly(qualities);

        return this;
    }

    public ItemsAssert containsOnlyItemSellIns(Integer... sellIns) {
        isNotNull();

        List<Integer> actualItemSellIns = new ArrayList<>();
        for (final Item item : actual) {
            final SellIn sellIn = item.getSellIn();
            actualItemSellIns.add(sellIn.daysLeft()
            );
        }
        Assertions.assertThat(actualItemSellIns)
                  .containsOnly(sellIns);


        return this;
    }

}
