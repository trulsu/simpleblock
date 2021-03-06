package net.nittini.simpleblock;

import net.nittini.simpleblock.util.Reference;
import net.nittini.simpleblock.world.ModWorldGen;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.nittini.simpleblock.init.ModRecipes;
import net.nittini.simpleblock.proxy.*;

@Mod(modid=Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class SimpleBlock {
    @Instance
    public static SimpleBlock instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new ModWorldGen(), 3);
    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {
        ModRecipes.init();
    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        
    }
}