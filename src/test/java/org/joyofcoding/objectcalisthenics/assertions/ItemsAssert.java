package org.joyofcoding.objectcalisthenics.assertions;

import org.fest.assertions.api.AbstractIterableAssert;
import org.fest.assertions.api.Assertions;
import org.joyofcoding.objectcalisthenics.model.Item;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.extractProperty;

public class ItemsAssert extends AbstractIterableAssert<ItemsAssert, Iterable<Item>, Item> {


    protected ItemsAssert(final Iterable<Item> actual) {
        super(actual, ItemsAssert.class);
    }

    public static ItemsAssert assertThat(final Iterable<Item> actual) {
        return new ItemsAssert(actual);
    }

    public ItemsAssert containsOnlyItemNames(final String... names) {
        isNotNull();

        final Iterable<String> actualItemNames = extractProperty("name", String.class).from(this.actual);

        Assertions.assertThat(actualItemNames)
                  .containsOnly(names);

        return this;
    }

    public ItemsAssert containsOnlyItemQualities(final Integer... qualities) {
        isNotNull();

        final List<Integer> actualItemQualities = new ArrayList<Integer>();
        for (final Item item : this.actual) {
            actualItemQualities.add(item.getQuality()
                                        .getQuality());
        }

        Assertions.assertThat(actualItemQualities)
                  .containsOnly(qualities);

        return this;
    }

    public ItemsAssert containsOnlyItemSellIns(final Integer... sellIns) {
        isNotNull();

        final List<Integer> actualItemSellIns = new ArrayList<Integer>();
        for (final Item actualItemSellIn : this.actual) {
            actualItemSellIns.add(actualItemSellIn.getSellIn()
                                                  .daysLeft());
        }
        Assertions.assertThat(actualItemSellIns)
                  .containsOnly(sellIns);

        return this;
    }

}
