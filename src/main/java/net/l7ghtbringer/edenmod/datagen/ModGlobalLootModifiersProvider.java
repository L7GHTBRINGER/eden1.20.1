package net.l7ghtbringer.edenmod.datagen;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.ModItems;
import net.l7ghtbringer.edenmod.loot.AddItemModifier;
import net.l7ghtbringer.edenmod.loot.AddSusSandItemModifier;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, EdenMod.MOD_ID);
    }

    @Override
    protected void start() {
       // add("pine_cone_from_grass", new AddItemModifier(new LootItemCondition[] {
         //       LootItemBlockStatePropertyCondition.hasBlockStateProperties(Blocks.GRASS).build(),
           //     LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.PINE_CONE.get()));

        add("test", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation(EdenMod.MOD_ID, "entities/Swamphag")).build() }, ModItems.BASMU_HELMET.get()));

        add("venomous_teeth_from_jungle_temples", new AddItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build() }, ModItems.VENOMOUS_TEETH.get()));

        add("chitin_from_sus_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archeology/desert_temple")).build() }, ModItems.SCORPION_CHITIN_DESERT.get()));

        add("sting_from_sus_sand", new AddSusSandItemModifier(new LootItemCondition[] {
                new LootTableIdCondition.Builder(new ResourceLocation("archeology/desert_temple")).build() }, ModItems.SCORPION_STING_DESERT.get()));


    }
}
