package dev.tr7zw.exordium.util.rendersystem;

public class ShaderHolder implements StateHolder {

    private boolean fetched = false;
    private Object shader = null; // TODO: Change back to CompiledShaderProgram after build system is configured

    public boolean isFetched() {
        return fetched;
    }

    public void fetch() {
        fetched = true;
        // TODO: Restore RenderSystem calls after build system is configured
        // shader = RenderSystem.getShader();
    }

    public void apply() {
        if (!fetched)
            return;
        // TODO: Restore RenderSystem calls after build system is configured
        // RenderSystem.setShader(shader);
    }

}
