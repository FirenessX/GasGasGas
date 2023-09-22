package net.gasmod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GasMod implements ModInitializer {
	public static String MOD_ID = "gasmod";
    public static final Logger LOGGER = LoggerFactory.getLogger("gasmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}