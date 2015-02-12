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

/**
 * @author Ivo Woltring
 */
public class BackstagePass extends Item {
    public BackstagePass(final int sellIn, final int quality) {
        super(sellIn, quality);
    }


    @Override
    public void update() {
        getQuality().increase();

        if (getSellIn().sellInDays(11)) {
            getQuality().increase();
        }

        if (getSellIn().sellInDays(6)) {
            getQuality().increase();
        }

        getSellIn().decrease();

        if (getSellIn().isExpired()) {
            getQuality().dropToZero();
        }
    }

    @Override
    public String toString() {
        return "Backstage passes to a TAFKAL80ETC concert";
    }

}
