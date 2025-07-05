package dev.tr7zw.exordium.components.vanilla;

import java.util.Objects;

import dev.tr7zw.exordium.components.BufferComponent;
import dev.tr7zw.exordium.util.ScoreboardHelper;
import dev.tr7zw.exordium.util.ScoreboardHelper.ScoreboardState;
import lombok.Getter;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;

public class ScoreboardComponent implements BufferComponent<Void> {

    private static final Minecraft minecraft = Minecraft.getInstance();
    private static final ResourceLocation id = new ResourceLocation("minecraft", "scoreboard");

    
    private String scoreboardState = null;

    @Override
    public void captureState(Void context) {
        scoreboardState = "" + ScoreboardHelper.getScoreboardData();
    }

    @Override
    public boolean hasChanged(Void context) {
        ScoreboardState cur = ScoreboardHelper.getScoreboardData();
        return !Objects.equals(scoreboardState, "" + cur); // dirty workaround
    }

}
