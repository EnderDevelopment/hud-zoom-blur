package com.enderdevelopment.hud.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class EnderDevHUDConfigScreen extends Screen {
    protected EnderDevHUDConfigScreen(Text title) {
        super(title);
    }

    @Override
    protected void init() {
        super.init();
        this.addDrawableChild(new ButtonWidget.Builder(Text.literal("Close"), button -> this.close()) 
                .dimensions(this.width / 2 - 100, this.height / 2 + 50, 200, 20) 
                .build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        this.renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
    }
}