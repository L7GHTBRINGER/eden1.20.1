package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RedwyvernArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RedwyvernArmorModel extends GeoModel<RedwyvernArmorItem> {
    @Override
    public ResourceLocation getModelResource(RedwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/wyvern_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RedwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/redwyvern_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RedwyvernArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
