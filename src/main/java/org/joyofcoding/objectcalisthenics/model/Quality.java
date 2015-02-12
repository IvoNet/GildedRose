package org.joyofcoding.objectcalisthenics.model;

/**
 *
 * @author Ivo Woltring
 */
public class Quality {
    private int quality;

    public Quality(final int quality) {
        this.quality = quality;
    }

    public void decrease() {
        if (this.quality > 0) {
            this.quality--;
        }
    }

    public void increase() {
        if (this.quality < 50) {
            this.quality++;
        }
    }

    public void dropToZero() {
        this.quality = 0;
    }

    public Integer getQuality() {
        return this.quality;
    }
}
