package net.l7ghtbringer.edenmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.WightEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.renderer.layer.AutoGlowingGeoLayer;
import software.bernie.geckolib.renderer.layer.GeoRenderLayer;

public class WightRenderer extends GeoEntityRenderer<WightEntity> {
    public WightRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WightModel());
    }

    @Override
    public ResourceLocation getTextureLocation(WightEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/wight.png");
    }

    @Override
    public GeoEntityRenderer<WightEntity> addRenderLayer(GeoRenderLayer<WightEntity> renderLayer) {
        return super.addRenderLayer(new AutoGlowingGeoLayer<>(this));
    }

    @Override
    public void render(WightEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
