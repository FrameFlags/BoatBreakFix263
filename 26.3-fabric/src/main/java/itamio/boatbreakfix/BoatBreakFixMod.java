package itamio.boatbreakfix;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Boat Break Fix — unofficial 26.3 port (Fabric). */
public class BoatBreakFixMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Boat Break Fix");

    @Override
    public void onInitialize() {
        LOGGER.info("[Boat Break Fix] initialized on Minecraft 26.3 (Fabric)");
    }
}
