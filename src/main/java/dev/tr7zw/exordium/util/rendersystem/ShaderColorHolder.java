package dev.tr7zw.exordium.util.rendersystem;

public class ShaderColorHolder implements StateHolder {

    private boolean fetched = false;
    private float[] func = new float[4];

    public boolean isFetched() {
        return fetched;
    }

    public void fetch() {
        fetched = true;
        // TODO: Restore RenderSystem calls after build system is configured
        // float[] cur = RenderSystem.getShaderColor();
        // func[0] = cur[0];
        // func[1] = cur[1];
        // func[2] = cur[2];
        // func[3] = cur[3];
    }

    public void apply() {
        if (!fetched)
            return;
        // TODO: Restore RenderSystem calls after build system is configured
        // RenderSystem.setShaderColor(func[0], func[1], func[2], func[3]);
    }

}
