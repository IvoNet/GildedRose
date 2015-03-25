package org.joyofcoding.objectcalisthenics.assertions;

import org.fest.assertions.api.AbstractIterableAssert;
import org.fest.assertions.api.Assertions;
import org.joyofcoding.objectcalisthenics.model.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemsAssert extends AbstractIterableAssert<ItemsAssert, Iterable<Item>, Item> {


    private ItemsAssert(final Iterable<Item> actual) {
        super(actual, ItemsAssert.class);
    }

    public ItemsAssert containsOnlyItemNames(final String... names) {
        isNotNull();

        final List<String> actualItemNames = new ArrayList<String>();
        for (final Item item : this.actual) {
            actualItemNames.add(item.toString());
        }

        Assertions.assertThat(actualItemNames)
                  .containsOnly(names);

        return this;
    }

    public ItemsAssert containsOnlyItemQualities(final Integer... qualities) {
        isNotNull();

        final List<Integer> actualItemQualities = new ArrayList<Integer>();
        for (final Item item : this.actual) {
            actualItemQualities.add(item.qualityValue());
        }
        Assertions.assertThat(actualItemQualities)
                  .containsOnly(qualities);

        return this;
    }

    public ItemsAssert containsOnlyItemSellIns(final Integer... sellIns) {
        isNotNull();

        final List<Integer> actualItemSellIns = new ArrayList<Integer>();
        for (final Item item : this.actual) {
            actualItemSellIns.add(item.daysLeft());
        }
        Assertions.assertThat(actualItemSellIns)
                  .containsOnly(sellIns);

        return this;
    }

    public static ItemsAssert assertThat(final Iterable<Item> actual) {
        return new ItemsAssert(actual);
    }


}
