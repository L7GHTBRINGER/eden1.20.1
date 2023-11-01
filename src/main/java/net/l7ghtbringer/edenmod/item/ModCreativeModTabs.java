package net.l7ghtbringer.edenmod.item;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, EdenMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> EDEN_SPAWN = CREATIVE_MODE_TABS.register("eden_spawn",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SWAMPHAG_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.eden_spawn"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.SWAMPHAG_SPAWN_EGG.get());
                        pOutput.accept(ModItems.GRAVEHAG_SPAWN_EGG.get());
                        pOutput.accept(ModItems.BURRIER_SPAWN_EGG.get());
                        pOutput.accept(ModItems.WIGHT_SPAWN_EGG.get());
                        pOutput.accept(ModItems.SHROOMHAG_SPAWN_EGG.get());
                        pOutput.accept(ModItems.CRIMSONHAG_SPAWN_EGG.get());
                        pOutput.accept(ModItems.WARPEDHAG_SPAWN_EGG.get());





                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EDEN_NATURAL = CREATIVE_MODE_TABS.register("eden_natural",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.GLOOMIUM_ORE.get()))
                    .title(Component.translatable("creativetab.eden_natural"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.GLOOMIUM_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_GLOOMIUM_ORE.get());
                        pOutput.accept(ModBlocks.TERRASTEEL_ORE.get());
                        pOutput.accept(ModBlocks.DEEPSLATE_TERRASTEEL_ORE.get());
                        pOutput.accept(ModBlocks.INFERNIUM_ORE.get());
                        pOutput.accept(ModBlocks.NEBULYTE_ORE.get());
                        pOutput.accept(ModBlocks.SOULSTONE_ORE.get());
                        pOutput.accept(ModBlocks.ASTRALIUM_ORE.get());
                        pOutput.accept(ModBlocks.CELESTIUM_ORE.get());

                        pOutput.accept(ModBlocks.GREATWOOD_LOG.get());
                        pOutput.accept(ModBlocks.GREATWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.GREATWOOD_LEAVES.get());

                        pOutput.accept(ModBlocks.MARBLE.get());




                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EDEN_BUILDING = CREATIVE_MODE_TABS.register("eden_building",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.NEBULYTE_BLOCK.get()))
                    .title(Component.translatable("creativetab.eden_building"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModBlocks.GLOOMIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.TERRASTEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.INFERNIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.NEBULYTE_BLOCK.get());
                        pOutput.accept(ModBlocks.ASTRALIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.CELESTIUM_BLOCK.get());
                        pOutput.accept(ModBlocks.VOIDSTEEL_BLOCK.get());

                        pOutput.accept(ModBlocks.GREATWOOD_LOG.get());
                        pOutput.accept(ModBlocks.GREATWOOD_LOG_STRIPPED.get());
                        pOutput.accept(ModBlocks.GREATWOOD_WOOD.get());
                        pOutput.accept(ModBlocks.GREATWOOD_WOOD_STRIPPED.get());
                        pOutput.accept(ModBlocks.GREATWOOD_PLANKS.get());
                        pOutput.accept(ModBlocks.GREATWOOD_STAIRS.get());
                        pOutput.accept(ModBlocks.GREATWOOD_SLAB.get());
                        pOutput.accept(ModBlocks.GREATWOOD_FENCE.get());
                        pOutput.accept(ModBlocks.GREATWOOD_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.GREATWOOD_DOOR.get());
                        pOutput.accept(ModBlocks.GREATWOOD_TRAPDOOR.get());
                        pOutput.accept(ModItems.GREATWOOD_SIGN.get());
                        pOutput.accept(ModItems.GREATWOOD_HANGING_SIGN.get());

                        pOutput.accept(ModBlocks.MARBLE.get());
                        pOutput.accept(ModBlocks.MARBLE_SLAB.get());
                        pOutput.accept(ModBlocks.MARBLE_STAIRS.get());
                        pOutput.accept(ModBlocks.MARBLE_WALL.get());

                        pOutput.accept(ModBlocks.MARBLE_BRICKS.get());
                        pOutput.accept(ModBlocks.MARBLE_BRICKS_SLAB.get());
                        pOutput.accept(ModBlocks.MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MARBLE_BRICKS_WALL.get());

                        pOutput.accept(ModBlocks.MOSSY_MARBLE_BRICKS.get());
                        pOutput.accept(ModBlocks.MOSSY_MARBLE_BRICKS_SLAB.get());
                        pOutput.accept(ModBlocks.MOSSY_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.MOSSY_MARBLE_BRICKS_WALL.get());

                        pOutput.accept(ModBlocks.CRACKED_MARBLE_BRICKS.get());
                        pOutput.accept(ModBlocks.CRACKED_MARBLE_BRICKS_SLAB.get());
                        pOutput.accept(ModBlocks.CRACKED_MARBLE_BRICK_STAIRS.get());
                        pOutput.accept(ModBlocks.CRACKED_MARBLE_BRICKS_WALL.get());

                        pOutput.accept(ModBlocks.MARBLE_BRICKS_TILES.get());
                        pOutput.accept(ModBlocks.MARBLE_BRICKS_TILES_SLAB.get());
                        pOutput.accept(ModBlocks.MARBLE_BRICK_TILES_STAIRS.get());
                        pOutput.accept(ModBlocks.MARBLE_BRICKS_TILES_WALL.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EDEN_INGREDIENTS = CREATIVE_MODE_TABS.register("eden_ingredients",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SAPPHIRE.get()))
                    .title(Component.translatable("creativetab.eden_ingredients"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.AMETHYST.get());
                        pOutput.accept(ModItems.AMETHYST_FLAWLESS.get());
                        pOutput.accept(ModItems.SAPPHIRE_SHARD.get());
                        pOutput.accept(ModItems.SAPPHIRE.get());
                        pOutput.accept(ModItems.SAPPHIRE_FLAWLESS.get());
                        pOutput.accept(ModItems.RUBY_SHARD.get());
                        pOutput.accept(ModItems.RUBY.get());
                        pOutput.accept(ModItems.RUBY_FLAWLESS.get());
                        pOutput.accept(ModItems.JADE_SHARD.get());
                        pOutput.accept(ModItems.JADE.get());
                        pOutput.accept(ModItems.JADE_FLAWLESS.get());
                        pOutput.accept(ModItems.ONYX_SHARD.get());
                        pOutput.accept(ModItems.ONYX.get());
                        pOutput.accept(ModItems.ONYX_FLAWLESS.get());
                        pOutput.accept(ModItems.ONYX_SHARD.get());
                        pOutput.accept(ModItems.ONYX.get());
                        pOutput.accept(ModItems.ONYX_FLAWLESS.get());
                        pOutput.accept(ModItems.TOPAZ_SHARD.get());
                        pOutput.accept(ModItems.TOPAZ.get());
                        pOutput.accept(ModItems.TOPAZ_FLAWLESS.get());
                        pOutput.accept(ModItems.SOULSTONE.get());
                        pOutput.accept(ModItems.SOULSTONE_FLAWLESS.get());
                        pOutput.accept(ModItems.LOTUSSTONE.get());
                        pOutput.accept(ModItems.GLOOMIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_GLOOMIUM.get());
                        pOutput.accept(ModItems.TERRASTEEL_INGOT.get());
                        pOutput.accept(ModItems.RAW_TERRASTEEL.get());
                        pOutput.accept(ModItems.SOULFORGED_NETHERITE.get());
                        pOutput.accept(ModItems.INFERNIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_INFERNIUM.get());
                        pOutput.accept(ModItems.NEBULYTE_INGOT.get());
                        pOutput.accept(ModItems.RAW_NEBULYTE.get());
                        pOutput.accept(ModItems.ASTRALIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_ASTRALIUM.get());
                        pOutput.accept(ModItems.CELESTIUM_INGOT.get());
                        pOutput.accept(ModItems.RAW_CELESTIUM.get());
                        pOutput.accept(ModItems.VOIDSTEEL_INGOT.get());
                        pOutput.accept(ModItems.VOIDSTEEL_UPGRADE.get());
                        pOutput.accept(ModItems.BASILISK_SCALE_GOLD.get());
                        pOutput.accept(ModItems.BASILISK_SCALE_BLACK.get());
                        pOutput.accept(ModItems.BASILISK_SCALE_SILVER.get());
                        pOutput.accept(ModItems.BASILISK_SCALE_GREEN.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_RED.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_COPPER.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_ROYAL.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_BLACK.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_GRAY.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_BLUE.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_WHITE.get());
                        pOutput.accept(ModItems.WYVERN_SCALE_GREEN.get());
                        pOutput.accept(ModItems.GRIFFIN_FALCON_FEATHER.get());
                        pOutput.accept(ModItems.GRIFFIN_ARCH_FEATHER.get());
                        pOutput.accept(ModItems.HARPY_FEATHER_GREEN.get());
                        pOutput.accept(ModItems.HARPY_FEATHER_BLACK.get());
                        pOutput.accept(ModItems.MONSTER_FEATHER.get());
                        pOutput.accept(ModItems.MONSTER_TEETH.get());
                        pOutput.accept(ModItems.VENOMOUS_TEETH.get());
                        pOutput.accept(ModItems.SCORPION_CHITIN_DESERT.get());
                        pOutput.accept(ModItems.SCORPION_STING_DESERT.get());
                        pOutput.accept(ModItems.SCORPION_CHITIN_RED.get());
                        pOutput.accept(ModItems.SCORPION_STING_RED.get());
                        pOutput.accept(ModItems.SCORPION_CHITIN_BLACK.get());
                        pOutput.accept(ModItems.SCORPION_STING_BLACK.get());
                        pOutput.accept(ModItems.ENT_PLATES.get());
                        pOutput.accept(ModItems.FOREST_HEART.get());
                        pOutput.accept(ModItems.GOLEM_HEART.get());





                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EDEN_FOODS = CREATIVE_MODE_TABS.register("eden_foods",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.COOKED_WYVERN.get()))
                    .title(Component.translatable("creativetab.eden_foods"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.RAW_WYVERN.get());
                        pOutput.accept(ModItems.COOKED_WYVERN.get());
                        pOutput.accept(ModItems.BASILISK_MEAT.get());


                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EDEN_TOOLS = CREATIVE_MODE_TABS.register("eden_tools",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.GLOOMIUM_PICKAXE.get()))
                    .title(Component.translatable("creativetab.eden_tools"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.GLOOMIUM_PICKAXE.get());
                        pOutput.accept(ModItems.GLOOMIUM_AXE.get());
                        pOutput.accept(ModItems.GLOOMIUM_SHOVEL.get());
                        pOutput.accept(ModItems.GLOOMIUM_HOE.get());
                        pOutput.accept(ModItems.TERRASTEEL_PICKAXE.get());
                        pOutput.accept(ModItems.TERRASTEEL_AXE.get());
                        pOutput.accept(ModItems.TERRASTEEL_SHOVEL.get());
                        pOutput.accept(ModItems.TERRASTEEL_HOE.get());
                        pOutput.accept(ModItems.INFERNIUM_PICKAXE.get());
                        pOutput.accept(ModItems.INFERNIUM_AXE.get());
                        pOutput.accept(ModItems.INFERNIUM_SHOVEL.get());
                        pOutput.accept(ModItems.INFERNIUM_HOE.get());
                        pOutput.accept(ModItems.NEBULYTE_PICKAXE.get());
                        pOutput.accept(ModItems.NEBULYTE_AXE.get());
                        pOutput.accept(ModItems.NEBULYTE_SHOVEL.get());
                        pOutput.accept(ModItems.NEBULYTE_HOE.get());
                        pOutput.accept(ModItems.ASTRALIUM_PICKAXE.get());
                        pOutput.accept(ModItems.ASTRALIUM_AXE.get());
                        pOutput.accept(ModItems.ASTRALIUM_SHOVEL.get());
                        pOutput.accept(ModItems.ASTRALIUM_HOE.get());
                        pOutput.accept(ModItems.CELESTIUM_PICKAXE.get());
                        pOutput.accept(ModItems.CELESTIUM_AXE.get());
                        pOutput.accept(ModItems.CELESTIUM_SHOVEL.get());
                        pOutput.accept(ModItems.CELESTIUM_HOE.get());
                        pOutput.accept(ModItems.VOIDSTEEL_PICKAXE.get());
                        pOutput.accept(ModItems.VOIDSTEEL_AXE.get());
                        pOutput.accept(ModItems.VOIDSTEEL_SHOVEL.get());
                        pOutput.accept(ModItems.VOIDSTEEL_HOE.get());



                    })
                    .build());

    public static final RegistryObject<CreativeModeTab> EDEN_COMBAT = CREATIVE_MODE_TABS.register("eden_combat",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VOIDSTEEL_SWORD.get()))
                    .title(Component.translatable("creativetab.eden_combat"))
                    .displayItems((pParameters, pOutput) -> {

                        pOutput.accept(ModItems.GLOOMIUM_SWORD.get());
                        pOutput.accept(ModItems.GLOOMIUM_AXE.get());
                        pOutput.accept(ModItems.TERRASTEEL_SWORD.get());
                        pOutput.accept(ModItems.TERRASTEEL_AXE.get());
                        pOutput.accept(ModItems.INFERNIUM_SWORD.get());
                        pOutput.accept(ModItems.INFERNIUM_AXE.get());
                        pOutput.accept(ModItems.NEBULYTE_SWORD.get());
                        pOutput.accept(ModItems.NEBULYTE_AXE.get());
                        pOutput.accept(ModItems.ASTRALIUM_SWORD.get());
                        pOutput.accept(ModItems.ASTRALIUM_AXE.get());
                        pOutput.accept(ModItems.CELESTIUM_SWORD.get());
                        pOutput.accept(ModItems.CELESTIUM_AXE.get());
                        pOutput.accept(ModItems.VOIDSTEEL_SWORD.get());
                        pOutput.accept(ModItems.VOIDSTEEL_AXE.get());
                        pOutput.accept(ModItems.GLOOMIUM_HELMET.get());
                        pOutput.accept(ModItems.GLOOMIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.GLOOMIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.GLOOMIUM_BOOTS.get());
                        pOutput.accept(ModItems.TERRASTEEL_HELMET.get());
                        pOutput.accept(ModItems.TERRASTEEL_CHESTPLATE.get());
                        pOutput.accept(ModItems.TERRASTEEL_LEGGINGS.get());
                        pOutput.accept(ModItems.TERRASTEEL_BOOTS.get());
                        pOutput.accept(ModItems.INFERNIUM_HELMET.get());
                        pOutput.accept(ModItems.INFERNIUM_CHESTPLATE.get());
                        pOutput.accept(ModItems.INFERNIUM_LEGGINGS.get());
                        pOutput.accept(ModItems.INFERNIUM_BOOTS.get());
                        pOutput.accept(ModItems.NEBULYTE_HELMET.get());
                        pOutput.accept(ModItems.NEBULYTE_CHESTPLATE.get());
                        pOutput.accept(ModItems.NEBULYTE_LEGGINGS.get());
                        pOutput.accept(ModItems.NEBULYTE_BOOTS.get());
                        pOutput.accept(ModItems.SOULFORGED_HELMET.get());
                        pOutput.accept(ModItems.SOULFORGED_CHESTPLATE.get());
                        pOutput.accept(ModItems.SOULFORGED_LEGGINGS.get());
                        pOutput.accept(ModItems.SOULFORGED_BOOTS.get());
                        pOutput.accept(ModItems.EMERALD_HELMET.get());
                        pOutput.accept(ModItems.EMERALD_CHESTPLATE.get());
                        pOutput.accept(ModItems.EMERALD_LEGGINGS.get());
                        pOutput.accept(ModItems.EMERALD_BOOTS.get());
                        pOutput.accept(ModItems.ENT_HELMET.get());
                        pOutput.accept(ModItems.ENT_CHESTPLATE.get());
                        pOutput.accept(ModItems.ENT_LEGGINGS.get());
                        pOutput.accept(ModItems.ENT_BOOTS.get());
                        pOutput.accept(ModItems.REDWYVERN_HELMET.get());
                        pOutput.accept(ModItems.REDWYVERN_CHESTPLATE.get());
                        pOutput.accept(ModItems.REDWYVERN_LEGGINGS.get());
                        pOutput.accept(ModItems.REDWYVERN_BOOTS.get());
                        pOutput.accept(ModItems.ROYALWYVERN_HELMET.get());
                        pOutput.accept(ModItems.ROYALWYVERN_CHESTPLATE.get());
                        pOutput.accept(ModItems.ROYALWYVERN_LEGGINGS.get());
                        pOutput.accept(ModItems.ROYALWYVERN_BOOTS.get());
                        pOutput.accept(ModItems.COPPERWYVERN_HELMET.get());
                        pOutput.accept(ModItems.COPPERWYVERN_CHESTPLATE.get());
                        pOutput.accept(ModItems.COPPERWYVERN_LEGGINGS.get());
                        pOutput.accept(ModItems.COPPERWYVERN_BOOTS.get());
                        pOutput.accept(ModItems.FORKTAIL_HELMET.get());
                        pOutput.accept(ModItems.FORKTAIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.FORKTAIL_LEGGINGS.get());
                        pOutput.accept(ModItems.FORKTAIL_BOOTS.get());
                        pOutput.accept(ModItems.RAZORBACK_HELMET.get());
                        pOutput.accept(ModItems.RAZORBACK_CHESTPLATE.get());
                        pOutput.accept(ModItems.RAZORBACK_LEGGINGS.get());
                        pOutput.accept(ModItems.RAZORBACK_BOOTS.get());
                        pOutput.accept(ModItems.FROSTTAIL_HELMET.get());
                        pOutput.accept(ModItems.FROSTTAIL_CHESTPLATE.get());
                        pOutput.accept(ModItems.FROSTTAIL_LEGGINGS.get());
                        pOutput.accept(ModItems.FROSTTAIL_BOOTS.get());
                        pOutput.accept(ModItems.FROSTTAILBLUE_HELMET.get());
                        pOutput.accept(ModItems.FROSTTAILBLUE_CHESTPLATE.get());
                        pOutput.accept(ModItems.FROSTTAILBLUE_LEGGINGS.get());
                        pOutput.accept(ModItems.FROSTTAILBLUE_BOOTS.get());
                        pOutput.accept(ModItems.BASMU_HELMET.get());
                        pOutput.accept(ModItems.BASMU_CHESTPLATE.get());
                        pOutput.accept(ModItems.BASMU_LEGGINGS.get());
                        pOutput.accept(ModItems.BASMU_BOOTS.get());
                        pOutput.accept(ModItems.SILVERBASILISK_HELMET.get());
                        pOutput.accept(ModItems.SILVERBASILISK_CHESTPLATE.get());
                        pOutput.accept(ModItems.SILVERBASILISK_LEGGINGS.get());
                        pOutput.accept(ModItems.SILVERBASILISK_BOOTS.get());
                        pOutput.accept(ModItems.GREENBASILISK_HELMET.get());
                        pOutput.accept(ModItems.GREENBASILISK_CHESTPLATE.get());
                        pOutput.accept(ModItems.GREENBASILISK_LEGGINGS.get());
                        pOutput.accept(ModItems.GREENBASILISK_BOOTS.get());


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
