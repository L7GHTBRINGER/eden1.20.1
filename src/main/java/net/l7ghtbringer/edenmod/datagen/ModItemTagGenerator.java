package net.l7ghtbringer.edenmod.datagen;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, EdenMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.GREATWOOD_LOG.get().asItem())
                .add(ModBlocks.GREATWOOD_WOOD.get().asItem())
                .add(ModBlocks.GREATWOOD_LOG_STRIPPED.get().asItem())
                .add(ModBlocks.GREATWOOD_WOOD_STRIPPED.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.GREATWOOD_PLANKS.get().asItem());

    }
}
