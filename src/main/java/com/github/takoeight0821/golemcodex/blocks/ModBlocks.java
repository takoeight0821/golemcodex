package com.github.takoeight0821.golemcodex.blocks;

import com.github.takoeight0821.golemcodex.GolemCodexMod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GolemCodexMod.MODID);

    public static final DeferredBlock<Block> EXAMPLE_BLOCK = BLOCKS.registerSimpleBlock("example_block",
            BlockBehaviour.Properties.of().mapColor(MapColor.STONE));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
