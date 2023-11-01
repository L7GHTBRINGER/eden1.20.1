package net.l7ghtbringer.edenmod.item;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.l7ghtbringer.edenmod.entity.ModEntities;
import net.l7ghtbringer.edenmod.item.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EdenMod.MOD_ID);


    public static final RegistryObject<Item> GREATWOOD_SIGN = ITEMS.register("greatwood_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.GREATWOOD_SIGN.get(), ModBlocks.GREATWOOD_WALL_SIGN.get()));
    public static final RegistryObject<Item> GREATWOOD_HANGING_SIGN = ITEMS.register("greatwood_hanging_sign",
            () -> new HangingSignItem(ModBlocks.GREATWOOD_HANGING_SIGN.get(), ModBlocks.GREATWOOD_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    //INGREDIENTS
    public static final RegistryObject<Item> GLOOMIUM_INGOT = ITEMS.register("gloomium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GLOOMIUM = ITEMS.register("raw_gloomium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_INGOT = ITEMS.register("terrasteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_TERRASTEEL = ITEMS.register("raw_terrasteel",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_INGOT = ITEMS.register("infernium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_INFERNIUM = ITEMS.register("raw_infernium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_INGOT = ITEMS.register("nebulyte_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_NEBULYTE = ITEMS.register("raw_nebulyte",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULFORGED_NETHERITE = ITEMS.register("soulforged_netherite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_CELESTIUM = ITEMS.register("raw_celestium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_INGOT = ITEMS.register("celestium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_ASTRALIUM = ITEMS.register("raw_astralium",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ASTRALIUM_INGOT = ITEMS.register("astralium_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTEEL_INGOT = ITEMS.register("voidsteel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTEEL_UPGRADE = ITEMS.register("voidsteel_upgrade",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> AMETHYST = ITEMS.register("amethyst",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> AMETHYST_FLAWLESS = ITEMS.register("amethyst_flawless",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_SHARD = ITEMS.register("sapphire_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SAPPHIRE_FLAWLESS = ITEMS.register("sapphire_flawless",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_SHARD = ITEMS.register("ruby_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RUBY_FLAWLESS = ITEMS.register("ruby_flawless",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_SHARD = ITEMS.register("jade_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_FLAWLESS = ITEMS.register("jade_flawless",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONYX_SHARD = ITEMS.register("onyx_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONYX = ITEMS.register("onyx",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ONYX_FLAWLESS = ITEMS.register("onyx_flawless",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_SHARD = ITEMS.register("topaz_shard",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ = ITEMS.register("topaz",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TOPAZ_FLAWLESS = ITEMS.register("topaz_flawless",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LOTUSSTONE = ITEMS.register("lotusstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSTONE = ITEMS.register("soulstone",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SOULSTONE_FLAWLESS = ITEMS.register("soulstone_flawless",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BASILISK_SCALE_BLACK = ITEMS.register("basilisk_scale_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASILISK_SCALE_GOLD = ITEMS.register("basilisk_scale_gold",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASILISK_SCALE_GREEN = ITEMS.register("basilisk_scale_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASILISK_SCALE_SILVER = ITEMS.register("basilisk_scale_silver",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ENT_PLATES = ITEMS.register("ent_plates",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> FOREST_HEART = ITEMS.register("forest_heart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOLEM_HEART = ITEMS.register("golem_heart",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRIFFIN_ARCH_FEATHER = ITEMS.register("griffin_arch_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GRIFFIN_FALCON_FEATHER = ITEMS.register("griffin_falcon_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARPY_FEATHER_BLACK = ITEMS.register("harpy_feather_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> HARPY_FEATHER_GREEN = ITEMS.register("harpy_feather_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MONSTER_FEATHER = ITEMS.register("monster_feather",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> MONSTER_TEETH = ITEMS.register("monster_teeth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> VENOMOUS_TEETH = ITEMS.register("venomous_teeth",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORPION_CHITIN_BLACK = ITEMS.register("scorpion_chitin_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORPION_STING_BLACK = ITEMS.register("scorpion_sting_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORPION_CHITIN_DESERT = ITEMS.register("scorpion_chitin_desert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORPION_STING_DESERT = ITEMS.register("scorpion_sting_desert",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORPION_CHITIN_RED = ITEMS.register("scorpion_chitin_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SCORPION_STING_RED = ITEMS.register("scorpion_sting_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_BLACK = ITEMS.register("wyvern_scale_black",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_BLUE = ITEMS.register("wyvern_scale_blue",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_COPPER = ITEMS.register("wyvern_scale_copper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_GRAY = ITEMS.register("wyvern_scale_gray",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_GREEN = ITEMS.register("wyvern_scale_green",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_RED = ITEMS.register("wyvern_scale_red",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_ROYAL = ITEMS.register("wyvern_scale_royal",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WYVERN_SCALE_WHITE = ITEMS.register("wyvern_scale_white",
            () -> new Item(new Item.Properties()));


    //FOOD
    public static final RegistryObject<Item> RAW_WYVERN = ITEMS.register("raw_wyvern",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_WYVERN)));
    public static final RegistryObject<Item> COOKED_WYVERN = ITEMS.register("cooked_wyvern",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_WYVERN)));
    public static final RegistryObject<Item> BASILISK_MEAT = ITEMS.register("basilisk_meat",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_WYVERN)));

    //SPAWNEGGS
    public static final RegistryObject<Item> SWAMPHAG_SPAWN_EGG = ITEMS.register("swamphag_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SWAMPHAG, 304529,865026,
                    new Item.Properties()));
    public static final RegistryObject<Item> GRAVEHAG_SPAWN_EGG = ITEMS.register("gravehag_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.GRAVEHAG, 323936,486483,
                    new Item.Properties()));
    public static final RegistryObject<Item> BURRIER_SPAWN_EGG = ITEMS.register("burrier_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BURRIER, 323937,486482,
                    new Item.Properties()));
    public static final RegistryObject<Item> WIGHT_SPAWN_EGG = ITEMS.register("wight_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.WIGHT, 3937,4482,
                    new Item.Properties()));
    public static final RegistryObject<Item> SHROOMHAG_SPAWN_EGG = ITEMS.register("shroomhag_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SHROOMHAG, 13937,44182,
                    new Item.Properties()));
    public static final RegistryObject<Item> CRIMSONHAG_SPAWN_EGG = ITEMS.register("crimsonhag_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.CRIMSONHAG, 13937,44182,
                    new Item.Properties()));
    public static final RegistryObject<Item> WARPEDHAG_SPAWN_EGG = ITEMS.register("warpedhag_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.WARPEDHAG, 13937,44182,
                    new Item.Properties()));


    //TOOLS AND SWORDS
    public static final RegistryObject<Item> GLOOMIUM_SWORD = ITEMS.register("gloomium_sword",
            () -> new SwordItem(ModToolTiers.GLOOMIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> GLOOMIUM_PICKAXE = ITEMS.register("gloomium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.GLOOMIUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> GLOOMIUM_AXE = ITEMS.register("gloomium_axe",
            () -> new AxeItem(ModToolTiers.GLOOMIUM, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> GLOOMIUM_SHOVEL = ITEMS.register("gloomium_shovel",
            () -> new ShovelItem(ModToolTiers.GLOOMIUM, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> GLOOMIUM_HOE = ITEMS.register("gloomium_hoe",
            () -> new HoeItem(ModToolTiers.GLOOMIUM, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> TERRASTEEL_SWORD = ITEMS.register("terrasteel_sword",
            () -> new SwordItem(ModToolTiers.TERRASTEEL, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_PICKAXE = ITEMS.register("terrasteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.TERRASTEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_AXE = ITEMS.register("terrasteel_axe",
            () -> new AxeItem(ModToolTiers.TERRASTEEL, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_SHOVEL = ITEMS.register("terrasteel_shovel",
            () -> new ShovelItem(ModToolTiers.TERRASTEEL, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_HOE = ITEMS.register("terrasteel_hoe",
            () -> new HoeItem(ModToolTiers.TERRASTEEL, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> INFERNIUM_SWORD = ITEMS.register("infernium_sword",
            () -> new SwordItem(ModToolTiers.INFERNIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_PICKAXE = ITEMS.register("infernium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.INFERNIUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_AXE = ITEMS.register("infernium_axe",
            () -> new AxeItem(ModToolTiers.INFERNIUM, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_SHOVEL = ITEMS.register("infernium_shovel",
            () -> new ShovelItem(ModToolTiers.INFERNIUM, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_HOE = ITEMS.register("infernium_hoe",
            () -> new HoeItem(ModToolTiers.INFERNIUM, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> NEBULYTE_SWORD = ITEMS.register("nebulyte_sword",
            () -> new SwordItem(ModToolTiers.NEBULYTE, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_PICKAXE = ITEMS.register("nebulyte_pickaxe",
            () -> new PickaxeItem(ModToolTiers.NEBULYTE, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_AXE = ITEMS.register("nebulyte_axe",
            () -> new AxeItem(ModToolTiers.NEBULYTE, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_SHOVEL = ITEMS.register("nebulyte_shovel",
            () -> new ShovelItem(ModToolTiers.NEBULYTE, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_HOE = ITEMS.register("nebulyte_hoe",
            () -> new HoeItem(ModToolTiers.NEBULYTE, 0, 0, new Item.Properties()));

   // public static final RegistryObject<Item> SOULFORGED_SWORD = ITEMS.register("soulforged_sword",
     //       () -> new SwordItem(ModToolTiers.SOULFORGED, 4, 2, new Item.Properties()));
    //public static final RegistryObject<Item> SOULFORGED_PICKAXE = ITEMS.register("soulforged_pickaxe",
      //      () -> new PickaxeItem(ModToolTiers.SOULFORGED, 1, 1, new Item.Properties()));
   // public static final RegistryObject<Item> SOULFORGED_AXE = ITEMS.register("soulforged_axe",
     //       () -> new AxeItem(ModToolTiers.SOULFORGED, 7, 1, new Item.Properties()));
    //public static final RegistryObject<Item> SOULFORGED_SHOVEL = ITEMS.register("soulforged_shovel",
      //      () -> new ShovelItem(ModToolTiers.SOULFORGED, 0, 0, new Item.Properties()));
    //public static final RegistryObject<Item> SOULFORGED_HOE = ITEMS.register("soulforged_hoe",
      //      () -> new HoeItem(ModToolTiers.SOULFORGED, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> ASTRALIUM_SWORD = ITEMS.register("astralium_sword",
            () -> new SwordItem(ModToolTiers.ASTRALIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> ASTRALIUM_PICKAXE = ITEMS.register("astralium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.ASTRALIUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> ASTRALIUM_AXE = ITEMS.register("astralium_axe",
            () -> new AxeItem(ModToolTiers.ASTRALIUM, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> ASTRALIUM_SHOVEL = ITEMS.register("astralium_shovel",
            () -> new ShovelItem(ModToolTiers.ASTRALIUM, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> ASTRALIUM_HOE = ITEMS.register("astralium_hoe",
            () -> new HoeItem(ModToolTiers.ASTRALIUM, 0, 0, new Item.Properties()));

    public static final RegistryObject<Item> CELESTIUM_SWORD = ITEMS.register("celestium_sword",
            () -> new SwordItem(ModToolTiers.CELESTIUM, 4, 2, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_PICKAXE = ITEMS.register("celestium_pickaxe",
            () -> new PickaxeItem(ModToolTiers.CELESTIUM, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_AXE = ITEMS.register("celestium_axe",
            () -> new AxeItem(ModToolTiers.CELESTIUM, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_SHOVEL = ITEMS.register("celestium_shovel",
            () -> new ShovelItem(ModToolTiers.CELESTIUM, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> CELESTIUM_HOE = ITEMS.register("celestium_hoe",
            () -> new HoeItem(ModToolTiers.CELESTIUM, 0, 0, new Item.Properties()));


    public static final RegistryObject<Item> VOIDSTEEL_SWORD = ITEMS.register("voidsteel_sword",
            () -> new SwordItem(ModToolTiers.VOIDSTEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTEEL_PICKAXE = ITEMS.register("voidsteel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VOIDSTEEL, 1, 1, new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTEEL_AXE = ITEMS.register("voidsteel_axe",
            () -> new AxeItem(ModToolTiers.VOIDSTEEL, 7, 1, new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTEEL_SHOVEL = ITEMS.register("voidsteel_shovel",
            () -> new ShovelItem(ModToolTiers.VOIDSTEEL, 0, 0, new Item.Properties()));
    public static final RegistryObject<Item> VOIDSTEEL_HOE = ITEMS.register("voidsteel_hoe",
            () -> new HoeItem(ModToolTiers.VOIDSTEEL, 0, 0, new Item.Properties()));

    //ARMOR

    public static final RegistryObject<Item> GLOOMIUM_HELMET = ITEMS.register("gloomium_helmet",
            () -> new GloomiumArmorItem(ModArmorMaterials.GLOOMIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GLOOMIUM_CHESTPLATE = ITEMS.register("gloomium_chestplate",
            () -> new GloomiumArmorItem(ModArmorMaterials.GLOOMIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GLOOMIUM_LEGGINGS = ITEMS.register("gloomium_leggings",
            () -> new GloomiumArmorItem(ModArmorMaterials.GLOOMIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GLOOMIUM_BOOTS = ITEMS.register("gloomium_boots",
            () -> new GloomiumArmorItem(ModArmorMaterials.GLOOMIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> TERRASTEEL_HELMET = ITEMS.register("terrasteel_helmet",
            () -> new TerrasteelArmorItem(ModArmorMaterials.TERRASTEEL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_CHESTPLATE = ITEMS.register("terrasteel_chestplate",
            () -> new TerrasteelArmorItem(ModArmorMaterials.TERRASTEEL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_LEGGINGS = ITEMS.register("terrasteel_leggings",
            () -> new TerrasteelArmorItem(ModArmorMaterials.TERRASTEEL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TERRASTEEL_BOOTS = ITEMS.register("terrasteel_boots",
            () -> new TerrasteelArmorItem(ModArmorMaterials.TERRASTEEL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> INFERNIUM_HELMET = ITEMS.register("infernium_helmet",
            () -> new InferniumArmorItem(ModArmorMaterials.INFERNIUM, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_CHESTPLATE = ITEMS.register("infernium_chestplate",
            () -> new InferniumArmorItem(ModArmorMaterials.INFERNIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_LEGGINGS = ITEMS.register("infernium_leggings",
            () -> new InferniumArmorItem(ModArmorMaterials.INFERNIUM, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> INFERNIUM_BOOTS = ITEMS.register("infernium_boots",
            () -> new InferniumArmorItem(ModArmorMaterials.INFERNIUM, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> NEBULYTE_HELMET = ITEMS.register("nebulyte_helmet",
            () -> new NebulyteArmorItem(ModArmorMaterials.NEBULYTE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_CHESTPLATE = ITEMS.register("nebulyte_chestplate",
            () -> new NebulyteArmorItem(ModArmorMaterials.NEBULYTE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_LEGGINGS = ITEMS.register("nebulyte_leggings",
            () -> new NebulyteArmorItem(ModArmorMaterials.NEBULYTE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> NEBULYTE_BOOTS = ITEMS.register("nebulyte_boots",
            () -> new NebulyteArmorItem(ModArmorMaterials.NEBULYTE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SOULFORGED_HELMET = ITEMS.register("soulforged_helmet",
            () -> new SoulforgedArmorItem(ModArmorMaterials.SOULFORGED, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SOULFORGED_CHESTPLATE = ITEMS.register("soulforged_chestplate",
            () -> new SoulforgedArmorItem(ModArmorMaterials.SOULFORGED, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SOULFORGED_LEGGINGS = ITEMS.register("soulforged_leggings",
            () -> new SoulforgedArmorItem(ModArmorMaterials.SOULFORGED, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SOULFORGED_BOOTS = ITEMS.register("soulforged_boots",
            () -> new SoulforgedArmorItem(ModArmorMaterials.SOULFORGED, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
            () -> new EmeraldArmorItem(ModArmorMaterials.EMERALD, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ENT_HELMET = ITEMS.register("ent_helmet",
            () -> new EntArmorItem(ModArmorMaterials.ENT, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ENT_CHESTPLATE = ITEMS.register("ent_chestplate",
            () -> new EntArmorItem(ModArmorMaterials.ENT, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ENT_LEGGINGS = ITEMS.register("ent_leggings",
            () -> new EntArmorItem(ModArmorMaterials.ENT, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ENT_BOOTS = ITEMS.register("ent_boots",
            () -> new EntArmorItem(ModArmorMaterials.ENT, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> REDWYVERN_HELMET = ITEMS.register("redwyvern_helmet",
            () -> new RedwyvernArmorItem(ModArmorMaterials.REDWYVERN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> REDWYVERN_CHESTPLATE = ITEMS.register("redwyvern_chestplate",
            () -> new RedwyvernArmorItem(ModArmorMaterials.REDWYVERN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> REDWYVERN_LEGGINGS = ITEMS.register("redwyvern_leggings",
            () -> new RedwyvernArmorItem(ModArmorMaterials.REDWYVERN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> REDWYVERN_BOOTS = ITEMS.register("redwyvern_boots",
            () -> new RedwyvernArmorItem(ModArmorMaterials.REDWYVERN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> ROYALWYVERN_HELMET = ITEMS.register("royalwyvern_helmet",
            () -> new RoyalwyvernArmorItem(ModArmorMaterials.ROYALWYVERN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> ROYALWYVERN_CHESTPLATE = ITEMS.register("royalwyvern_chestplate",
            () -> new RoyalwyvernArmorItem(ModArmorMaterials.ROYALWYVERN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> ROYALWYVERN_LEGGINGS = ITEMS.register("royalwyvern_leggings",
            () -> new RoyalwyvernArmorItem(ModArmorMaterials.ROYALWYVERN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> ROYALWYVERN_BOOTS = ITEMS.register("royalwyvern_boots",
            () -> new RoyalwyvernArmorItem(ModArmorMaterials.ROYALWYVERN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> COPPERWYVERN_HELMET = ITEMS.register("copperwyvern_helmet",
            () -> new CopperwyvernArmorItem(ModArmorMaterials.COPPERWYVERN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> COPPERWYVERN_CHESTPLATE = ITEMS.register("copperwyvern_chestplate",
            () -> new CopperwyvernArmorItem(ModArmorMaterials.COPPERWYVERN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> COPPERWYVERN_LEGGINGS = ITEMS.register("copperwyvern_leggings",
            () -> new CopperwyvernArmorItem(ModArmorMaterials.COPPERWYVERN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> COPPERWYVERN_BOOTS = ITEMS.register("copperwyvern_boots",
            () -> new CopperwyvernArmorItem(ModArmorMaterials.COPPERWYVERN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FORKTAIL_HELMET = ITEMS.register("forktail_helmet",
            () -> new ForktailArmorItem(ModArmorMaterials.FORKTAIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FORKTAIL_CHESTPLATE = ITEMS.register("forktail_chestplate",
            () -> new ForktailArmorItem(ModArmorMaterials.FORKTAIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FORKTAIL_LEGGINGS = ITEMS.register("forktail_leggings",
            () -> new ForktailArmorItem(ModArmorMaterials.FORKTAIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FORKTAIL_BOOTS = ITEMS.register("forktail_boots",
            () -> new ForktailArmorItem(ModArmorMaterials.FORKTAIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> RAZORBACK_HELMET = ITEMS.register("razorback_helmet",
            () -> new RazorbackArmorItem(ModArmorMaterials.RAZORBACK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> RAZORBACK_CHESTPLATE = ITEMS.register("razorback_chestplate",
            () -> new RazorbackArmorItem(ModArmorMaterials.RAZORBACK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> RAZORBACK_LEGGINGS = ITEMS.register("razorback_leggings",
            () -> new RazorbackArmorItem(ModArmorMaterials.RAZORBACK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> RAZORBACK_BOOTS = ITEMS.register("razorback_boots",
            () -> new RazorbackArmorItem(ModArmorMaterials.RAZORBACK, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FROSTTAIL_HELMET = ITEMS.register("frosttail_helmet",
            () -> new FrosttailArmorItem(ModArmorMaterials.FROSTTAIL, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FROSTTAIL_CHESTPLATE = ITEMS.register("frosttail_chestplate",
            () -> new FrosttailArmorItem(ModArmorMaterials.FROSTTAIL, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FROSTTAIL_LEGGINGS = ITEMS.register("frosttail_leggings",
            () -> new FrosttailArmorItem(ModArmorMaterials.FROSTTAIL, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FROSTTAIL_BOOTS = ITEMS.register("frosttail_boots",
            () -> new FrosttailArmorItem(ModArmorMaterials.FROSTTAIL, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> FROSTTAILBLUE_HELMET = ITEMS.register("frosttailblue_helmet",
            () -> new FrosttailblueArmorItem(ModArmorMaterials.FROSTTAILBLUE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> FROSTTAILBLUE_CHESTPLATE = ITEMS.register("frosttailblue_chestplate",
            () -> new FrosttailblueArmorItem(ModArmorMaterials.FROSTTAILBLUE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> FROSTTAILBLUE_LEGGINGS = ITEMS.register("frosttailblue_leggings",
            () -> new FrosttailblueArmorItem(ModArmorMaterials.FROSTTAILBLUE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> FROSTTAILBLUE_BOOTS = ITEMS.register("frosttailblue_boots",
            () -> new FrosttailblueArmorItem(ModArmorMaterials.FROSTTAILBLUE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> BASMU_HELMET = ITEMS.register("basmu_helmet",
            () -> new BasmuArmorItem(ModArmorMaterials.BASMU, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> BASMU_CHESTPLATE = ITEMS.register("basmu_chestplate",
            () -> new BasmuArmorItem(ModArmorMaterials.BASMU, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> BASMU_LEGGINGS = ITEMS.register("basmu_leggings",
            () -> new BasmuArmorItem(ModArmorMaterials.BASMU, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> BASMU_BOOTS = ITEMS.register("basmu_boots",
            () -> new BasmuArmorItem(ModArmorMaterials.BASMU, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> SILVERBASILISK_HELMET = ITEMS.register("silverbasilisk_helmet",
            () -> new SilverBasiliskArmorItem(ModArmorMaterials.SILVERBASILISK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SILVERBASILISK_CHESTPLATE = ITEMS.register("silverbasilisk_chestplate",
            () -> new SilverBasiliskArmorItem(ModArmorMaterials.SILVERBASILISK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SILVERBASILISK_LEGGINGS = ITEMS.register("silverbasilisk_leggings",
            () -> new SilverBasiliskArmorItem(ModArmorMaterials.SILVERBASILISK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SILVERBASILISK_BOOTS = ITEMS.register("silverbasilisk_boots",
            () -> new SilverBasiliskArmorItem(ModArmorMaterials.SILVERBASILISK, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GREENBASILISK_HELMET = ITEMS.register("greenbasilisk_helmet",
            () -> new GreenBasiliskArmorItem(ModArmorMaterials.GREENBASILISK, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GREENBASILISK_CHESTPLATE = ITEMS.register("greenbasilisk_chestplate",
            () -> new GreenBasiliskArmorItem(ModArmorMaterials.GREENBASILISK, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GREENBASILISK_LEGGINGS = ITEMS.register("greenbasilisk_leggings",
            () -> new GreenBasiliskArmorItem(ModArmorMaterials.GREENBASILISK, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GREENBASILISK_BOOTS = ITEMS.register("greenbasilisk_boots",
            () -> new GreenBasiliskArmorItem(ModArmorMaterials.GREENBASILISK, ArmorItem.Type.BOOTS, new Item.Properties()));





    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}