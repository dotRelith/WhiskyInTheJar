package dot.relith.whisky_in_the_jar;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WhiskyInTheJarMod implements ModInitializer {
	public static final String MOD_ID = "whisky_in_the_jar";
	public static final Logger LOGGER = LoggerFactory.getLogger("whisky_in_the_jar");

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	}
}