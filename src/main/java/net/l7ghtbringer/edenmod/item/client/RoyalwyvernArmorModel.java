package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.RedwyvernArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RoyalwyvernArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RoyalwyvernArmorModel extends GeoModel<RoyalwyvernArmorItem> {
    @Override
    public ResourceLocation getModelResource(RoyalwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/wyvern_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RoyalwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/royalwyvern_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RoyalwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
