package com.euphony.swim_fix.neoforge;

import com.euphony.swim_fix.SwimFix;
import net.neoforged.fml.common.Mod;

@Mod(SwimFix.MOD_ID)
public final class SwimFixNeoForge {
    public SwimFixNeoForge() {
        // Run our common setup.
        SwimFix.init();
    }
}
