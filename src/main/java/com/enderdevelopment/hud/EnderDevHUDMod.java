package com.enderdevelopment.hud;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnderDevHUDMod implements ModInitializer {
    public static final String MOD_ID = "enderdev_hud";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing EnderDev HUD Mod");
    }
}