package net.l7ghtbringer.edenmod.datagen;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, EdenMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.GLOOMIUM_BLOCK);
        blockWithItem(ModBlocks.TERRASTEEL_BLOCK);
        blockWithItem(ModBlocks.INFERNIUM_BLOCK);
        blockWithItem(ModBlocks.NEBULYTE_BLOCK);
        blockWithItem(ModBlocks.ASTRALIUM_BLOCK);
        blockWithItem(ModBlocks.CELESTIUM_BLOCK);
        blockWithItem(ModBlocks.VOIDSTEEL_BLOCK);

        blockWithItem(ModBlocks.GLOOMIUM_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_GLOOMIUM_ORE);
        blockWithItem(ModBlocks.TERRASTEEL_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TERRASTEEL_ORE);
        blockWithItem(ModBlocks.INFERNIUM_ORE);
        blockWithItem(ModBlocks.NEBULYTE_ORE);
        blockWithItem(ModBlocks.ASTRALIUM_ORE);
        blockWithItem(ModBlocks.CELESTIUM_ORE);
        blockWithItem(ModBlocks.SOULSTONE_ORE);

        logBlock(((RotatedPillarBlock) ModBlocks.GREATWOOD_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.GREATWOOD_WOOD.get()), blockTexture(ModBlocks.GREATWOOD_LOG.get()), blockTexture(ModBlocks.GREATWOOD_LOG.get()));

        axisBlock(((RotatedPillarBlock) ModBlocks.GREATWOOD_LOG_STRIPPED.get()), blockTexture(ModBlocks.GREATWOOD_LOG_STRIPPED.get()),
                new ResourceLocation(EdenMod.MOD_ID, "block/greatwood_log_top_stripped"));
        axisBlock(((RotatedPillarBlock) ModBlocks.GREATWOOD_WOOD_STRIPPED.get()), blockTexture(ModBlocks.GREATWOOD_LOG_STRIPPED.get()),
                blockTexture(ModBlocks.GREATWOOD_LOG.get()));

        blockItem(ModBlocks.GREATWOOD_LOG);
        blockItem(ModBlocks.GREATWOOD_WOOD);
        blockItem(ModBlocks.GREATWOOD_LOG_STRIPPED);
        blockItem(ModBlocks.GREATWOOD_WOOD_STRIPPED);
        blockWithItem(ModBlocks.GREATWOOD_PLANKS);
        leavesBlock(ModBlocks.GREATWOOD_LEAVES);
        stairsBlock(((StairBlock) ModBlocks.GREATWOOD_STAIRS.get()), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.GREATWOOD_SLAB.get()), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.GREATWOOD_BUTTON.get()), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.GREATWOOD_PRESSURE_PLATE.get()), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.GREATWOOD_FENCE.get()), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.GREATWOOD_FENCE_GATE.get()), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.GREATWOOD_DOOR.get()), modLoc("block/greatwood_door_bottom"), modLoc("block/greatwood_door_top"), "cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.GREATWOOD_TRAPDOOR.get()), modLoc("block/greatwood_trapdoor"), true, "cutout");

        signBlock(((StandingSignBlock) ModBlocks.GREATWOOD_SIGN.get()), ((WallSignBlock) ModBlocks.GREATWOOD_WALL_SIGN.get()),
                blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));
        hangingSignBlock(ModBlocks.GREATWOOD_HANGING_SIGN.get(), ModBlocks.GREATWOOD_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.GREATWOOD_PLANKS.get()));





        buttonBlock(((ButtonBlock) ModBlocks.MARBLE_BUTTON.get()), blockTexture(ModBlocks.MARBLE.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.MARBLE_PRESSURE_PLATE.get()), blockTexture(ModBlocks.MARBLE.get()));

        blockWithItem(ModBlocks.MARBLE);
        wallBlock(((WallBlock) ModBlocks.MARBLE_WALL.get()), blockTexture(ModBlocks.MARBLE.get()));
        stairsBlock(((StairBlock) ModBlocks.MARBLE_STAIRS.get()), blockTexture(ModBlocks.MARBLE.get()));
        slabBlock(((SlabBlock) ModBlocks.MARBLE_SLAB.get()), blockTexture(ModBlocks.MARBLE.get()), blockTexture(ModBlocks.MARBLE.get()));

        blockWithItem(ModBlocks.MARBLE_BRICKS);
        wallBlock(((WallBlock) ModBlocks.MARBLE_BRICKS_WALL.get()), blockTexture(ModBlocks.MARBLE_BRICKS.get()));
        stairsBlock(((StairBlock) ModBlocks.MARBLE_BRICK_STAIRS.get()), blockTexture(ModBlocks.MARBLE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.MARBLE_BRICKS_SLAB.get()), blockTexture(ModBlocks.MARBLE_BRICKS.get()), blockTexture(ModBlocks.MARBLE_BRICKS.get()));

        blockWithItem(ModBlocks.MOSSY_MARBLE_BRICKS);
        wallBlock(((WallBlock) ModBlocks.MOSSY_MARBLE_BRICKS_WALL.get()), blockTexture(ModBlocks.MOSSY_MARBLE_BRICKS.get()));
        stairsBlock(((StairBlock) ModBlocks.MOSSY_MARBLE_BRICK_STAIRS.get()), blockTexture(ModBlocks.MOSSY_MARBLE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.MOSSY_MARBLE_BRICKS_SLAB.get()), blockTexture(ModBlocks.MOSSY_MARBLE_BRICKS.get()), blockTexture(ModBlocks.MOSSY_MARBLE_BRICKS.get()));

        blockWithItem(ModBlocks.CRACKED_MARBLE_BRICKS);
        wallBlock(((WallBlock) ModBlocks.CRACKED_MARBLE_BRICKS_WALL.get()), blockTexture(ModBlocks.CRACKED_MARBLE_BRICKS.get()));
        stairsBlock(((StairBlock) ModBlocks.CRACKED_MARBLE_BRICK_STAIRS.get()), blockTexture(ModBlocks.CRACKED_MARBLE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.CRACKED_MARBLE_BRICKS_SLAB.get()), blockTexture(ModBlocks.CRACKED_MARBLE_BRICKS.get()), blockTexture(ModBlocks.CRACKED_MARBLE_BRICKS.get()));

        blockWithItem(ModBlocks.MARBLE_BRICKS_TILES);
        wallBlock(((WallBlock) ModBlocks.MARBLE_BRICKS_TILES_WALL.get()), blockTexture(ModBlocks.MARBLE_BRICKS_TILES.get()));
        stairsBlock(((StairBlock) ModBlocks.MARBLE_BRICK_TILES_STAIRS.get()), blockTexture(ModBlocks.MARBLE_BRICKS_TILES.get()));
        slabBlock(((SlabBlock) ModBlocks.MARBLE_BRICKS_TILES_SLAB.get()), blockTexture(ModBlocks.MARBLE_BRICKS_TILES.get()), blockTexture(ModBlocks.MARBLE_BRICKS_TILES.get()));





    }




    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }
    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }


    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), new ResourceLocation("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(EdenMod.MOD_ID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()) {
        });

    }
}
