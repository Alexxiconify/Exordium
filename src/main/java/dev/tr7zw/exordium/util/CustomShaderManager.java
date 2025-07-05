package dev.tr7zw.exordium.util;

import com.mojang.blaze3d.shaders.Uniform;
// import net.minecraft.client.renderer.CompiledShaderProgram;

public class CustomShaderManager {

    private Object positionMultiTexShader;
    private Uniform positionMultiTexShaderTextureCountUniform;

    public Object getPositionMultiTexShader() {
        return positionMultiTexShader;
    }

    public void registerShaderInstance(Object shaderInstance) {
        this.positionMultiTexShader = shaderInstance;
        this.positionMultiTexShaderTextureCountUniform = ((net.minecraft.client.renderer.CompiledShaderProgram) shaderInstance).getUniform("texcount");
    }

    public Uniform getPositionMultiTexTextureCountUniform() {
        return positionMultiTexShaderTextureCountUniform;
    }

}
