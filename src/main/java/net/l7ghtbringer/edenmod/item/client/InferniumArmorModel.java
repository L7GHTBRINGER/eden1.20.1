package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.InferniumArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class InferniumArmorModel extends GeoModel<InferniumArmorItem> {
    @Override
    public ResourceLocation getModelResource(InferniumArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/infernium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(InferniumArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/infernium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(InferniumArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
