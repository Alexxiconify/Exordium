package dev.tr7zw.exordium.util;
public class PacingTracker {
    private long cooldown = 0;
    public boolean isCooldownOver() {
        return System.currentTimeMillis() > cooldown;
    }

}
