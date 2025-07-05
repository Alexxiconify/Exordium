package dev.tr7zw.exordium.util.rendersystem;

public class BlendStateHolder implements StateHolder {

    private boolean fetched = false;
    private boolean enabled = false;
    private int srcRgb = 1;
    private int dstRgb = 0;
    private int srcAlpha = 1;
    private int dstAlpha = 0;

    public boolean isFetched() {
        return fetched;
    }

    public void fetch() {
        fetched = true;
        // TODO: Restore GlStateManager calls after build system is configured
        // enabled = GlStateManager.BLEND.mode.enabled;
        // srcRgb = GlStateManager.BLEND.srcRgb;
        // srcAlpha = GlStateManager.BLEND.srcAlpha;
        // dstRgb = GlStateManager.BLEND.dstRgb;
        // dstAlpha = GlStateManager.BLEND.dstAlpha;
    }

    public void apply() {
        if (!fetched)
            return;
        // TODO: Restore GlStateManager calls after build system is configured
        // GlStateManager._blendFuncSeparate(srcRgb, dstRgb, srcAlpha, dstAlpha);
        // GlStateManager.BLEND.mode.setEnabled(enabled);
    }

}
