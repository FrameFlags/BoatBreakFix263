package itamio.boatbreakfix;

import com.mojang.logging.LogUtils;
import net.minecraftforge.fml.common.Mod;
import org.slf4j.Logger;

/** Boat Break Fix — unofficial 1.20.1 port (Forge). */
@Mod(BoatBreakFixMod.MOD_ID)
public class BoatBreakFixMod {
    public static final String MOD_ID = "boatbreakfix263_1201";
    public static final Logger LOGGER = LogUtils.getLogger();

    public BoatBreakFixMod() {
        LOGGER.info("[Boat Break Fix] initialized on Minecraft 1.20.1 (Forge)");
    }
}
