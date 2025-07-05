package dev.tr7zw.exordium.util.rendersystem;

import com.mojang.blaze3d.systems.RenderSystem;

public class ShaderTextureHolder implements StateHolder {

    private boolean fetched = false;
    private int[] texture = new int[12];

    public boolean isFetched() {
        return fetched;
    }

    public void fetch() {
        fetched = true;
        // TODO: Restore RenderSystem calls after build system is configured
        // for (int i = 0; i < 12; i++) {
        //     texture[i] = RenderSystem.getShaderTexture(i);
        // }
    }

    public void apply() {
        if (!fetched)
            return;
        // TODO: Restore RenderSystem calls after build system is configured
        // for (int i = 0; i < 12; i++) {
        //     RenderSystem.setShaderTexture(i, texture[i]);
        // }
    }

}
