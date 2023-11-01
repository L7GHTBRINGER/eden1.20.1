package net.l7ghtbringer.edenmod;

import com.mojang.logging.LogUtils;
import net.l7ghtbringer.edenmod.block.ModBlocks;
import net.l7ghtbringer.edenmod.entity.ModEntities;
import net.l7ghtbringer.edenmod.entity.client.*;
import net.l7ghtbringer.edenmod.item.ModCreativeModTabs;
import net.l7ghtbringer.edenmod.item.ModItems;
import net.l7ghtbringer.edenmod.util.ModWoodTypes;
import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(net.l7ghtbringer.edenmod.EdenMod.MOD_ID)
public class EdenMod
{
    public static final String MOD_ID = "edenmod";
    private static final Logger LOGGER = LogUtils.getLogger();
    public EdenMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        ModCreativeModTabs.register(modEventBus);
        ModEntities.register(modEventBus);
        ModBlocks.register(modEventBus);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);






    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {
    }
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent

        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.GREATWOOD);

            EntityRenderers.register(ModEntities.SWAMPHAG.get(), SwamphagRenderer::new);
            EntityRenderers.register(ModEntities.GRAVEHAG.get(), GravehagRenderer::new);
            EntityRenderers.register(ModEntities.BURRIER.get(), BurrierRenderer::new);
            EntityRenderers.register(ModEntities.WIGHT.get(), WightRenderer::new);
            EntityRenderers.register(ModEntities.SHROOMHAG.get(), ShroomhagRenderer::new);
            EntityRenderers.register(ModEntities.CRIMSONHAG.get(), CrimsonhagRenderer::new);
            EntityRenderers.register(ModEntities.WARPEDHAG.get(), WarpedhagRenderer::new);


        }
    }
}
