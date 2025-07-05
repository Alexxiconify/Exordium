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
        // TODO: Use RenderSystem for depth state if needed
    }

    public void apply() {
        if (!fetched)
            return;
        // TODO: Use RenderSystem for depth state if needed
    }

}
