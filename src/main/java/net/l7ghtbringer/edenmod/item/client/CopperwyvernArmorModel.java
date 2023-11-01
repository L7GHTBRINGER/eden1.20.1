package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.CopperwyvernArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RoyalwyvernArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class CopperwyvernArmorModel extends GeoModel<CopperwyvernArmorItem> {
    @Override
    public ResourceLocation getModelResource(CopperwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/wyvern_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(CopperwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/copperwyvern_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(CopperwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
