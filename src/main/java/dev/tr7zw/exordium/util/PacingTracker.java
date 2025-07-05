package dev.tr7zw.exordium.util;

import lombok.Getter;
import lombok.Setter;

public class PacingTracker {

    
    @Setter
    private long cooldown = 0;

    public boolean isCooldownOver() {
        return System.currentTimeMillis() > cooldown;
    }

}
