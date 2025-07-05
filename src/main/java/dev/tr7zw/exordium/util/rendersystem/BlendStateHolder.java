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
        // TODO: Replace with RenderSystem state fetch if available in 1.21.7
        // enabled = RenderSystem.isBlendEnabled();
        // srcRgb = ...
        // srcAlpha = ...
        // dstRgb = ...
        // dstAlpha = ...
    }

    public void apply() {
        if (!fetched)
            return;
        // TODO: Replace with RenderSystem blend func if available in 1.21.7
        // RenderSystem.blendFuncSeparate(srcRgb, dstRgb, srcAlpha, dstAlpha);
        // RenderSystem.setBlendEnabled(enabled);
    }

}
