package net.l7ghtbringer.edenmod.datagen;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, EdenMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.ASTRALIUM_ORE.get(),
                        ModBlocks.ASTRALIUM_BLOCK.get(),
                        ModBlocks.CELESTIUM_ORE.get(),
                        ModBlocks.CELESTIUM_BLOCK.get(),
                        ModBlocks.GLOOMIUM_BLOCK.get(),
                        ModBlocks.GLOOMIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_GLOOMIUM_ORE.get(),
                        ModBlocks.TERRASTEEL_BLOCK.get(),
                        ModBlocks.TERRASTEEL_ORE.get(),
                        ModBlocks.DEEPSLATE_TERRASTEEL_ORE.get(),
                        ModBlocks.INFERNIUM_BLOCK.get(),
                        ModBlocks.INFERNIUM_ORE.get(),
                        ModBlocks.NEBULYTE_BLOCK.get(),
                        ModBlocks.NEBULYTE_ORE.get(),
                        ModBlocks.VOIDSTEEL_BLOCK.get()





                );

        this.tag(BlockTags.MINEABLE_WITH_SHOVEL)
                .add(ModBlocks.SOULSTONE_ORE.get()


                );





        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GLOOMIUM_BLOCK.get(),
                        ModBlocks.GLOOMIUM_ORE.get(),
                        ModBlocks.DEEPSLATE_GLOOMIUM_ORE.get(),
                        ModBlocks.TERRASTEEL_BLOCK.get(),
                        ModBlocks.TERRASTEEL_ORE.get(),
                        ModBlocks.DEEPSLATE_TERRASTEEL_ORE.get()


                );

        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.INFERNIUM_BLOCK.get(),
                        ModBlocks.INFERNIUM_ORE.get(),
                        ModBlocks.NEBULYTE_ORE.get(),
                        ModBlocks.NEBULYTE_BLOCK.get()


                );

        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.INFERNIUM_BLOCK.get(),
                        ModBlocks.ASTRALIUM_BLOCK.get(),
                        ModBlocks.ASTRALIUM_ORE.get(),
                        ModBlocks.CELESTIUM_BLOCK.get(),
                        ModBlocks.CELESTIUM_ORE.get(),
                        ModBlocks.VOIDSTEEL_BLOCK.get()


                );

        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.GREATWOOD_LOG.get())
                .add(ModBlocks.GREATWOOD_WOOD.get())
                .add(ModBlocks.GREATWOOD_LOG_STRIPPED.get())
                .add(ModBlocks.GREATWOOD_WOOD_STRIPPED.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.GREATWOOD_PLANKS.get());



        this.tag(BlockTags.FENCES)
                .add(ModBlocks.GREATWOOD_FENCE.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.GREATWOOD_FENCE_GATE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.MARBLE_WALL.get())
                .add(ModBlocks.MARBLE_BRICKS_WALL.get())
                .add(ModBlocks.MOSSY_MARBLE_BRICKS_WALL.get())
                .add(ModBlocks.CRACKED_MARBLE_BRICKS_WALL.get())
                .add(ModBlocks.MARBLE_BRICKS_TILES_WALL.get())
        ;



    }
}

