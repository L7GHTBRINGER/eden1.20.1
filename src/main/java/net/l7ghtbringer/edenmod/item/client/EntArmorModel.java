package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.BasmuArmorItem;
import net.l7ghtbringer.edenmod.item.custom.EntArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class EntArmorModel extends GeoModel<EntArmorItem> {
    @Override
    public ResourceLocation getModelResource(EntArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/ent_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(EntArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/ent_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(EntArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
