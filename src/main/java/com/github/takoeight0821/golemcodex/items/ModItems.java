package com.github.takoeight0821.golemcodex.items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.github.takoeight0821.golemcodex.GolemCodexMod;
import com.github.takoeight0821.golemcodex.blocks.ModBlocks;

public class ModItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(GolemCodexMod.MODID);

        public static final DeferredItem<BlockItem> LIVING_CLAY_BLOCK = ITEMS.registerSimpleBlockItem(
                        "living_clay_block",
                        ModBlocks.LIVING_CLAY_BLOCK);

        public static final DeferredItem<Item> LIVING_CLAY_BALL = ITEMS.registerSimpleItem("living_clay_ball",
                        new Item.Properties());

        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
                        .create(Registries.CREATIVE_MODE_TAB, GolemCodexMod.MODID);

        public static final DeferredHolder<CreativeModeTab, CreativeModeTab> GOLEM_CODEX_TAB = CREATIVE_MODE_TABS
                        .register("golemcodex_tab", () -> CreativeModeTab.builder()
                                        .title(Component.translatable("itemGroup.golemcodex"))
                                        .withTabsBefore(CreativeModeTabs.COMBAT)
                                        .icon(() -> ModItems.LIVING_CLAY_BALL.get().getDefaultInstance())
                                        .displayItems((parameters, output) -> {
                                                ITEMS.getEntries().forEach(entry -> output.accept(entry.get()));
                                        }).build());

        public static void register(IEventBus modEventBus) {
                ITEMS.register(modEventBus);

                CREATIVE_MODE_TABS.register(modEventBus);
        }
}
