package net.l7ghtbringer.edenmod.util;


import net.l7ghtbringer.edenmod.EdenMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_GLOOMIUM_TOOL = tag("needs_gloomium_tool");
        public static final TagKey<Block> NEEDS_TERRASTEEL_TOOL = tag("needs_terrasteel_tool");
        public static final TagKey<Block> NEEDS_INFERNIUM_TOOL = tag("needs_infernium_tool");
        public static final TagKey<Block> NEEDS_NEBULYTE_TOOL = tag("needs_nebulyte_tool");
        public static final TagKey<Block> NEEDS_SOULFORGED_TOOL = tag("needs_soulforged_tool");
        public static final TagKey<Block> NEEDS_ASTRALIUM_TOOL = tag("needs_astralium_tool");
        public static final TagKey<Block> NEEDS_CELESTIUM_TOOL = tag("needs_celestium_tool");
        public static final TagKey<Block> NEEDS_VOIDSTEEL_TOOL = tag("needs_voidsteel_tool");
        public static final TagKey<Block> NEEDS_EMERALD_TOOL = tag("needs_emerald_tool");


        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(EdenMod.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(EdenMod.MOD_ID, name));
        }
    }
}
