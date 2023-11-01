package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.SoulforgedArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SoulforgedArmorModel extends GeoModel<SoulforgedArmorItem> {
    @Override
    public ResourceLocation getModelResource(SoulforgedArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/soulforged_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SoulforgedArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/soulforged_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SoulforgedArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
