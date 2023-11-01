package net.l7ghtbringer.edenmod.datagen;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.l7ghtbringer.edenmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> GLOOMIUM_SMELTABLES = List.of(ModItems.RAW_GLOOMIUM.get(),
            ModBlocks.GLOOMIUM_ORE.get(), ModBlocks.DEEPSLATE_GLOOMIUM_ORE.get());
    private static final List<ItemLike> TERRASTEEL_SMELTABLES = List.of(ModItems.RAW_TERRASTEEL.get(),
            ModBlocks.TERRASTEEL_ORE.get(), ModBlocks.DEEPSLATE_TERRASTEEL_ORE.get());
    private static final List<ItemLike> INFERNIUM_SMELTABLES = List.of(ModItems.RAW_INFERNIUM.get(),
            ModBlocks.INFERNIUM_ORE.get());
    private static final List<ItemLike> NEBULYTE_SMELTABLES = List.of(ModItems.RAW_NEBULYTE.get(),
            ModBlocks.NEBULYTE_ORE.get());
    private static final List<ItemLike> ASTRALIUM_SMELTABLES = List.of(ModItems.RAW_ASTRALIUM.get(),
            ModBlocks.ASTRALIUM_ORE.get());
    private static final List<ItemLike> CELESTIUM_SMELTABLES = List.of(ModItems.RAW_CELESTIUM.get(),
            ModBlocks.CELESTIUM_ORE.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreSmelting(pWriter, GLOOMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.GLOOMIUM_INGOT.get(), 0.25f, 200, "gloomium_ingot");
        oreBlasting(pWriter, GLOOMIUM_SMELTABLES, RecipeCategory.MISC, ModItems.GLOOMIUM_INGOT.get(), 0.25f, 100, "gloomium_ingot");
        oreSmelting(pWriter, TERRASTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.TERRASTEEL_INGOT.get(), 0.25f, 200, "terrasteel_ingot");
        oreBlasting(pWriter, TERRASTEEL_SMELTABLES, RecipeCategory.MISC, ModItems.TERRASTEEL_INGOT.get(), 0.25f, 100, "terrasteel_ingot");
        oreSmelting(pWriter, INFERNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.INFERNIUM_INGOT.get(), 0.25f, 200, "infernium_ingot");
        oreBlasting(pWriter, INFERNIUM_SMELTABLES, RecipeCategory.MISC, ModItems.INFERNIUM_INGOT.get(), 0.25f, 100, "infernium_ingot");
        oreSmelting(pWriter, NEBULYTE_SMELTABLES, RecipeCategory.MISC, ModItems.NEBULYTE_INGOT.get(), 0.25f, 200, "nebulyte_ingot");
        oreBlasting(pWriter, NEBULYTE_SMELTABLES, RecipeCategory.MISC, ModItems.NEBULYTE_INGOT.get(), 0.25f, 100, "nebulyte_ingot");
        oreSmelting(pWriter, ASTRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ASTRALIUM_INGOT.get(), 0.25f, 200, "astralium_ingot");
        oreBlasting(pWriter, ASTRALIUM_SMELTABLES, RecipeCategory.MISC, ModItems.ASTRALIUM_INGOT.get(), 0.25f, 100, "astralium_ingot");
        oreSmelting(pWriter, CELESTIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CELESTIUM_INGOT.get(), 0.25f, 200, "celestium_ingot");
        oreBlasting(pWriter, CELESTIUM_SMELTABLES, RecipeCategory.MISC, ModItems.CELESTIUM_INGOT.get(), 0.25f, 100, "celestium_ingot");


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.GLOOMIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.GLOOMIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.GLOOMIUM_INGOT.get()), has(ModItems.GLOOMIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.GLOOMIUM_INGOT.get(), 9)
                .requires(ModBlocks.GLOOMIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.GLOOMIUM_BLOCK.get()), has(ModBlocks.GLOOMIUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.TERRASTEEL_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.TERRASTEEL_INGOT.get())
                .unlockedBy(getHasName(ModItems.TERRASTEEL_INGOT.get()), has(ModItems.TERRASTEEL_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.TERRASTEEL_INGOT.get(), 9)
                .requires(ModBlocks.TERRASTEEL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.TERRASTEEL_BLOCK.get()), has(ModBlocks.TERRASTEEL_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.INFERNIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.INFERNIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.INFERNIUM_INGOT.get()), has(ModItems.INFERNIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.INFERNIUM_INGOT.get(), 9)
                .requires(ModBlocks.INFERNIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.INFERNIUM_BLOCK.get()), has(ModBlocks.INFERNIUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NEBULYTE_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.NEBULYTE_INGOT.get())
                .unlockedBy(getHasName(ModItems.NEBULYTE_INGOT.get()), has(ModItems.NEBULYTE_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.NEBULYTE_INGOT.get(), 9)
                .requires(ModBlocks.NEBULYTE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.NEBULYTE_BLOCK.get()), has(ModBlocks.NEBULYTE_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ASTRALIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.ASTRALIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.ASTRALIUM_INGOT.get()), has(ModItems.ASTRALIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.ASTRALIUM_INGOT.get(), 9)
                .requires(ModBlocks.ASTRALIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ASTRALIUM_BLOCK.get()), has(ModBlocks.ASTRALIUM_BLOCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.CELESTIUM_BLOCK.get())
                .pattern("SSS")
                .pattern("SSS")
                .pattern("SSS")
                .define('S', ModItems.CELESTIUM_INGOT.get())
                .unlockedBy(getHasName(ModItems.CELESTIUM_INGOT.get()), has(ModItems.CELESTIUM_INGOT.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.CELESTIUM_INGOT.get(), 9)
                .requires(ModBlocks.CELESTIUM_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.CELESTIUM_BLOCK.get()), has(ModBlocks.CELESTIUM_BLOCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  EdenMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}