package net.somecatidk.tetweaker;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = TETweaker.MODID, name = TETweaker.NAME, version = TETweaker.VERSION)
public class TETweaker
{
    public static final String MODID = "tetweaker";
    public static final String NAME = "Thermla Expansion Tweaker";
    public static final String VERSION = "0.0.1.0";

    public static Logger LOGGER;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	LOGGER = event.getModLog();
    }
}
