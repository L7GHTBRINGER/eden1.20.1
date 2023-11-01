package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.EmeraldArmorItem;
import net.l7ghtbringer.edenmod.item.custom.EntArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EmeraldArmorModel extends GeoModel<EmeraldArmorItem> {
    @Override
    public ResourceLocation getModelResource(EmeraldArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/emerald_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EmeraldArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/emerald_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EmeraldArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
