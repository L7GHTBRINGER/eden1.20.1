package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.ForktailArmorItem;
import net.l7ghtbringer.edenmod.item.custom.RazorbackArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class RazorbackArmorModel extends GeoModel<RazorbackArmorItem> {
    @Override
    public ResourceLocation getModelResource(RazorbackArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/forktail_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(RazorbackArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/razorback_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(RazorbackArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
