package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.BasmuArmorItem;
import net.l7ghtbringer.edenmod.item.custom.GreenBasiliskArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class GreenbasiliskArmorModel extends GeoModel<GreenBasiliskArmorItem> {
    @Override
    public ResourceLocation getModelResource(GreenBasiliskArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/basilisk_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(GreenBasiliskArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/greenbasilisk_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(GreenBasiliskArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
