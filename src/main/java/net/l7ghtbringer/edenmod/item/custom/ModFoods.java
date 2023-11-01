package net.l7ghtbringer.edenmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_WYVERN = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.4f).effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 200), 0.1f).build();

    public static final FoodProperties COOKED_WYVERN = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.5f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200), 0.1f).build();

    public static final FoodProperties BASILISK_MEAT = new FoodProperties.Builder().nutrition(3)
            .saturationMod(1.0f).effect(() -> new MobEffectInstance(MobEffects.POISON, 800), 0.1f).build();

}
