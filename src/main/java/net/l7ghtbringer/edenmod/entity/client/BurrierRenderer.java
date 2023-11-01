package net.l7ghtbringer.edenmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.BurrierEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class BurrierRenderer extends GeoEntityRenderer<BurrierEntity> {
    public BurrierRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BurrierModel());
    }

    @Override
    public ResourceLocation getTextureLocation(BurrierEntity animatable) {
        return new ResourceLocation(EdenMod.MOD_ID, "textures/entity/burrier.png");
    }

    @Override
    public void render(BurrierEntity entity, float entityYaw, float partialTick, PoseStack poseStack,
                       MultiBufferSource bufferSource, int packedLight) {
        if(entity.isBaby()) {
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }

        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
