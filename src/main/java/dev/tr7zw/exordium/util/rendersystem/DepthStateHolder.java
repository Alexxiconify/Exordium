package dev.tr7zw.exordium.util.rendersystem;

public class DepthStateHolder implements StateHolder {

    private boolean fetched = false;
    private int func = 1;
    private boolean mask = false;

    public boolean isFetched() {
        return fetched;
    }

    public void fetch() {
        fetched = true;
        // TODO: Restore GlStateManager calls after build system is configured
        // func = GlStateManager.DEPTH.func;
        // mask = GlStateManager.DEPTH.mask;
    }

    public void apply() {
        if (!fetched)
            return;
        // TODO: Restore GlStateManager calls after build system is configured
        // GlStateManager._depthFunc(func);
        // GlStateManager._depthMask(mask);
    }

}
