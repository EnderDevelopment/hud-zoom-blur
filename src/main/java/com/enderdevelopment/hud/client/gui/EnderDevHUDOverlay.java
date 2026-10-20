package com.enderdevelopment.hud.client.gui;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class EnderDevHUDOverlay {
    private static final Identifier TEXTURE = new Identifier("enderdev_hud", "textures/gui/hud.png");

    public static void render(DrawContext context, float tickDelta) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.options.hudHidden) {
            return;
        }

        int width = client.getWindow().getScaledWidth();
        int height = client.getWindow().getScaledHeight();

        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
        RenderSystem.setShaderTexture(0, TEXTURE);

                // Render keystrokes
        renderKeystrokes(context, width, height);
        
        // Render CPS counter
        renderCPS(context, width, height);
        
        // Render mouse movement indicator
        renderMouseMovement(context, width, height);
    }
}