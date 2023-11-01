package net.l7ghtbringer.edenmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.GravehagEntity;

import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GravehagRenderer extends GeoEntityRenderer<GravehagEntity> {
    public GravehagRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GravehagModel());
    }

    @Override
    public ResourceLocation getTextureLocation(GravehagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/gravehag.png");
    }

    @Override
    public void render(GravehagEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
