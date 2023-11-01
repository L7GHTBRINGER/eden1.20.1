package net.l7ghtbringer.edenmod.event;




import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.ModEntities;
import net.l7ghtbringer.edenmod.entity.custom.*;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = EdenMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SWAMPHAG.get(), SwamphagEntity.setAttributes());
        event.put(ModEntities.GRAVEHAG.get(), GravehagEntity.setAttributes());
        event.put(ModEntities.BURRIER.get(), BurrierEntity.setAttributes());
        event.put(ModEntities.WIGHT.get(), WightEntity.setAttributes());
        event.put(ModEntities.SHROOMHAG.get(), ShroomhagEntity.setAttributes());
        event.put(ModEntities.CRIMSONHAG.get(), CrimsonhagEntity.setAttributes());
        event.put(ModEntities.WARPEDHAG.get(), WarpedhagEntity.setAttributes());
    }
}
