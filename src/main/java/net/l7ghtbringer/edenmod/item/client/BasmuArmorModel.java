package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.BasmuArmorItem;
import net.l7ghtbringer.edenmod.item.custom.ForktailArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class BasmuArmorModel extends GeoModel<BasmuArmorItem> {
    @Override
    public ResourceLocation getModelResource(BasmuArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/basmu_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(BasmuArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/basmu_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(BasmuArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
