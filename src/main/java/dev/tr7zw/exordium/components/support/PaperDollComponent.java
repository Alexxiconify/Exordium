package dev.tr7zw.exordium.components.support;

import dev.tr7zw.exordium.components.BufferComponent;
import net.minecraft.resources.ResourceLocation;

public class PaperDollComponent implements BufferComponent<Void> {

    
    private static final ResourceLocation id = new ResourceLocation("tr7zw", "paperdoll");

    @Override
    public void captureState(Void context) {
        // do nothing
    }

    @Override
    public boolean hasChanged(Void context) {
        return true;
    }

}
