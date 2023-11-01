package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.ForktailArmorItem;
import net.l7ghtbringer.edenmod.item.custom.FrosttailArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FrosttailArmorModel extends GeoModel<FrosttailArmorItem> {
    @Override
    public ResourceLocation getModelResource(FrosttailArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/forktail_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FrosttailArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/frosttail_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FrosttailArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
