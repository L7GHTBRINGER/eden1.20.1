package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.TerrasteelArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class TerrasteelArmorModel extends GeoModel<TerrasteelArmorItem> {
    @Override
    public ResourceLocation getModelResource(TerrasteelArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/terrasteel_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(TerrasteelArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/terrasteel_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(TerrasteelArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
