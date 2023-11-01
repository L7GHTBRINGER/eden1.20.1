package net.l7ghtbringer.edenmod.entity;



import net.l7ghtbringer.edenmod.EdenMod;
import net.l7ghtbringer.edenmod.entity.custom.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, EdenMod.MOD_ID);

    public static final RegistryObject<EntityType<SwamphagEntity>> SWAMPHAG =
            ENTITY_TYPES.register("swamphag",
                    () -> EntityType.Builder.of(SwamphagEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.0f)
                            .build(new ResourceLocation(EdenMod.MOD_ID, "swamphag").toString()));

    public static final RegistryObject<EntityType<GravehagEntity>> GRAVEHAG =
            ENTITY_TYPES.register("gravehag",
                    () -> EntityType.Builder.of(GravehagEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.0f)
                            .build(new ResourceLocation(EdenMod.MOD_ID, "gravehag").toString()));

    public static final RegistryObject<EntityType<BurrierEntity>> BURRIER =
            ENTITY_TYPES.register("burrier",
                    () -> EntityType.Builder.of(BurrierEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.0f)
                            .build(new ResourceLocation(EdenMod.MOD_ID, "burrier").toString()));

    public static final RegistryObject<EntityType<WightEntity>> WIGHT =
            ENTITY_TYPES.register("wight",
                    () -> EntityType.Builder.of(WightEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.0f)
                            .build(new ResourceLocation(EdenMod.MOD_ID, "wight").toString()));

    public static final RegistryObject<EntityType<ShroomhagEntity>> SHROOMHAG =
            ENTITY_TYPES.register("shroomhag",
                    () -> EntityType.Builder.of(ShroomhagEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.0f)
                            .build(new ResourceLocation(EdenMod.MOD_ID, "shroomhag").toString()));

    public static final RegistryObject<EntityType<CrimsonhagEntity>> CRIMSONHAG =
            ENTITY_TYPES.register("crimsonhag",
                    () -> EntityType.Builder.of(CrimsonhagEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.2f).fireImmune()
                            .build(new ResourceLocation(EdenMod.MOD_ID, "crimsonhag").toString()));

    public static final RegistryObject<EntityType<WarpedhagEntity>> WARPEDHAG =
            ENTITY_TYPES.register("warpedhag",
                    () -> EntityType.Builder.of(WarpedhagEntity::new, MobCategory.MONSTER)
                            .sized(1.0f, 2.0f).fireImmune()
                            .build(new ResourceLocation(EdenMod.MOD_ID, "warpedhag").toString()));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
