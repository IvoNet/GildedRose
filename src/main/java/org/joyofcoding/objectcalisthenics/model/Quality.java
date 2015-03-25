package org.joyofcoding.objectcalisthenics.model;


public class Quality {
    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;
    private static final int ZERO = 0;
    private int quality;

    public Quality(final int quality) {
        this.quality = quality;
    }

    public void decrease() {
        if (this.quality > MIN_QUALITY) {
            this.quality--;
        }
    }

    public void increase() {
        if (this.quality < MAX_QUALITY) {
            this.quality++;
        }
    }

    public void dropToZero() {
        this.quality = ZERO;
    }

    public Integer value() {
        return this.quality;
    }
}
