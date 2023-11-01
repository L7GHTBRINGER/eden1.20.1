package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GloomiumArmorModel extends GeoModel<GloomiumArmorItem> {
    @Override
    public ResourceLocation getModelResource(GloomiumArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/gloomium_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GloomiumArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/gloomium_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GloomiumArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
