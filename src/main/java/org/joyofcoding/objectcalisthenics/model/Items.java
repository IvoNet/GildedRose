/*
 * Copyright 2015 ivonet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

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
