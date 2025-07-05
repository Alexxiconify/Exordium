package dev.tr7zw.exordium.components.support;

import dev.tr7zw.exordium.components.BufferComponent;
import lombok.Getter;
import net.minecraft.resources.ResourceLocation;

public class XaerosMinimapComponent implements BufferComponent<Void> {

    private static final ResourceLocation id = new ResourceLocation("xaero", "minimap");

    @Override
    public void captureState(Void context) {
        // do nothing
    }

    @Override
    public boolean hasChanged(Void context) {
        return true;
    }

}
