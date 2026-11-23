package itamio.boatbreakfix;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/** Boat Break Fix — unofficial 26.3 port (NeoForge). */
@Mod(BoatBreakFixNeoForgeMod.MOD_ID)
public class BoatBreakFixNeoForgeMod {
    public static final String MOD_ID = "boatbreakfix263";
    public static final Logger LOGGER = LoggerFactory.getLogger("Boat Break Fix");

    public BoatBreakFixNeoForgeMod(IEventBus modEventBus, ModContainer modContainer) {
        LOGGER.info("[Boat Break Fix] initialized on Minecraft 26.3 (NeoForge)");
    }
}
