package net.l7ghtbringer.edenmod.item.custom;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.ModItems;
import net.l7ghtbringer.edenmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier GLOOMIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_GLOOMIUM_TOOL, () -> Ingredient.of(ModItems.GLOOMIUM_INGOT.get())),
            new ResourceLocation(EdenMod.MOD_ID, "gloomium"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier TERRASTEEL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_TERRASTEEL_TOOL, () -> Ingredient.of(ModItems.TERRASTEEL_INGOT.get())),
            new ResourceLocation(EdenMod.MOD_ID, "terrasteel"), List.of(Tiers.DIAMOND), List.of());

    public static final Tier INFERNIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_INFERNIUM_TOOL, () -> Ingredient.of(ModItems.INFERNIUM_INGOT.get())),
            new ResourceLocation(EdenMod.MOD_ID, "infernium"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier NEBULYTE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_NEBULYTE_TOOL, () -> Ingredient.of(ModItems.NEBULYTE_INGOT.get())),
            new ResourceLocation(EdenMod.MOD_ID, "nebulyte"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier SOULFORGED = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SOULFORGED_TOOL, () -> Ingredient.of(ModItems.SOULFORGED_NETHERITE.get())),
            new ResourceLocation(EdenMod.MOD_ID, "soulforged"), List.of(Tiers.NETHERITE), List.of());

    public static final Tier ASTRALIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_ASTRALIUM_TOOL, () -> Ingredient.of(ModItems.ASTRALIUM_INGOT.get())),
            new ResourceLocation(EdenMod.MOD_ID, "astralium"), List.of(ModToolTiers.NEBULYTE), List.of());

    public static final Tier CELESTIUM = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_CELESTIUM_TOOL, () -> Ingredient.of(ModItems.CELESTIUM_INGOT.get())),
            new ResourceLocation(EdenMod.MOD_ID, "celestium"), List.of(ModToolTiers.NEBULYTE), List.of());

    public static final Tier VOIDSTEEL = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_VOIDSTEEL_TOOL, () -> Ingredient.of(ModItems.VOIDSTEEL_INGOT.get())),
            new ResourceLocation(EdenMod.MOD_ID, "voidsteel"), List.of(ModToolTiers.CELESTIUM), List.of());

    public static final Tier EMERALD = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_EMERALD_TOOL, () -> Ingredient.of(Items.EMERALD)),
            new ResourceLocation(EdenMod.MOD_ID, "emerald"), List.of(Tiers.DIAMOND), List.of());

}
