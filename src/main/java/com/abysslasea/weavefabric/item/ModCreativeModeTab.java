package com.abysslasea.weavefabric.item;

import com.abysslasea.weavefabric.WeaveFabric;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeModeTab {
    public static DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WeaveFabric.MODID);

    public static final DeferredHolder<CreativeModeTab,CreativeModeTab> WEAVEFABRIC_TAB = CREATIVE_MODE_TABS.register("weavefabric_tab",() -> {
      CreativeModeTab.Builder builder = CreativeModeTab.builder();

      builder.displayItems((itemDisplayParameters, output) -> {

      });
        return null;
    });
}