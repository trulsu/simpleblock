package net.nittini.simpleblock;

import net.nittini.simpleblock.util.Reference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.nittini.simpleblock.proxy.*;

@Mod(modid=Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class SimpleBlock {
    @Instance
    public static SimpleBlock instance;

    @SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS,serverSide=Reference.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public static void preInit(FMLPreInitializationEvent event) {

    }

    @EventHandler
    public static void init(FMLInitializationEvent event) {

    }

    @EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        
    }
}