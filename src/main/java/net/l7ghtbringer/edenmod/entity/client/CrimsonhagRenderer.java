package net.l7ghtbringer.edenmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.CrimsonhagEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class CrimsonhagRenderer extends GeoEntityRenderer<CrimsonhagEntity> {
    public CrimsonhagRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new CrimsonhagModel());
    }

    @Override
    public ResourceLocation getTextureLocation(CrimsonhagEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/crimsonhag.png");
    }

    @Override
    public void render(CrimsonhagEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
