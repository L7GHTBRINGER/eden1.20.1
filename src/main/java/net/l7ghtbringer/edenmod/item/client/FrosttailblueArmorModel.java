package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.FrosttailArmorItem;
import net.l7ghtbringer.edenmod.item.custom.FrosttailblueArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class FrosttailblueArmorModel extends GeoModel<FrosttailblueArmorItem> {
    @Override
    public ResourceLocation getModelResource(FrosttailblueArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/forktail_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(FrosttailblueArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/frosttailblue_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(FrosttailblueArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
