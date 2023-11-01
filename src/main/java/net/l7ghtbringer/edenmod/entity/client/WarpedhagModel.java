package net.l7ghtbringer.edenmod.entity.client;

import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.CrimsonhagEntity;
import net.l7ghtbringer.edenmod.entity.custom.WarpedhagEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class WarpedhagModel extends GeoModel<WarpedhagEntity> {
    @Override
    public ResourceLocation getModelResource(WarpedhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "geo/warpedhag.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(WarpedhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/warpedhag.png");
    }

    @Override
    public ResourceLocation getAnimationResource(WarpedhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "animations/hag.animation.json");
    }

    @Override
    public void setCustomAnimations(WarpedhagEntity animatable, long instanceId, AnimationState<WarpedhagEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);

            head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
            head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
    }
}
}
