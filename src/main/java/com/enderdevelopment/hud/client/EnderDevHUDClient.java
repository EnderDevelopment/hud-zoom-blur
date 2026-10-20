package com.enderdevelopment.hud.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class EnderDevHUDClient implements ClientModInitializer {
    public static KeyBinding zoomKeyBinding;

    @Override
    public void onInitializeClient() {
        zoomKeyBinding = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.enderdev_hud.zoom",
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_C,
                "category.enderdev_hud.hud"
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (zoomKeyBinding.wasPressed()) {
                // Handle zoom key press
            }
        });
    }
}