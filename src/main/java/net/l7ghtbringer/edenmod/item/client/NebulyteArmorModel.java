package net.l7ghtbringer.edenmod.item.client;


import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.item.custom.GloomiumArmorItem;
import net.l7ghtbringer.edenmod.item.custom.NebulyteArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.model.GeoModel;

public class NebulyteArmorModel extends GeoModel<NebulyteArmorItem> {
    @Override
    public ResourceLocation getModelResource(NebulyteArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/nebulyte_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(NebulyteArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/armor/nebulyte_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(NebulyteArmorItem animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/animation.armor.idle.json");
    }
}
