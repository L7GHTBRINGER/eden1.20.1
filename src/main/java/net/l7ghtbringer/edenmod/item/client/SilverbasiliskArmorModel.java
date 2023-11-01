package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.GreenBasiliskArmorItem;
import net.l7ghtbringer.edenmod.item.custom.SilverBasiliskArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class SilverbasiliskArmorModel extends GeoModel<SilverBasiliskArmorItem> {
    @Override
    public ResourceLocation getModelResource(SilverBasiliskArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/basilisk_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SilverBasiliskArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/silverbasilisk_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SilverBasiliskArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
