package net.l7ghtbringer.edenmod.datagen;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.l7ghtbringer.edenmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, EdenMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {


        withExistingParent(ModItems.SWAMPHAG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GRAVEHAG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.BURRIER_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.WIGHT_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.SHROOMHAG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.CRIMSONHAG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.WARPEDHAG_SPAWN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));



        simpleItem(ModItems.AMETHYST);
        simpleItem(ModItems.AMETHYST_FLAWLESS);
        simpleItem(ModItems.SAPPHIRE_SHARD);
        simpleItem(ModItems.SAPPHIRE);
        simpleItem(ModItems.SAPPHIRE_FLAWLESS);
        simpleItem(ModItems.RUBY_SHARD);
        simpleItem(ModItems.RUBY);
        simpleItem(ModItems.RUBY_FLAWLESS);
        simpleItem(ModItems.JADE_SHARD);
        simpleItem(ModItems.JADE);
        simpleItem(ModItems.JADE_FLAWLESS);
        simpleItem(ModItems.ONYX_SHARD);
        simpleItem(ModItems.ONYX);
        simpleItem(ModItems.ONYX_FLAWLESS);
        simpleItem(ModItems.TOPAZ_SHARD);
        simpleItem(ModItems.TOPAZ);
        simpleItem(ModItems.TOPAZ_FLAWLESS);
        simpleItem(ModItems.LOTUSSTONE);
        simpleItem(ModItems.SOULSTONE);
        simpleItem(ModItems.SOULSTONE_FLAWLESS);

        simpleItem(ModItems.RAW_GLOOMIUM);
        simpleItem(ModItems.GLOOMIUM_INGOT);
        simpleItem(ModItems.RAW_TERRASTEEL);
        simpleItem(ModItems.TERRASTEEL_INGOT);
        simpleItem(ModItems.RAW_INFERNIUM);
        simpleItem(ModItems.INFERNIUM_INGOT);
        simpleItem(ModItems.RAW_NEBULYTE);
        simpleItem(ModItems.NEBULYTE_INGOT);
        simpleItem(ModItems.RAW_ASTRALIUM);
        simpleItem(ModItems.ASTRALIUM_INGOT);
        simpleItem(ModItems.RAW_CELESTIUM);
        simpleItem(ModItems.CELESTIUM_INGOT);
        simpleItem(ModItems.SOULFORGED_NETHERITE);
        simpleItem(ModItems.VOIDSTEEL_INGOT);
        simpleItem(ModItems.VOIDSTEEL_UPGRADE);

        simpleItem(ModItems.BASILISK_SCALE_SILVER);
        simpleItem(ModItems.BASILISK_SCALE_GREEN);
        simpleItem(ModItems.BASILISK_SCALE_GOLD);
        simpleItem(ModItems.BASILISK_SCALE_BLACK);
        simpleItem(ModItems.ENT_PLATES);
        simpleItem(ModItems.FOREST_HEART);
        simpleItem(ModItems.GOLEM_HEART);
        simpleItem(ModItems.GRIFFIN_FALCON_FEATHER);
        simpleItem(ModItems.GRIFFIN_ARCH_FEATHER);
        simpleItem(ModItems.HARPY_FEATHER_GREEN);
        simpleItem(ModItems.HARPY_FEATHER_BLACK);
        simpleItem(ModItems.MONSTER_FEATHER);
        simpleItem(ModItems.MONSTER_TEETH);
        simpleItem(ModItems.VENOMOUS_TEETH);
        simpleItem(ModItems.SCORPION_CHITIN_RED);
        simpleItem(ModItems.SCORPION_CHITIN_DESERT);
        simpleItem(ModItems.SCORPION_CHITIN_BLACK);
        simpleItem(ModItems.SCORPION_STING_RED);
        simpleItem(ModItems.SCORPION_STING_DESERT);
        simpleItem(ModItems.SCORPION_STING_BLACK);
        simpleItem(ModItems.WYVERN_SCALE_RED);
        simpleItem(ModItems.WYVERN_SCALE_ROYAL);
        simpleItem(ModItems.WYVERN_SCALE_COPPER);
        simpleItem(ModItems.WYVERN_SCALE_BLACK);
        simpleItem(ModItems.WYVERN_SCALE_GRAY);
        simpleItem(ModItems.WYVERN_SCALE_BLUE);
        simpleItem(ModItems.WYVERN_SCALE_WHITE);
        simpleItem(ModItems.WYVERN_SCALE_GREEN);
        simpleItem(ModItems.GLOOMIUM_HELMET);
        simpleItem(ModItems.GLOOMIUM_CHESTPLATE);
        simpleItem(ModItems.GLOOMIUM_LEGGINGS);
        simpleItem(ModItems.GLOOMIUM_BOOTS);
        simpleItem(ModItems.TERRASTEEL_HELMET);
        simpleItem(ModItems.TERRASTEEL_CHESTPLATE);
        simpleItem(ModItems.TERRASTEEL_LEGGINGS);
        simpleItem(ModItems.TERRASTEEL_BOOTS);
        simpleItem(ModItems.INFERNIUM_HELMET);
        simpleItem(ModItems.INFERNIUM_CHESTPLATE);
        simpleItem(ModItems.INFERNIUM_LEGGINGS);
        simpleItem(ModItems.INFERNIUM_BOOTS);
        simpleItem(ModItems.NEBULYTE_HELMET);
        simpleItem(ModItems.NEBULYTE_CHESTPLATE);
        simpleItem(ModItems.NEBULYTE_LEGGINGS);
        simpleItem(ModItems.NEBULYTE_BOOTS);
        simpleItem(ModItems.SOULFORGED_HELMET);
        simpleItem(ModItems.SOULFORGED_CHESTPLATE);
        simpleItem(ModItems.SOULFORGED_LEGGINGS);
        simpleItem(ModItems.SOULFORGED_BOOTS);
        simpleItem(ModItems.EMERALD_HELMET);
        simpleItem(ModItems.EMERALD_CHESTPLATE);
        simpleItem(ModItems.EMERALD_LEGGINGS);
        simpleItem(ModItems.EMERALD_BOOTS);
        simpleItem(ModItems.ENT_HELMET);
        simpleItem(ModItems.ENT_CHESTPLATE);
        simpleItem(ModItems.ENT_LEGGINGS);
        simpleItem(ModItems.ENT_BOOTS);
        simpleItem(ModItems.REDWYVERN_HELMET);
        simpleItem(ModItems.REDWYVERN_CHESTPLATE);
        simpleItem(ModItems.REDWYVERN_LEGGINGS);
        simpleItem(ModItems.REDWYVERN_BOOTS);
        simpleItem(ModItems.ROYALWYVERN_HELMET);
        simpleItem(ModItems.ROYALWYVERN_CHESTPLATE);
        simpleItem(ModItems.ROYALWYVERN_LEGGINGS);
        simpleItem(ModItems.ROYALWYVERN_BOOTS);
        simpleItem(ModItems.COPPERWYVERN_HELMET);
        simpleItem(ModItems.COPPERWYVERN_CHESTPLATE);
        simpleItem(ModItems.COPPERWYVERN_LEGGINGS);
        simpleItem(ModItems.COPPERWYVERN_BOOTS);
        simpleItem(ModItems.FORKTAIL_HELMET);
        simpleItem(ModItems.FORKTAIL_CHESTPLATE);
        simpleItem(ModItems.FORKTAIL_LEGGINGS);
        simpleItem(ModItems.FORKTAIL_BOOTS);
        simpleItem(ModItems.RAZORBACK_HELMET);
        simpleItem(ModItems.RAZORBACK_CHESTPLATE);
        simpleItem(ModItems.RAZORBACK_LEGGINGS);
        simpleItem(ModItems.RAZORBACK_BOOTS);
        simpleItem(ModItems.FROSTTAIL_HELMET);
        simpleItem(ModItems.FROSTTAIL_CHESTPLATE);
        simpleItem(ModItems.FROSTTAIL_LEGGINGS);
        simpleItem(ModItems.FROSTTAIL_BOOTS);
        simpleItem(ModItems.FROSTTAILBLUE_HELMET);
        simpleItem(ModItems.FROSTTAILBLUE_CHESTPLATE);
        simpleItem(ModItems.FROSTTAILBLUE_LEGGINGS);
        simpleItem(ModItems.FROSTTAILBLUE_BOOTS);
        simpleItem(ModItems.BASMU_HELMET);
        simpleItem(ModItems.BASMU_CHESTPLATE);
        simpleItem(ModItems.BASMU_LEGGINGS);
        simpleItem(ModItems.BASMU_BOOTS);
        simpleItem(ModItems.SILVERBASILISK_HELMET);
        simpleItem(ModItems.SILVERBASILISK_CHESTPLATE);
        simpleItem(ModItems.SILVERBASILISK_LEGGINGS);
        simpleItem(ModItems.SILVERBASILISK_BOOTS);
        simpleItem(ModItems.GREENBASILISK_HELMET);
        simpleItem(ModItems.GREENBASILISK_CHESTPLATE);
        simpleItem(ModItems.GREENBASILISK_LEGGINGS);
        simpleItem(ModItems.GREENBASILISK_BOOTS);
        //simpleItem(ModItems._HELMET);
        //simpleItem(ModItems._CHESTPLATE);
        //simpleItem(ModItems._LEGGINGS);
        //simpleItem(ModItems._BOOTS);

        simpleItem(ModItems.COOKED_WYVERN);
        simpleItem(ModItems.RAW_WYVERN);
        handheldItem(ModItems.BASILISK_MEAT);


        handheldItem(ModItems.GLOOMIUM_PICKAXE);
        handheldItem(ModItems.GLOOMIUM_AXE);
        handheldItem(ModItems.GLOOMIUM_SHOVEL);
        handheldItem(ModItems.GLOOMIUM_HOE);


        handheldItem(ModItems.TERRASTEEL_PICKAXE);
        handheldItem(ModItems.TERRASTEEL_AXE);
        handheldItem(ModItems.TERRASTEEL_SHOVEL);
        handheldItem(ModItems.TERRASTEEL_HOE);

        handheldItem(ModItems.INFERNIUM_PICKAXE);
        handheldItem(ModItems.INFERNIUM_AXE);
        handheldItem(ModItems.INFERNIUM_SHOVEL);
        handheldItem(ModItems.INFERNIUM_HOE);


        handheldItem(ModItems.NEBULYTE_PICKAXE);
        handheldItem(ModItems.NEBULYTE_AXE);
        handheldItem(ModItems.NEBULYTE_SHOVEL);
        handheldItem(ModItems.NEBULYTE_HOE);

        //handheldItem(ModItems.SOULFORGED_SWORD);
        //handheldItem(ModItems.SOULFORGED_PICKAXE);
        //handheldItem(ModItems.SOULFORGED_AXE);
        //handheldItem(ModItems.SOULFORGED_SHOVEL);
        //handheldItem(ModItems.SOULFORGED_HOE);


        handheldItem(ModItems.ASTRALIUM_PICKAXE);
        handheldItem(ModItems.ASTRALIUM_AXE);
        handheldItem(ModItems.ASTRALIUM_SHOVEL);
        handheldItem(ModItems.ASTRALIUM_HOE);


        handheldItem(ModItems.CELESTIUM_PICKAXE);
        handheldItem(ModItems.CELESTIUM_AXE);
        handheldItem(ModItems.CELESTIUM_SHOVEL);
        handheldItem(ModItems.CELESTIUM_HOE);


        handheldItem(ModItems.VOIDSTEEL_PICKAXE);
        handheldItem(ModItems.VOIDSTEEL_AXE);
        handheldItem(ModItems.VOIDSTEEL_SHOVEL);
        handheldItem(ModItems.VOIDSTEEL_HOE);

        simpleBlockItem(ModBlocks.GREATWOOD_DOOR);
        fenceItem(ModBlocks.GREATWOOD_FENCE, ModBlocks.GREATWOOD_PLANKS);
        buttonItem(ModBlocks.GREATWOOD_BUTTON, ModBlocks.GREATWOOD_PLANKS);
        evenSimplerBlockItem(ModBlocks.GREATWOOD_STAIRS);
        evenSimplerBlockItem(ModBlocks.GREATWOOD_SLAB);
        evenSimplerBlockItem(ModBlocks.GREATWOOD_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.GREATWOOD_FENCE_GATE);
        trapdoorItem(ModBlocks.GREATWOOD_TRAPDOOR);
        simpleItem(ModItems.GREATWOOD_SIGN);
        simpleItem(ModItems.GREATWOOD_HANGING_SIGN);



        wallItem(ModBlocks.MARBLE_WALL, ModBlocks.MARBLE);
        evenSimplerBlockItem(ModBlocks.MARBLE_STAIRS);
        evenSimplerBlockItem(ModBlocks.MARBLE_SLAB);
        wallItem(ModBlocks.MOSSY_MARBLE_BRICKS_WALL, ModBlocks.MOSSY_MARBLE_BRICKS);
        evenSimplerBlockItem(ModBlocks.MOSSY_MARBLE_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MOSSY_MARBLE_BRICKS_SLAB);
        wallItem(ModBlocks.MARBLE_BRICKS_WALL, ModBlocks.MARBLE_BRICKS);
        evenSimplerBlockItem(ModBlocks.MARBLE_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.MARBLE_BRICKS_SLAB);
        wallItem(ModBlocks.CRACKED_MARBLE_BRICKS_WALL, ModBlocks.CRACKED_MARBLE_BRICKS);
        evenSimplerBlockItem(ModBlocks.CRACKED_MARBLE_BRICK_STAIRS);
        evenSimplerBlockItem(ModBlocks.CRACKED_MARBLE_BRICKS_SLAB);
        wallItem(ModBlocks.MARBLE_BRICKS_TILES_WALL, ModBlocks.MARBLE_BRICKS_TILES);
        evenSimplerBlockItem(ModBlocks.MARBLE_BRICK_TILES_STAIRS);
        evenSimplerBlockItem(ModBlocks.MARBLE_BRICKS_TILES_SLAB);






    //ITEM MODEL BUILDER
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EdenMod.MOD_ID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(EdenMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(EdenMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(EdenMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(EdenMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(EdenMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(EdenMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
