package net.l7ghtbringer.edenmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.ShroomhagEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class ShroomhagRenderer extends GeoEntityRenderer<ShroomhagEntity> {
    public ShroomhagRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new ShroomhagModel());
    }

    @Override
    public ResourceLocation getTextureLocation(ShroomhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/shroomhag.png");
    }

    @Override
    public void render(ShroomhagEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
