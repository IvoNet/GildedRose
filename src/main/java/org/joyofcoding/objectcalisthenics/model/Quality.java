package org.joyofcoding.objectcalisthenics.model;

/**
 * @author Ivo Woltring
 */
public class Quality {
    private static final int MIN_QUALITY = 0;
    private static final int MAX_QUALITY = 50;
    private Integer quality;

    public Quality(final int kwality) {
        this.quality = kwality;
    }

    public void decrease() {
        if (quality > MIN_QUALITY) {
            quality--;
        }
    }

    public void increase() {
        if (quality < MAX_QUALITY) {
            quality++;
        }
    }

    public void dropToZero() {
        quality = 0;
    }

    public Integer getQuality() {
        return quality;
    }
}
