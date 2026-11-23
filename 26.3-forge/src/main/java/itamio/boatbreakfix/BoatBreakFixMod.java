package itamio.boatbreakfix;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Boat Break Fix — unofficial 26.3 port (Forge). */
@Mod(BoatBreakFixMod.MOD_ID)
public class BoatBreakFixMod {
    public static final String MOD_ID = "boatbreakfix263";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BoatBreakFixMod() {
        LOGGER.info("[Boat Break Fix] initialized on Minecraft 26.3 (Forge)");
    }
}
