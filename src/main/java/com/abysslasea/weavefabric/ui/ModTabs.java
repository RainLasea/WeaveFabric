package com.abysslasea.weavefabric.ui;

import com.abysslasea.weavefabric.WeaveFabric;
import com.abysslasea.weavefabric.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB , WeaveFabric.MODID);
    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WEAVE_FABRIC =
            CREATIVE_TAB.register("weavefabric", () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.weavefabric"))
                    .withTabsBefore(CreativeModeTabs.COMBAT)
                    .icon(() -> ModItems.comb.get().getDefaultInstance())
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.comb.get());
                    }).build());
}
