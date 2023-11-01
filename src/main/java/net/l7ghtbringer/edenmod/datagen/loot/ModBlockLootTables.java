package net.l7ghtbringer.edenmod.datagen.loot;


import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.l7ghtbringer.edenmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.GLOOMIUM_BLOCK.get());
        this.dropSelf(ModBlocks.TERRASTEEL_BLOCK.get());
        this.dropSelf(ModBlocks.INFERNIUM_BLOCK.get());
        this.dropSelf(ModBlocks.NEBULYTE_BLOCK.get());
        this.dropSelf(ModBlocks.ASTRALIUM_BLOCK.get());
        this.dropSelf(ModBlocks.CELESTIUM_BLOCK.get());
        this.dropSelf(ModBlocks.VOIDSTEEL_BLOCK.get());


        //ORES

        this.add(ModBlocks.GLOOMIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.GLOOMIUM_ORE.get(), ModItems.RAW_GLOOMIUM.get()));
        this.add(ModBlocks.DEEPSLATE_GLOOMIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_GLOOMIUM_ORE.get(), ModItems.RAW_GLOOMIUM.get()));

        this.add(ModBlocks.TERRASTEEL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.TERRASTEEL_ORE.get(), ModItems.RAW_TERRASTEEL.get()));
        this.add(ModBlocks.DEEPSLATE_TERRASTEEL_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DEEPSLATE_TERRASTEEL_ORE.get(), ModItems.RAW_TERRASTEEL.get()));

        this.add(ModBlocks.INFERNIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.INFERNIUM_ORE.get(), ModItems.RAW_INFERNIUM.get()));

        this.add(ModBlocks.NEBULYTE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.NEBULYTE_ORE.get(), ModItems.RAW_NEBULYTE.get()));

        this.add(ModBlocks.ASTRALIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.ASTRALIUM_ORE.get(), ModItems.RAW_ASTRALIUM.get()));

        this.add(ModBlocks.CELESTIUM_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.CELESTIUM_ORE.get(), ModItems.RAW_CELESTIUM.get()));

        this.add(ModBlocks.SOULSTONE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.SOULSTONE_ORE.get(), ModItems.SOULSTONE.get()));

        //WOOD
        this.dropSelf(ModBlocks.GREATWOOD_LOG.get());
        this.dropSelf(ModBlocks.GREATWOOD_WOOD.get());
        this.dropSelf(ModBlocks.GREATWOOD_LOG_STRIPPED.get());
        this.dropSelf(ModBlocks.GREATWOOD_WOOD_STRIPPED.get());
        this.dropSelf(ModBlocks.GREATWOOD_PLANKS.get());
        this.dropSelf(ModBlocks.GREATWOOD_STAIRS.get());
        this.dropSelf(ModBlocks.GREATWOOD_BUTTON.get());
        this.dropSelf(ModBlocks.GREATWOOD_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.GREATWOOD_FENCE.get());
        this.dropSelf(ModBlocks.GREATWOOD_FENCE_GATE.get());
        this.dropSelf(ModBlocks.GREATWOOD_TRAPDOOR.get());
        this.add(ModBlocks.GREATWOOD_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.GREATWOOD_SLAB.get()));
        this.add(ModBlocks.GREATWOOD_DOOR.get(),
                block -> createDoorTable(ModBlocks.GREATWOOD_DOOR.get()));
        this.add(ModBlocks.GREATWOOD_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.TERRASTEEL_BLOCK.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.add(ModBlocks.GREATWOOD_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREATWOOD_SIGN.get()));
        this.add(ModBlocks.GREATWOOD_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREATWOOD_SIGN.get()));

        this.add(ModBlocks.GREATWOOD_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREATWOOD_HANGING_SIGN.get()));
        this.add(ModBlocks.GREATWOOD_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.GREATWOOD_HANGING_SIGN.get()));


        //ROCKS
        this.dropSelf(ModBlocks.MARBLE_BUTTON.get());
        this.dropSelf(ModBlocks.MARBLE_PRESSURE_PLATE.get());

        this.dropSelf(ModBlocks.MARBLE.get());
        this.dropSelf(ModBlocks.MARBLE_WALL.get());
        this.dropSelf(ModBlocks.MARBLE_STAIRS.get());
        this.add(ModBlocks.MARBLE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MARBLE_SLAB.get()));

        this.dropSelf(ModBlocks.MARBLE_BRICKS.get());
        this.dropSelf(ModBlocks.MARBLE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.MARBLE_BRICK_STAIRS.get());
        this.add(ModBlocks.MARBLE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MARBLE_BRICKS_SLAB.get()));

        this.dropSelf(ModBlocks.MOSSY_MARBLE_BRICKS.get());
        this.dropSelf(ModBlocks.MOSSY_MARBLE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.MOSSY_MARBLE_BRICK_STAIRS.get());
        this.add(ModBlocks.MOSSY_MARBLE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MOSSY_MARBLE_BRICKS_SLAB.get()));

        this.dropSelf(ModBlocks.CRACKED_MARBLE_BRICKS.get());
        this.dropSelf(ModBlocks.CRACKED_MARBLE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.CRACKED_MARBLE_BRICK_STAIRS.get());
        this.add(ModBlocks.CRACKED_MARBLE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.CRACKED_MARBLE_BRICKS_SLAB.get()));

        this.dropSelf(ModBlocks.MARBLE_BRICKS_TILES.get());
        this.dropSelf(ModBlocks.MARBLE_BRICKS_TILES_WALL.get());
        this.dropSelf(ModBlocks.MARBLE_BRICK_TILES_STAIRS.get());
        this.add(ModBlocks.MARBLE_BRICKS_TILES_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.MARBLE_BRICKS_TILES_SLAB.get()));



    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
