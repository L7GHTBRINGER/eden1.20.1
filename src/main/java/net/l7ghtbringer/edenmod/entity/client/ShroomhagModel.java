package net.l7ghtbringer.edenmod.entity.client;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.ShroomhagEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class ShroomhagModel extends GeoModel<ShroomhagEntity> {
    @Override
    public ResourceLocation getModelResource(ShroomhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/shroomhag.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(ShroomhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/shroomhag.png");
    }

    @Override
    public ResourceLocation getAnimationResource(ShroomhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/hag.animation.json");
    }

    @Override
    public void setCustomAnimations(ShroomhagEntity animatable, long instanceId, AnimationState<ShroomhagEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
    }
}
}
