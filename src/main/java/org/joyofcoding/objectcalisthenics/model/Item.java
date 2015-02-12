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

public class Item {
    private final SellIn sellIn;
    private final Quality quality;

    public Item(final int sellIn, final int quality) {
        this.quality = new Quality(quality);
        this.sellIn = new SellIn(sellIn);
    }

    public SellIn getSellIn() {
        return this.sellIn;
    }

    public Quality getQuality() {
        return this.quality;
    }

    public void update() {
        this.quality.decrease();
        getSellIn().decrease();

        if (getSellIn().isExpired()) {
            this.quality.decrease();
        }
    }


}
