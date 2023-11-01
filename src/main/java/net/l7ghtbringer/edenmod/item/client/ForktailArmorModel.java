package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.CopperwyvernArmorItem;
import net.l7ghtbringer.edenmod.item.custom.ForktailArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class ForktailArmorModel extends GeoModel<ForktailArmorItem> {
    @Override
    public ResourceLocation getModelResource(ForktailArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/forktail_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ForktailArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/forktail_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ForktailArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
