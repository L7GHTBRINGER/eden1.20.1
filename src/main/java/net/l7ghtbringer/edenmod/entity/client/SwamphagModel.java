package net.l7ghtbringer.edenmod.entity.client;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.SwamphagEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class SwamphagModel extends GeoModel<SwamphagEntity> {
    @Override
    public ResourceLocation getModelResource(SwamphagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/hag.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(SwamphagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/swamphag.png");
    }

    @Override
    public ResourceLocation getAnimationResource(SwamphagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/hag.animation.json");
    }

    @Override
    public void setCustomAnimations(SwamphagEntity animatable, long instanceId, AnimationState<SwamphagEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
    }
}
}
