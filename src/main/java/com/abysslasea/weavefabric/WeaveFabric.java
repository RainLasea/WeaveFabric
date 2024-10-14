package com.abysslasea.weavefabric;

import com.abysslasea.weavefabric.item.custom.recipe.warpbobb.WarpBobbinRecipe;
import com.abysslasea.weavefabric.ui.ModTabs;
import org.slf4j.Logger;
import com.mojang.logging.LogUtils;
import com.abysslasea.weavefabric.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

import java.beans.EventHandler;

@Mod(WeaveFabric.MODID)
public class WeaveFabric
{
    public static final String MODID = "weavefabric";
    private static final Logger LOGGER = LogUtils.getLogger();

    public WeaveFabric(IEventBus modEventBus)
    {
        ModItems.register(modEventBus);
        ModTabs.CREATIVE_TAB.register(modEventBus);
    }
    private void commonSetup(final FMLCommonSetupEvent event) {
    }

     @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
     {

     }
}
