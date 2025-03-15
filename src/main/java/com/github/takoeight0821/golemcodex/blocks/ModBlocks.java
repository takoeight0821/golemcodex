package com.github.takoeight0821.golemcodex.blocks;

import com.github.takoeight0821.golemcodex.GolemCodexMod;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(GolemCodexMod.MODID);

    public static final DeferredBlock<Block> LIVING_CLAY_BLOCK = BLOCKS.registerSimpleBlock("living_clay_block",
            // This block behaves like a clay block
            BlockBehaviour.Properties.ofFullCopy(Blocks.CLAY));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
